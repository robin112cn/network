/**
 * 信息管理
 */
var cmsInfomationUI = function(){
	var grid = new Datatable();
	// 创建列表页面中的表格
	var createTable = function(){
		grid.init({
			src : $("#grid"),
			onSuccess : function(grid){
			},
			onError : function(grid) {
			},
			onDataLoad : function(grid){
				// execute some code on ajax data load
				$(".delete").click(function() {
					if (!confirm("是否删除该信息？")) {
						return false;
					}
					var infoId = $(this).attr("name");
					$.ajax({
						type : "POST",
						url : ctx + "/cmsInformation/delete",
						data : {
							infoId : infoId
						},
						dataType : "json",
						success : function(data) {
							toastr['success'](data.msg, "系统提示");
							cmsInfomationUI.callback();
						},
						error : function(data) {
							toastr['error'](data.msg,
									"系统提示");
						}
					});
				});

				$(".update").click(function() {
					var infoId = $(this).attr("name");
					var url = ctx + "/cmsInformation/showEdit?menu_id=2000_1&infoId="+infoId;
					location.href = url;
				});

				$(".deploy").click(function() {
					if (!confirm("是否发布该信息？")) {
						return false;
					}
					var infoId = $(this).attr("name");
					$.ajax({
						type : "POST",
						url : ctx + "/cmsInformation/deploy",
						data : {
							infoId : infoId
						},
						dataType : "json",
						success : function(data) {
							toastr['success'](data.msg, "系统提示");
							cmsInfomationUI.callback();
						},
						error : function(data) {
							toastr['error'](data.msg,
									"系统提示");
						}
					});
				});
				
				resizeTree();
			},
			loadingMessage : 'Loading...',
			dataTable :{
				"bStateSave" : true,
				"lengthMenu" : [[10, 20, 30], [10, 20, 30]],
				"pageLength" : 10,
				"ajax" : {"url" : ctx + "/cmsInformation/find"},
				"formSearch":'searchForm',
				"columnDefs" :[
					{'name':'LONG_TITLE','orderable' : true,'targets' : [0]}
					,{'name':'CREATE_TIME','orderable' : true,'targets' : [1]}
					,{'name':'INFO_STATUS','orderable' : true,'targets' : [2]}
					,{'name':'DEPLOY_TIME','orderable' : true,'targets' : [3]}
					,{'orderable' : false,'targets' : [4]}
				],
				"columns":[{"title":"长标题","field":"longTitle"}, {"title":"创建时间","field":"createTime"}, {"title":"信息状态","field":"infoStatus",fieldRender:"getInfoStatus"}
					, {"title":"发布时间","field":"deployTime"},{"title":"操作","field":"infoId",fieldRender:"getPremission"}
				],
				"order" : [[3, "asc"]]
			}
		});
	};
	// 查询
	var search = function(){
		$("#search").click(function(e) {
			e.preventDefault();
			grid.getDataTable().ajax.reload();
			grid.clearAjaxParams();
			resizeTree();
		});
	}
	// 重置
	var reload = function() {
		grid.getDataTable().ajax.reload();
		grid.clearAjaxParams();
		resizeTree();
	}

	// 根据右边的portalBody对应调整树的body高度
	var resizeTree = function() {
		var treeHeight = $("#tabBd").height();
		$("#treeBd").height(treeHeight);
		$(".scroller").height(treeHeight);
		$(".slimScrollDiv").height(treeHeight);
	}

	// 激活控件
	var activeBootstrapControls = function(){
		// 提示控件配置
		var toastr_options = {"closeButton" : true,"debug" : false,"positionClass" : "toast-top-center","onclick" : null,
			"showDuration" : "1000","hideDuration" : "1000","timeOut" : "3000","extendedTimeOut" : "1000","showEasing" : "swing",
			"hideEasing" : "linear","showMethod" : "fadeIn","hideMethod" : "fadeOut"
		}
		toastr.options = toastr_options;
		// form校验
		// 新增
		$('#create').click(function(){
			$('#listedCompanyModal').modal('show');
		});
		// init时清除搜索栏内容
		var $searchFrom = $('#searchForm');
    	// 加载searchForm的查询项
    	$searchFrom.find("input,select").each(function() {
    		$(this).val("");
        });
	}

	handzTreeColumns = function(cols) {
		for(var i = 0 ;i<cols.length;i++){
			var node = '';
			if(cols[i].parentId == '-'){
				node = {
						id:cols[i].columnId,
						pId:1,
						name:cols[i].columnName,
						open:true,
						t:cols[i].columnName,
						click:"clickColumnTree('"+cols[i].columnId+"','"+cols[i].columnName+"');"
					};

			}else{
				node = {
						id:cols[i].columnId,
						pId:cols[i].parentId,
						name:cols[i].columnName,
						open:false,
						t:cols[i].columnName,
						click:"clickColumnTree('"+cols[i].columnId+"','"+cols[i].columnName+"');"
						};

			}
			zNodes.push(node);
		}
	}

	return {
		init:function(){
			// 激活控件
			activeBootstrapControls();
			// 创建表格
			createTable();
			// 查询
			search();
		},
		callback:function(){
			reload();
		},
		handzTreeData : function(cols) {
			handzTreeColumns(cols);
		},
		zTreeInit: function() {

			jQuery.fn.zTree.init($("#zTreeDemo"), setting, zNodes);
			zTree = jQuery.fn.zTree.getZTreeObj("zTreeDemo");
			var node = zTree.getNodeByParam("id","000000");
	    	zTree.selectNode(node);
		}
	}
}();

