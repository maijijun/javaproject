<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body bgcolor="#CCCCCC">
	<input type="button" value="我要查询"
		onclick="javascrtpt:window.location.href='query.jsp'"><br/>
	<input type="button" value="我要添加记录"
		onclick="javascrtpt:window.location.href='update.jsp'">
<%@ page contentType="text/html;charset=UTF-8" %>
<%
//变量声明
java.sql.Connection sqlCon; //数据库连接对象
java.sql.Statement sqlStmt; //SQL语句对象
java.sql.ResultSet sqlRst; //结果集对象
java.lang.String strCon; //数据库连接字符串
java.lang.String strSQL; //SQL语句
int intPageSize; //一页显示的记录数
int intRowCount; //记录总数
int intPageCount; //总页数
int intPage; //待显示页码
java.lang.String strPage;
int i;
//设置一页显示的记录数
intPageSize = 5;
//取得待显示页码
strPage = request.getParameter("page");
if(strPage==null){//表明在QueryString中没有page这一个参数，此时显示第一页数据
intPage = 1;
}
else{//将字符串转换成整型
intPage = java.lang.Integer.parseInt(strPage);
if(intPage<1) intPage = 1;
}
//装载JDBC驱动程序
java.sql.DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
//设置数据库连接字符串
strCon = "jdbc:oracle:thin:@localhost:1521:orcl";
//连接数据库
sqlCon = java.sql.DriverManager.getConnection(strCon,"scott","tiger");
//创建一个可以滚动的只读的SQL语句对象
sqlStmt = sqlCon.createStatement(java.sql.ResultSet.TYPE_SCROLL_INSENSITIVE,java.sql.ResultSet.CONCUR_READ_ONLY);
//准备SQL语句
strSQL = "select gnum,squre,type,usedfor,people,location from files";
//strSQL = "select * from files";
//执行SQL语句并获取结果集
sqlRst = sqlStmt.executeQuery(strSQL);
//获取记录总数
sqlRst.last();
intRowCount = sqlRst.getRow();
//记算总页数
intPageCount = (intRowCount+intPageSize-1) / intPageSize;
//调整待显示的页码
if(intPage>intPageCount) intPage = intPageCount;
%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=gb2312">
<title>档案分页显示</title>
</head>
<body>
<table border="1" cellspacing="0" cellpadding="0">
<tr>
<th>土地号</th>
<th>面积(单位：平方米)</th>
<th>土地类型</th>
<th>土地用途</th>
<th>拥有者</th>
<th>地址</th>
</tr>
<%
if(intPageCount>0){
//将记录指针定位到待显示页的第一条记录上
sqlRst.absolute((intPage-1) * intPageSize + 1);
//显示数据
i = 0;
while(i<intPageSize && !sqlRst.isAfterLast()){
%>
<tr>
<td width="150" align="center"><%=sqlRst.getString(1)%></td>
<td width="150" align="center"><%=sqlRst.getString(2)%></td>
<td width="150" align="center"><%=sqlRst.getString(3)%></td>
<td width="150" align="center"><%=sqlRst.getString(4)%></td>
<td width="150" align="center"><%=sqlRst.getString(5)%></td>
<td width="150" align="center"><%=sqlRst.getString(6)%></td>

</tr>
<%
sqlRst.next();
i++;
}
}
%>
</table>
第<%=intPage%>页&nbsp;&nbsp;共<%=intPageCount%>页&nbsp;&nbsp;<%if(intPage<intPageCount){%><a href="sele.jsp?page=<%=intPage+1%>">下一页</a><%}%>&nbsp;&nbsp;<%if(intPage>1){%><a href="sele.jsp?page=<%=intPage-1%>">上一页</a><%}%>
</body>
</html>
<%
//关闭结果集
sqlRst.close();
//关闭SQL语句对象
sqlStmt.close();
//关闭数据库
sqlCon.close();
%>   
	
</body>
</html>