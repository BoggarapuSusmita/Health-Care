<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Reset Password</title>
	<script>function ValidatePass()
			{
				var t = document.forms[\"myForm\"][\"password\"].value; 
				var passformat = /^\\w+([\\@-]?\\w+)*$/;
				if(t.length<8)
				{
					alert(\"You have entered an invalid password!.The length should be minimum 8 charachters\");
					document.forms[\"myForm\"][\"password\"].focus();
					return false;
				}
				else
 				{
 					return true;
    				}
				if(t.match(passformat))
				{ 
					return true; 
				}
				else  
				{  
					alert("You have entered an invalid password!.Special charachters only @,hyphen and underscore can be used\n"); 
					document.forms[\"myForm\"][\"password\"].focus();
					return false; 
				}
			} 
	</script>
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
		   						<form name= myForm method=post action="preset" >
		   							<table width=40%>
		   								<tr>
		   									<td>
		   										<font face='Franklin Gothic' size=5 color=lightpink>Enter your new password:</font><br><br>
		   									</td>
		   									<td> 
		   										<input type="password" name="password">
		   									</td>
		   								</tr>
		   								<tr>
		   									<td>
		   										<input type=submit value=Enter>
		   									</td>
		   								</tr>
		   							</table>
		   						</form>
		   						${status}
		   					</td>
		   				</tr>
		   			</table>
				</td>
			</tr>
		</table>
</body>
</html>