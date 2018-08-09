var basePath = "http://localhost:9091/";
$('#login_submit').click(function () {
  /** 获取邮箱和密码*/
  var email = $('#inputEmail').val();
  var password = $('#inputPassword').val();
  alert(email+"=="+password);
  /** 发送ajax请求到后台*/
  alert(basePath + "client/login");
  $.ajax({
    type: "POST",
    url: basePath + "client/login",
    data: {
      email: email,
      password: password
    },
    async: false,
    datatype: "json",
    success: function (data) {
      alert("处理成功");
    }
  });
});
