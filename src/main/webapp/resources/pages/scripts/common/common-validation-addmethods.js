
(function( factory ) {
	if ( typeof define === "function" && define.amd ) {
		define( ["jquery", "./jquery.validate"], factory );
	} else {
		factory( jQuery );
	}
}(function( $ ) {

$.validator.addMethod("phone", function(value, element) {
	return this.optional(element) || /^1[3|4|5|8|][0-9]{9}$/.test(value);
}, "请输入正确的手机号");

$.validator.addMethod("userAccount", function(value, element) {
	return this.optional(element) || /^[a-zA-Z0-9]{5,16}$/.test(value);
}, "请输入有效的用户账号（5-16位数字或字母）");


$.validator.addMethod("userPass", function(value, element) {
	return this.optional(element) || /^[a-zA-Z0-9|!|@|#|$|%|^|&|*|.|_]{5,16}$/.test(value);
}, "密码只能包含数字字母和!@#$%^&*.特殊字符");

$.validator.addMethod("idCode", function(value, element) {
	return this.optional(element) || /^(\d{15}$|^\d{18}$|^\d{17}(\d|X|x))$/.test(value);
}, "请输入正确的身份证号");

$.validator.addMethod("userOF", function(value, element) {
	return this.optional(element) || /^0\d{2}-\d{8}|0\d{2}-\d{7}|0\d{3}-\d{7}|0\d{3}-\d{8}$/.test(value);
}, "请输入正确的办公电话");
}));

$.validator.addMethod("alphaNum", function(value, element) {
	return this.optional(element) || /^[a-zA-Z0-9]*$/.test(value);
}, "请输入数字或字母");

$.validator.addMethod("alphaNumDot", function(value, element) {
	return this.optional(element) || /^[a-zA-Z0-9\.]*$/.test(value);
}, "请输入数字、字母或.");

$.validator.addMethod("percent", function(value, element) {
	return this.optional(element) || /^(([1-9]\d{0,1})|0|100)(\.\d{1,2})?$/.test(value);
}, "请输入百分数");

