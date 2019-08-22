<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script>
	function del(){
		var truthBeTold = window.confirm("单击“确定”，确定删除。单击“取消”，取消删除。");
		if (truthBeTold) {
			document.form1.action="delfiles";
			document.form1.submit();
			window.alert("删除成功");
			} 
		else  window.alert("您选择了取消");}
	
</script>
</head>
<body bgcolor="#CCCCCC">
<form action="update1.jsp" method="post" name="form1">
	分类号：${files.pid }
	<br> 土地号：${files.gnum }
	<br> 面积： ${files.squre }
	<br> 类型：${files.type }
	<br> 土地用途：${files.usedfor }
	<br> 拥有者：${files.people }
	<br> 位置：${files.location }
	<br> 开始使用时间：${files.whenuse }
	<br> 备注：${files.remark }
	<br> 内容：${files.content }<br>
	</font>
<!--	<input type="button" value="我要修改"
		onclick="javascrtpt:window.location.href='update1.jsp'"> -->
		<input type="submit" value="我要修改">
	<input type="button" value="我要删除"
		onclick="del()" >
	<br>
	<input type="hidden" name='flh' value="${files.pid }">
	<input type="hidden" name='tdh' value="${files.gnum }">
	<input type="hidden" name='mj'  value=" ${files.squre }">
	<input type="hidden" name='lx'  value="${files.type }">
	<input type="hidden" name='tdyt'  value="${files.usedfor }">
	<input type="hidden" name='yyz'  value="${files.people }">
	<input type="hidden" name='wz'  value="${files.location }">
	<input type="hidden" name='kssysj'  value="${files.whenuse }">
	<input type="hidden" name='bz'  value="${files.remark }">
	<input type="hidden" name='nr'  value="${files.content }">
</form>
</body>
</html>