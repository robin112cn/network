/**
 * TOKEN信息
 */
var tokenFlag = 'TOKEN_FLAG';
var tokenFlagArray;
// 页面信息
var tokenInfoUI = function() {
	var grid = new Datatable();
	//var validator = FormValidation.init();
	tokenFlagArray = Fields.getFields(tokenFlag);
	// 创建表格
	var createTable = function() {
		grid.init({
					src : $("#grid"),
					onSuccess : function(grid) {
						// execute some code after table records loaded
					},
					onError : function(grid) {
						// execute some code on network or other general error
					},
					onDataLoad : function(grid) {
					},
					loadingMessage : 'Loading...',
					dataTable : {
						'bStateSave' : true,
						'lengthMenu' : [[10, 20, 30], [10, 20, 30] // change
						// per
						// page
						// values
						// here
						],
						'pageLength' : 10,
						'ajax' : {
							url : ctx + '/tokenManage/find'
						},
						'formSearch' : 'searchForm',
						"columnDefs" : [{
									'name' : 'TOKEN_ID',
									'orderable' : true,
									'width' : "125px",
									'targets' : [0]
								}, {
									'name' : 'TR_ID',
									'orderable' : true,
									'width' : "80px",
									'targets' : [1]
								}, {
									'name' : 'BIN',
									'orderable' : true,
									'width' : "10%",
									'targets' : [2]
								}, {
									'name' : 'PAN',
									'orderable' : true,
									'targets' : [3]
								}, {
									'name' : 'INVALID_TIME',
									'orderable' : true,
									'width' : "105px",
									'targets' : [4]
								}, {
									'name' : 'TRADE_SUM_TIMES',
									'orderable' : true,
									'width' : "90px",
									'targets' : [5]
//								}, {
//									'name' : 'TRADE_SUM_MONEY',
//									'orderable' : true,
//									'width' : "100px",
//									'targets' : [6]
								}, {
									'name' : 'TOKEN_LEVEL',
									'orderable' : true,
									'width' : "91px",
									'targets' : [6]
								}, {
									'name' : 'TOKEN_FLAG',
									'orderable' : true,
									'width' : "52px",
									'targets' : [7]
								}],
						'columns' : [{
									'title' : 'Token编号',
									'field' : 'tokenId'
								}, {
									'title' : 'TR编号',
									'field' : 'trId'
								}, {
									'title' : 'BIN码',
									'field' : 'bin'
								}, {
									'title' : 'PAN码',
									'field' : 'pan'
								}, {
									'title' : '失效日期',
									'field' : 'invalidTime'
								}, {
									'title' : '交易累计次数',
									'field' : 'tradeSumTimes',
									'fieldRender' : 'format'
//								}, {
//									'title' : '交易累计金额(元)',
//									'field' : 'tradeSumMoney',
//									'fieldRender' : 'format'
								}, {
									'title' : 'TOKEN授信级别',
									'field' : 'tokenLevel'
								}, {
									'title' : 'Token状态',
									'field' : 'tokenFlag',
									'fieldRender' : 'showTokenFlag'
								}],
						'order' : [[0, "asc"]]
					}
				});
	};
	// 查询
	var search = function() {
		$("#search").click(function(e) {
					e.preventDefault();
					grid.getDataTable().ajax.reload();
					grid.clearAjaxParams();
				});
	};
	// 重置
	var reload = function() {
		grid.getDataTable().ajax.reload();
		grid.clearAjaxParams();
	};
	// 激活bootstrap控件相关功能
	var activeBootstrapControls = function() {
		// 提示控件配置
		var options = {
			"closeButton" : true,
			"debug" : false,
			"positionClass" : "toast-top-center",
			"onclick" : null,
			"showDuration" : "1000",
			"hideDuration" : "1000",
			"timeOut" : "3000",
			"extendedTimeOut" : "1000",
			"showEasing" : "swing",
			"hideEasing" : "linear",
			"showMethod" : "fadeIn",
			"hideMethod" : "fadeOut"
		};
		toastr.options = options;
		// 重置
		$("#reset").click(function() {
					$("#panSearch").val("");
					$("#binSearch").val("");
					$("#trIdSearch").val("");
					reload();
				});
	};
	return {
		init : function() {
			// 激活bootstrap控件相关功能
			activeBootstrapControls();
			// 创建表格
			createTable();
			//
			search();
		},
		callback : function() {
			reload();
		}
	};
}();

function showTokenFlag(val) {
	return Fields.showDisplay(tokenFlagArray, val);
}

/**
 * 因为后台传递到前台的数字0被自动转换为空
 * 将''还原为数字0
 * @param {} val
 * @return {String}
 */
function format(val) {
	if (val.length == 0) {
		return "0";
	} else {
		return val;
	}
}