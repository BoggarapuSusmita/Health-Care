<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>home</title>
</head>
<body>
	   <body>
        <table width="100%" height="100%">
         <tr>
           <td bgcolor="white">
           <center> <font face="Arial" size="9" color="blue">Sehat</font></center>
           <marquee><font face="Jokerman" size="5" color="green">Jaan hai toh jahan hai</font></marquee>
           </td>
        </tr>
         <tr>
             <td bgcolor="RoyalBlue"><br><br>
                 <table width="100%" height="100%">
                     
                     <tr>
                         <td colspan="2" align="center">
                             <font face="impact" size="6">WELCOME!!!!</font><br><br><br>
                         </td>
                     </tr>
                     <tr>
                         <td align="center">
                             <form  name="myForm" method="post" action="patientlogin">
                                 <table width="50%">
                                     
                                   <tr><td></td><td></td><td><font color="red" size="6">Are you a patient or doctor?</font></td><td></td></tr>    
									 
                                     <tr><td><input type ="submit" value="PATIENT"></td></tr></table>
                             </form>
                             <form  name="myForm" method="post" action="doctorlogin" >
                                 <table width="50%">                 
                                  <tr><td><input type ="submit" value="DOCTOR"></td></tr></table><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
                             </form>
                         </td><td align="center">
                             <form  name="myForm" method="post" action="search" >
                                 <table width="50%">                 
                                <tr><td><input type ="submit" value="SEARCH WITHOUT LOGIN"></td></tr></table><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
                             </form>
                         </td></tr><tr>
						<td align="center">
                         </td>
                     </tr>
                 </table>
             </td>
         </tr>
        </table> 
    </body>
</body>
</html>