function getInfoStatus(data){
	if(data == "00"){
		return "新建";
	}
	if(data == "01"){
		return "发布";
	}
	if(data == "FF"){
		return "删除";
	}
}

// ztree内容
var zTree;
var setting = {
	  	data: {
		 	key: { title:"t"},
	  	 	simpleData: { enable: true }
		},
		view: {
	  	 	dblClickExpand: false,
	  	 	showLine: true,
	  	 	selectedMulti: false
		},
	  	 callback: {
			beforeClick: beforeClick
	  	 }
};
var zNodes =[];

// 禁止选中根据节点设为false
function beforeClick(treeId, treeNode) {
	return true;
}

function clickColumnTree(treeId, treeName) {
	$("#columnIdSearch").val(treeId);
	cmsInfomationUI.callback();
}
/* 刷新栏目列表 */
var reDoFlag = 0;// 防止同时多次点击刷新
var getFinish = 0;// 请求数据完成标识
function refreshColumn(){
	if(reDoFlag != 0)  return;
	reDoFlag = 1;
	getFinish = 1;
	jQuery.ajax({
   		type: "POST",
   		url:  ctx + "/cmsInformation/refreshColumnAjax",
   		async : false,
   		success : function(data){
   			if(data != undefined){
   				var zNodes = [];
   			 	$.each(data, function(i, obj) {
   			 		var node = "";
	   			 	if(obj.parentId == '-'){
						node = {
								id:obj.columnId,
								pId:1,
								name:obj.columnName,
								open:true,
								t:obj.columnName,
								click:"clickColumnTree('"+obj.columnId+"','"+obj.columnName+"');"
							};

					}else{
						node = {
								id:obj.columnId,
								pId:obj.parentId,
								name:obj.columnName,
								open:true,
								t:obj.columnName,
								click:"clickColumnTree('"+obj.columnId+"','"+obj.columnName+"');"
								};

					}
	                zNodes.push(node);
   			 	});
				var selectedNodeId = "";
				if(zTree.getSelectedNodes()[0]){
					selectedNodeId = zTree.getSelectedNodes()[0].id;
				}
				jQuery.fn.zTree.init($("#zTreeDemo"), setting, zNodes);
               	zTree = jQuery.fn.zTree.getZTreeObj("zTreeDemo");
               	if(selectedNodeId != ""){ // 刷新之后保持之前节点的选中状态。
               		var node = zTree.getNodeByParam("id", selectedNodeId);
                   	zTree.selectNode(node);
               	}
               	reDoFlag = 0;
       		}else{
       			toastr['error']('刷新栏目列表失败', "系统提示");
       			reDoFlag = 0;
       		}
   		},
   		failure  : function(data){
   			reDoFlag = 0;
   		}
   	});
}