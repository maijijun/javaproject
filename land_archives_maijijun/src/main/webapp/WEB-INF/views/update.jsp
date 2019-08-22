<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body bgcolor="#CCCCCC">
	<form action=updatefiles method="post">
		分类号：<input type="text" name='flh' value='C4.2' readonly="readonly"><br>
		<br> 土地号:<input type="text" name='tdh'><br>
		<br> 面积：<input type="text" name='mj'><br>
		<br> 类型：<select name="lx"><option value="国有">国有</option>
		<option value="个人所有">个人所有</option>
		<option value="集体所有">集体所有</option>
		</select><br>
		<br> 土地用途： <input type="text" name='tdyt'><br>
		<br> 拥有者：<input type="text" name='yyz'><br>
		<br> 位置：<input type="text" name='wz'><br>
		<br> 开始使用时间：<input type="text" name='kssysj'><br>
		<br> 备注：<input type="text" name='bz'><br>
		<br> 内容：
		<textarea cols='50' rows='10' name='nr'></textarea>
		<br> <input type="submit" value="提交">
		<input type="reset" values="重置">
	</form>
</body>
</html>