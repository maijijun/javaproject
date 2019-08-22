<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#CCCCCC">
	<form method="post" action="findfiles">
		<center>
			<tr>
		${message1}		
				<td>请输入要查询的土地号</td>
				<input type="text" name="tudi" />
				<input type="submit" value="确定" />
				<input type="reset" value="重置" />
			</tr>

		</center>
		
</body>
</form>
</html>