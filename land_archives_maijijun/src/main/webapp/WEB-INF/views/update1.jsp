<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#CCCCCC">
	<form action="addfiles" method="post">
		<%
			request.setCharacterEncoding("UTF-8");
			String flh1 = request.getParameter("flh");
			String tdh1 = request.getParameter("tdh");
			String mj1 = request.getParameter("mj");
			String lx1 = request.getParameter("lx");
			String tdyt1 = request.getParameter("tdyt");
			String yyz1 = request.getParameter("yyz");
			String wz1 = request.getParameter("wz");
			String kssysj1 = request.getParameter("kssysj");
			String bz1 = request.getParameter("bz");
			String nr1 = request.getParameter("nr");
		%>
		分类号：<input type="text" name='flh' value="<%=flh1%>" ><br> <br>
		土地号:<input type="text" name='tdh' value="<%=tdh1%>" readlong><br> <br>
		面积：<input type="text" name='mj' value="<%=mj1%>"><br> <br> 
		类型：<input type="text" name='lx' value="<%=lx1%>"}"><br> <br> 
		土地用途：<input type="text" name='tdyt' value="<%=tdyt1%>"}"><br> <br> 
		拥有者：<input type="text" name='yyz' value="<%=yyz1%>"}"><br> <br> 
		位置：<input type="text" name='wz' value="<%=wz1%>"}"><br> <br> 
		开始使用时间：<input type="text" name='kssysj' value="<%=kssysj1%>"}"><br> <br> 
		备注：<input type="text" name='bz' value="<%=bz1%>"}"><br> <br> 
		内容： <textarea cols='50' rows='10' name='nr' value="<%=nr1%>"}"></textarea><br> 
		<input type="submit" value="提交">
		<input type="button" value="取消" onclick="javascrtpt:window.location.href='sele.jsp'">
	</form>
</body>
</html>