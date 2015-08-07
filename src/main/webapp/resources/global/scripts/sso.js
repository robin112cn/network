function checkCasLogin(){
	var param = {'username':'','password':'','_eventId':"submit"};
	loginSubmit(param,1);

}

function loginSubmit(param,type){
	var cfg = buildConfig();

	cfg.success = function (json) {
		if(json.actionErrors&&json.actionErrors.length!=0){
			alert(json.actionErrors);

		} else{
			param.lt = json.loginTicket;
			param.execution=json.flowExecutionKey;
			doLogin(param,type);
		}
	};

	$.ajax(cfg);

}


function doLogin(param,type){
	var cfg = buildConfig();
	cfg.success = function (json) {
		if(json.actionErrors&&json.actionErrors.length!=0){
//			alert(json.actionErrors);
			 //跳转到logout
		    var logoutUrl = ctx + '/logout';
		    location.href = logoutUrl;
		}else{
			//alert("登录成功！");
			 //跳转到logout
//			var name = $("#username").val();
//    		var pass = $("#password").val();
//    		var auth = hex_md5(name+"_"+pass).toLowerCase();
			if(type != '1'){
				var name = json.username;
				var auth = json.authinfo;
			    var logOnUrl = ctx + "/ssologin?username="+name+"&auth="+auth;
			   //alert(logOnUrl);
			    location.href = logOnUrl;
			    //alert(json);
			}

		}
	};

	cfg.complete =function(XMLHttpRequest, textStatus){
		//完成请求
		//alert("XMLHttpRequest : " + XMLHttpRequest);
		//alert("textStatus : " + textStatus);
	};

	cfg.error =function(xhr){
		//alert("xhr : " + xhr);
	};

	cfg.data = param;
	$.ajax(cfg);
}

function buildConfig(){
	return {
		async:false,
		url: ssoserver + "/loginByAjax",
		type: "GET",
		dataType: 'jsonp',
		jsonp: 'jsonCallback',
		timeout: 5000,
		beforeSend: function(){
			//jsonp方式, 此方法不被触发.
		},
		success: function (json) {
			//客户端jquery预先定义好的callback函数,成功获取跨域服务器上的json数据后,会动态执行这个callback函数
		},
		complete: function(XMLHttpRequest, textStatus){
			//完成请求
		},
		error: function(xhr){
			//jsonp方式, 此方法不被触发.
		}
	};
}

jQuery(document).ready(function() {
	//alert("check sso status");
	checkCasLogin();
});