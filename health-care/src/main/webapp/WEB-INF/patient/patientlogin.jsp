<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Patient Login</title>
</head>
	<body>
        <table width="100%" height="100%">
         <tr>
           <td bgcolor="white">
           <center> <font face="Arial" size="40" color="blue">Sehat</font></center>
           <marquee><font face="Jokerman" size="7" color="green">Jaan hai toh jahan hai</font></marquee>
          <form action="h">
	<input type="submit" value="HOME">
</form>
           </td>
        </tr>
         <tr>
             <td bgcolor="RoyalBlue"><br><br>
                 <table width="100%" height="100%">
                    <tr>
                         <td colspan="2" align="center">
                             <font face="impact" size="6">Login</font><br><br><br>
                         </td>
                     </tr>
                     <tr>
                         <td align="center">
                             <form method="post" action="plogin">

                             USERID:&nbsp;&nbsp;&nbsp;&nbsp;<input type ="text" name="userid"><br><br><br>
                             PASSWORD:&nbsp;&nbsp;&nbsp;&nbsp;<input type="password" name="password"><br><br><br>
                             <input type ="submit" value="SUBMIT"><br><br><br><br>
                              </form>
                              ${invalid}
                             <form action="pfpass">
                             	<input type="submit" value="forgot password"><br><br><br>
                             </form>
                             <form action="patientregister">
                             	<input type="submit" value="NEW USER?"><br><br><br><br><br>
                             </form>
                         </td>    
                     </tr>
                 </table> 
             </td>
         </tr> 
        </table> 
    </body>
</html>