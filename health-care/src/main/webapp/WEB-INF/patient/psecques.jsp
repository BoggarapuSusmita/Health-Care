<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Set Password</title>
</head>
<body>
<table width=100% height=100%>
	<tr>
		<td bgcolor=white>
			<center>
				<font face="Arial" size="9" color="blue">Sehat</font>
			</center>
           <marquee>
         		<font face="Jokerman" size="5" color="green">Jaan hai toh jahan hai</font>
           </marquee>
		<form action="h">
	<input type="submit" value="HOME">
</form>
		</td>
	</tr>
	<tr>
		<td bgcolor=RoyalBlue>
			<table width=100% height=100%>
				<tr>
					<td>
						<form method=get action="psecques">
							<font face='Franklin Gothic' size=5 color=lightpink>&nbsp;&nbsp;
							Your security question is:&nbsp;&nbsp;${securityquestion}<br><br>&nbsp;&nbsp;
							Answer:&nbsp;&nbsp;<input type= 'text' name="answer"><br><br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							<input type=submit value=NEXT>
							${incorrect}
							</font>
						</form>
						
					</td>
				</tr>
			</table>
		</body>
	<body>
</html>