<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>请注册！</title>
</head>
<body bgcolor="#CCCCCC">
	<form name="f5" method="post" action="register">
		<table align="center">
			<tr>
				<td align="center"><font face="Verdana" size="+1"> 用户注册
				</font></td>
			</tr>
		</table>
		<br>
		<table align="center" border="1" bordercolor="black"  cellpadding="3"
			cellspacing="3">
			<tr>
				<td>姓名</td>
				<td><input type="text" value="" size="20" maxlength="20"
					name="uname" id="uname" /></td>
			</tr>
			<tr>
				<td>密码</td>
				<td><input type="password" size="20" maxlength="20"
					name="password" /></td>
			</tr>
			<tr>
				<td>邮编</td>
				<td><input type="text" size="20" maxlength="20" name="zip" /></td>
			</tr>
			<tr>
				<td>地址</td>
				<td><input type="text" size="20" maxlength="20" name="address" /></td>
			</tr>
			<tr>
				<td>电话</td>
				<td><input type="text" size="20" maxlength="20"
					name="phonenumber" /></td>
			</tr>
			<tr>
				<td>电子信箱</td>
				<td><input type="text" size="20" maxlength="20" name="email" id="email"/></td>
			</tr>
		</table>
		<br>
		<center>
			<input type="submit" id='btn' name='btn' value="注册"> &nbsp; <input type="reset" value="重置">
		</center>
	</form>
</body>

</html>