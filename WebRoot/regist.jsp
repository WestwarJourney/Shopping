<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>用户注册页面</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="stylesheet" type="text/css" href="css/regist.css">
<script type="text/javascript" src="js/jquery-1.12.4.js"></script>

  </head>
  
  <body>
    <header></header>
    <div id="logo">
    	<h1>欢迎注册XX超市会员</h1>
    </div>
    <div id="formdiv">
    	<form action="regist.do" method="post" >
    		<div id="userinfo">
    			用户名：<input type="text" name="uname" required placeholder="请输入用户名" onblur="yname()" /><span></span><br/>
    			密码：<input type="password" name="password1" placeholder="请输入密码"/><span></span><br/>
    			再次输入密码：<input type="password" name="password2" onblur="ypassword()" placeholder="请再次输入密码"/><span></span><br/>
    			手机号：<input type="text" name="phoneno" placeholder="请输入手机号码"/><span></span><br/>
    			<select id="question1" name="q1">
    				<option value="1">您最喜欢的电影是哪部？</option>
   					<option value="2">您最喜欢的音乐是哪首？</option>
   					<option value="3">您最喜欢的游戏是什么？</option>
    				<option value="4">您小学的班主任是谁？</option>
    				<option value="5">您初中的班主任是谁？</option>
   					<option value="6">您高中的班主任是谁？</option>
    				<option value="7">您使用的手机型号？</option>
    				<option value="8">您使用的电脑型号？</option>
    				<option value="9">您使用的平板型号？</option>
   				</select>
   				<input type="text" name="answer1"/>
   			</div>
   			<input type="submit" value="立即注册"/>
       	</form>
    </div>
    <footer></footer>
    <script type="text/javascript">
		function yname(){
			var name=$("input[name='uname']").val();
			if(name==null||name.length<=0){
				$("input[name='uname']").next().html("用户名不能为空");
				$("input[name='uname']").add("disabled");
			}else{
				$.ajax({
				url:"yuname.do",
				type:"get",
				data:{"name":name},
				dataType:"text",
				success:function(result){
					if(result=="unameOK"){
						$("input[name='uname']").next().html("用户已注册");
					}else if(result=="unameNotOK"){
						$("input[name='uname']").next().html("可以使用");
					}else if(result=="noname"){
						$("input[name='uname']").next().html("用户名不能为空");
						
					}
				},
				error:function(){
					alert("报错了");
				}
			});
			}
		}
		function ypassword(){
			var password1=$("input[name='password1']").val();
			var password2=$("input[name='password2']").val();
			$.ajax({
				url:"ypassword.do",
				type:"post",
				data:{"password1":password1,"password2":password2},
				dataType:"text",
				success:function(result){
					if(result=="passwordOK"){
						$("input[name='password2']").next().html("可以使用");
					}else{
						$("input[name='password2']").next().html("两次密码不相同");
					}
				},
				error:function(){
					alert("报错了");
				}
			});
		}
	</script>
  </body>
</html>
