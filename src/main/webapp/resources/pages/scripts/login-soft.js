var Login = function () {

	var handleLogin1 = function() {
		$('#loginForm1').validate({
	            errorElement: 'span', //default input error message container
	            errorClass: 'help-block', // default input error message class
	            focusInvalid: false, // do not focus the last invalid input
	            rules: {
	                username: {
	                    required: true
	                },
	                password: {
	                    required: true
	                }
	            },

	            messages: {
	                username: {
	                    required: "用户名不能为空."
	                },
	                password: {
	                    required: "密码不能为空."
	                }
	            },

	            invalidHandler: function (event, validator) { //display error alert on form submit
	                $('.alert-danger', $('#loginForm1')).show();
	            },

	            highlight: function (element) { // hightlight error inputs
	                $(element)
	                    .closest('.form-group').addClass('has-error'); // set error class to the control group
	            },

	            success: function (label) {
	                label.closest('.form-group').removeClass('has-error');
	                label.remove();
	            },

	            errorPlacement: function (error, element) {
	                error.insertAfter(element.closest('.input-icon'));
	            },

	            submitHandler: function (form) {
	            	first = true;
	                form.submit();
	            }
	        });

	        /*$('#loginForm1 input').keypress(function (e) {
	            if (e.which == 13) {
	                if ($('#loginForm1').validate().form()) {
	                    $('#loginForm1').submit();
	                }
	                return false;
	            }
	        });*/
	}
	
	var handleLogin2 = function() {
		$('#loginForm2').validate({
	            errorElement: 'span', //default input error message container
	            errorClass: 'help-block', // default input error message class
	            focusInvalid: false, // do not focus the last invalid input
	            rules: {
	                username: {
	                    required: true
	                },
	                password: {
	                    required: true
	                }
	            },

	            messages: {
	                username: {
	                    required: "用户名不能为空."
	                },
	                password: {
	                    required: "密码不能为空."
	                }
	            },

	            invalidHandler: function (event, validator) { //display error alert on form submit
	                $('.alert-danger', $('#loginForm2')).show();
	            },

	            highlight: function (element) { // hightlight error inputs
	                $(element)
	                    .closest('.form-group').addClass('has-error'); // set error class to the control group
	            },

	            success: function (label) {
	                label.closest('.form-group').removeClass('has-error');
	                label.remove();
	            },

	            errorPlacement: function (error, element) {
	                error.insertAfter(element.closest('.input-icon'));
	            },

	            submitHandler: function (form) {
	            	first = true;
	                form.submit();
	            }
	        });

	        /*$('#loginForm1 input').keypress(function (e) {
	            if (e.which == 13) {
	                if ($('#loginForm2').validate().form()) {
	                    $('#loginForm2').submit();
	                }
	                return false;
	            }
	        });*/
	}
	
	var handleLogin3 = function() {
		$('#loginForm3').validate({
	            errorElement: 'span', //default input error message container
	            errorClass: 'help-block', // default input error message class
	            focusInvalid: false, // do not focus the last invalid input
	            rules: {
	                username: {
	                    required: true
	                },
	                password: {
	                    required: true
	                }
	            },

	            messages: {
	                username: {
	                    required: "用户名不能为空."
	                },
	                password: {
	                    required: "密码不能为空."
	                }
	            },

	            invalidHandler: function (event, validator) { //display error alert on form submit
	                $('.alert-danger', $('#loginForm3')).show();
	            },

	            highlight: function (element) { // hightlight error inputs
	                $(element)
	                    .closest('.form-group').addClass('has-error'); // set error class to the control group
	            },

	            success: function (label) {
	                label.closest('.form-group').removeClass('has-error');
	                label.remove();
	            },

	            errorPlacement: function (error, element) {
	                error.insertAfter(element.closest('.input-icon'));
	            },

	            submitHandler: function (form) {
	            	first = true;
	                form.submit();
	            }
	        });

	        /*$('#loginForm3 input').keypress(function (e) {
	            if (e.which == 13) {
	                if ($('#loginForm3').validate().form()) {
	                    $('#loginForm3').submit();
	                }
	                return false;
	            }
	        });*/
	}
	
	var handleKeyEnter = function () {
		$('body').keypress(function (e) {
            if (e.which == 13) {
            	if(!$("#tab_1").is(":hidden")){
                  if ($('#loginForm1').validate().form()) {
	                  $('#loginForm1').submit();
	              }
            	}
            	if(!$("#tab_2").is(":hidden")){
                    if ($('#loginForm2').validate().form()) {
  	                  $('#loginForm2').submit();
  	              }
              	}
            	if(!$("#tab_3").is(":hidden")){
                    if ($('#loginForm3').validate().form()) {
  	                  $('#loginForm3').submit();
  	              }
              	}
            	

                return false;
            }
        });
	}

	var handleForgetPassword = function () {
		$('.forget-form').validate({
	            errorElement: 'span', //default input error message container
	            errorClass: 'help-block', // default input error message class
	            focusInvalid: false, // do not focus the last invalid input
	            ignore: "",
	            rules: {
	                email: {
	                    required: true,
	                    email: true
	                }
	            },

	            messages: {
	                email: {
	                    required: "Email is required."
	                }
	            },

	            invalidHandler: function (event, validator) { //display error alert on form submit

	            },

	            highlight: function (element) { // hightlight error inputs
	                $(element)
	                    .closest('.form-group').addClass('has-error'); // set error class to the control group
	            },

	            success: function (label) {
	                label.closest('.form-group').removeClass('has-error');
	                label.remove();
	            },

	            errorPlacement: function (error, element) {
	                error.insertAfter(element.closest('.input-icon'));
	            },

	            submitHandler: function (form) {
	                form.submit();
	            }
	        });

	        $('.forget-form input').keypress(function (e) {
	            if (e.which == 13) {
	                if ($('.forget-form').validate().form()) {
	                    $('.forget-form').submit();
	                }
	                return false;
	            }
	        });

	        jQuery('#forget-password').click(function () {
	            jQuery('.login-form').hide();
	            jQuery('.forget-form').show();
	        });

	        jQuery('#back-btn').click(function () {
	            jQuery('.login-form').show();
	            jQuery('.forget-form').hide();
	        });

	}

	var handleRegister = function () {

//		function format(state) {
//            if (!state.id) return state.text; // optgroup
//            return "&nbsp;&nbsp;" + state.text;
//        }
//
//
//		$("#select2_sample4").select2({
//		  	placeholder: '<i class="fa fa-map-marker"></i>&nbsp;选择用户类型',
//            allowClear: true,
//            formatResult: format,
//            formatSelection: format,
//            escapeMarkup: function (m) {
//                return m;
//            }
//        });

//			$('#select2_sample4').change(function () {
//                $('.register-form').validate().element($(this)); //revalidate the chosen dropdown value and show error or success message for the input
//            });

		

         $('.register-form').validate({
	            errorElement: 'span', //default input error message container
	            errorClass: 'help-block', // default input error message class
	            focusInvalid: false, // do not focus the last invalid input
	            ignore: "",
	            rules: {

	               /* fullname: {
	                    required: true
	                },*/
	                email: {
	                    required: true,
	                    email: true
	                },
	                /*address: {
	                    required: true
	                },
	                city: {
	                    required: true
	                },
	                country: {
	                    required: true
	                },*/

	                username: {
	                    required: true
	                },
	                password: {
	                    required: true
	                },
	                rpassword: {
	                    equalTo: "#register_password"
	                },

	               /* tnc: {
	                    required: true
	                }*/
	            },

	            messages: { // custom messages for radio buttons and checkboxes
	                tnc: {
	                    required: "Please accept TNC first."
	                }
	            },

	            invalidHandler: function (event, validator) { //display error alert on form submit

	            },

	            highlight: function (element) { // hightlight error inputs
	                $(element)
	                    .closest('.form-group').addClass('has-error'); // set error class to the control group
	            },

	            success: function (label) {
	                label.closest('.form-group').removeClass('has-error');
	                label.remove();
	            },

	            errorPlacement: function (error, element) {
	                if (element.attr("name") == "tnc") { // insert checkbox errors after the container
	                    error.insertAfter($('#register_tnc_error'));
	                } else if (element.closest('.input-icon').size() === 1) {
	                    error.insertAfter(element.closest('.input-icon'));
	                } else {
	                	error.insertAfter(element);
	                }
	            },

	            submitHandler: function (form) {
	                form.submit();
	            }
	        });

			$('.register-form input').keypress(function (e) {
	            if (e.which == 13) {
	                if ($('.register-form').validate().form()) {
	                    $('.register-form').submit();
	                }
	                return false;
	            }
	        });

	        jQuery('#register-btn').click(function () {
//	            jQuery('.login-form').hide();
	            jQuery('.tabbable-custom').hide();
	            jQuery('.register-form').show();
	        });

	        jQuery('#register-back-btn').click(function () {
//	            jQuery('.login-form').show();
	            jQuery('.tabbable-custom').show();
	            jQuery('.register-form').hide();
	        });
	}

	var handleNetworkTabs = function () {
		//初始隐藏tab2,3
		$("#tab_1").show();
		$("#tab_2").hide();
		$("#tab_3").hide();
		
		jQuery('#li_a_1').click(function () {
			$("#tab_1").show();
			$("#tab_2").hide();
			$("#tab_3").hide();
        });
		
		jQuery('#li_a_2').click(function () {
			$("#tab_1").hide();
			$("#tab_2").show();
			$("#tab_3").hide();
        });
		
		jQuery('#li_a_3').click(function () {
			$("#tab_1").hide();
			$("#tab_2").hide();
			$("#tab_3").show();
        });
		
	}
	
    return {
        //main function to initiate the module
        init: function () {

            handleLogin1();
            handleLogin2();
            handleLogin3();
            handleNetworkTabs();
            handleKeyEnter();
           // handleForgetPassword();
            handleRegister();
        }

    };

}();
