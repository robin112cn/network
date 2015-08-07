/**
 * 信息管理
 */
var cmsTemplateUI = function(){
	var grid = new Datatable();
	// 创建列表页面中的表格
	var createTable = function(){
		grid.init({
			src : $("#grid"),
			onSuccess : function(grid){},
			onError : function(grid) {},
			onDataLoad : function(grid){
				// 生成静态页面
				$('.generate').click(function() {
					var templateId = $(this).attr("name");
	    			$.ajax({
	    				type : "POST",
	    				url : ctx + "/cmsTemplate/generate",
	    				data : {
	    					templateId :templateId
	    				},
	    				dataType : "json",
	    				success : function(data) {
	    					if(data.success){
	    						toastr['success'](data.msg, "系统提示");
	    					}else{
	    						toastr['error'](data.msg, "系统提示");
	    					}
	    				}
	    			});
	    		});
				// 预览
				$('.preview').click(function() {
					var templateId = $(this).attr("name");
	    			$.ajax({
	    				type : "POST",
	    				url : ctx + "/cmsTemplate/preview",
	    				data : {
	    					templateId : templateId
	    				},
	    				async:false,
	    				dataType : "json",
	    				success : function(data) {
	    					if(data.success){
	    						window.open(ctx+data.msg+"?preview="+new Date().getTime(),'_blank');
	    					}else{
	    						toastr['error'](data.msg, "系统提示");
	    					}
	    				}
	    			});
	    		});
			},
			loadingMessage : 'Loading...',
			dataTable :{
				"bStateSave" : true,
				"lengthMenu" : [[10, 20, 30], [10, 20, 30]],
				"pageLength" : 10,
				"ajax" : {"url" : ctx + "/cmsTemplate/find"},
				"formSearch":'searchForm',
				"columnDefs" :[
					{'name':'TEMPLATE_NAME','orderable' : true,'targets' : [0]}
					,{'name':'TEMPLATE_COLUMNS','orderable' : true,'targets' : [1]}
					,{'name':'TEMPLATE_FILE_URL','orderable' : true,'targets' : [2]}
					,{'name':'TEMPLATE_STATUS','orderable' : true,'targets' : [3]}
					,{'orderable' : false,'targets' : [4]}
				],
				"columns":[{"title":"模板名称","field":"templateName"}, {"title":"模板栏目","field":"templateColumns"}, {"title":"模板路径","field":"templateFileUrl"}
					, {"title":"模板状态","field":"templateStatus"},{"title":"操作","field":"templateId",fieldRender:"getPremission"}
				],
				"order" : [[0, "asc"]]
			}
		});
	};
	// 查询
	var search = function(){
		$("#search").click(function(e) {
			e.preventDefault();
			grid.getDataTable().ajax.reload();
			grid.clearAjaxParams();
		});
	}
	// 重置
	var reload = function() {
		grid.getDataTable().ajax.reload();
		grid.clearAjaxParams();
	}
	// 激活控件
	var activeBootstrapControls = function(){
		// 提示控件配置
		var toastr_options = {"closeButton" : true,"debug" : false,"positionClass" : "toast-top-center","onclick" : null,
			"showDuration" : "1000","hideDuration" : "1000","timeOut" : "3000","extendedTimeOut" : "1000","showEasing" : "swing",
			"hideEasing" : "linear","showMethod" : "fadeIn","hideMethod" : "fadeOut"
		}
		toastr.options = toastr_options;
		// 
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
		}
	}
}();