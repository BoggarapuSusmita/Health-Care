<%@page import="java.util.ArrayList"%>
<%@page import="health.diseases.DiseaseTable"%>
<%@page import="health.diseases.DiseaseDao"%>
<%@page import="javax.servlet.http.HttpServletRequest"%>
<%@page import="javax.servlet.http.HttpSession"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Precautions</title>
</head>
<body>
<table width=100% height=100%>
<tr><td bgcolor=white> <center> <font face="Arial" size="9" color="blue">Sehat</font></center>
           <marquee><font face="Jokerman" size="5" color="green">Jaan hai toh jahan hai</font></marquee>
<form action="h">
	<input type="submit" value="HOME">
</form>
</td></tr>
<tr><td bgcolor=RoyalBlue><table width=100% height=100%>
<tr>
<td>
<font face='Franklin Gothic' size=5 color=white>&nbsp;&nbsp;The immediate precautions you can take are:&nbsp;&nbsp;<br><br>
<%
	ArrayList<String> dis=(ArrayList<String>)request.getAttribute("precautions");
	out.println(dis);
%>
<br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;<br><br><br><br></font>
<form method=post action="referdoc">
	<input type=submit value="REFER TO A DOCTOR">
</form>
</td>
</tr>
</table>
</body>
</html>