function aa() {
	var loginname = $("#userid").val();
	var pwd = $("#pwd").val();
	var pwd2 = $("#pwd2").val();
	var userjob = $("#userjob").val();
	// var file = $("#file").val();
	// var age = $("#age").val();
	var phone=$("#userphone").val();
	var adress=$("#useraddress").val();
	var src=/^(13[0-9]|14[0-9]|15[0-9]|16[0-9]|17[0-9]|18[0-9]|19[0-9])\d{8}$/;
	var bag=/^(?:[1-9]?\d|100)$/;

	if (loginname == null || 0 == loginname) {
		document.getElementById("yhm").innerHTML="用户名不能为空!";
		return false;
	}
	if (pwd == null || 0 == pwd) {
		document.getElementById("mima").innerHTML="密码不能为空!";
		return false;
	} else if (!(pwd.length >= 6)) {
		document.getElementById("mima").innerHTML="密码至少6位字符";
		return false;
	} else {
		if (pwd2 != pwd) {
			document.getElementById("mima").innerHTML="两次密码不一致";
			return false;
		}
	}
	if (userjob == null || 0 == userjob) {
		document.getElementById("ujob").innerHTML="职业不能为空!";
		return false;
	}
	/*if (age == null || 0 == age) {
		document.getElementById("agets").innerHTML="年龄不能为空";
		return false;
	} else
		{
		if(!bag.test(age)){
			document.getElementById("agets").innerHTML="年龄格式不正确";
			return false;
		}
		}*/
	if (phone == null || 0 == phone) {
		document.getElementById("phonets").innerHTML="手机号不能为空";
		return false;
	} else{
		if(!src.test(phone)){
			document.getElementById("phonets").innerHTML="电话号码格式不正确，以13开头的11位数字";
			return false;
		}
	}
	if (adress == null || 0 == adress) {
		document.getElementById("adressts").innerHTML="地址不能为空";
		return false;
	}


	if(document.getElementById("file").value==""){
		document.getElementById("files").innerHTML = "请选择文件!";
		return false;
	}




	return true;
}



