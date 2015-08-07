/**
 * Token信息统计
 */
//统计周期
var period = 'PERIOD';
var periodArray;
// 页面信息
var statisticsTokenUI = function() {
	var grid = new Datatable();
	//var validator = FormValidation.init();
	initDatePicker('0');
	$('#periodSearch').change(function() {
		var period = $(this).val();
		initDatePicker(period);
	});
	periodArray = Fields.getFields(period);
	Fields.initSelect(periodArray, $('#periodSearch'));
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
							url : ctx + '/statisticsToken/find'
						},
						'formSearch' : 'searchForm',
						"columnDefs" : [{
									'name' : 'STATISTICS_TIME',
									'orderable' : true,
									'width' : "20%",
									'targets' : [0]
								}, {
									'name' : 'TOKEN_CREATE_SUM_NUM',
									'orderable' : true,
									'width' : "40%",
									'targets' : [1]
								}, {
									'name' : 'TOKEN_DESTORY_SUM_NUM',
									'orderable' : true,
									'width' : "40%",
									'targets' : [2]
								}],
						'columns' : [{
									'title' : '统计时间',
									'field' : 'statisticsTime'
								}, {
									'title' : 'Token生成次数',
									'field' : 'tokenCreateSumNum',
									'fieldRender' : 'format'
									
								}, {
									'title' : 'Token销毁次数',
									'field' : 'tokenDestorySumNum',
									'fieldRender' : 'format'
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
					$("#periodSearch").val(0);
					$("#startDateSearch").val("");
					$("#endDateSearch").val("");
					$('#startDateSearch').datepicker('update', '');
					$('#endDateSearch').datepicker('update', '');
					$('#endDateSearch').datepicker('setStartDate', '');
					reload();
				});
		// 导出
		$("#export").click(function() {
			window.location.href = ctx + '/statisticsToken/export?period=' + $("#periodSearch").val() + 
									"&startDate=" + $("#startDateSearch").val() +
									"&endDate=" + $("#endDateSearch").val();
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

/**
 * 0-按日统计,1-按月统计,2-按季统计,3-按年统计
 * @param {} period
 */
function initDatePicker(period) {
	$('#startDateSearch').datepicker('update', '');
	$('#endDateSearch').datepicker('update', '');
	$('#startDateSearch').datepicker('remove');
	$('#endDateSearch').datepicker('remove');
	
	var format;
	var minViewMode;
	if('1'==period){
		format='yyyy-mm';
		minViewMode='months';
	} else if('2'==period || '3'==period){
		format='yyyy';
		minViewMode='years';
	} else {
		format='yyyy-mm-dd';
		minViewMode='days';
	}

	var startDate = new Date(1990,1,1);
	var now = new Date();
	now.setDate(now.getDate()-1);
	var checkout = $('#endDateSearch').datepicker({
				language: 'zh-CN',
				format: format,
				endDate: now,
				minViewMode : minViewMode
			}).on('changeDate', function(ev) {
				checkout.hide();
            	$('#endDateSearch').parent().find("span").hide();
			}).data('datepicker');
	var checkin = $('#startDateSearch').datepicker({
				language: 'zh-CN',
				format: format,
				endDate: now,
				minViewMode : minViewMode
			}).on('changeDate', function(ev) {
				startDate = new Date(ev.date);
				$('#endDateSearch').datepicker('setStartDate', startDate);
				//如果终止时间不存在或终止时间小于起始时间，则需要输入终止时间
				var endDate = $('#endDateSearch').datepicker('getDate');
				if(endDate=='Invalid Date' || endDate.valueOf() < startDate.valueOf()){
					$('#endDateSearch').datepicker('update', '');
					$('#endDateSearch')[0].focus();
				}
				checkin.hide();
            	$('#startDateSearch').parent().find("span").hide();
			}).data('datepicker');
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