<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Add Disease</title>
</head>
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
                     <form action="h">
	<input type="submit" value="HOME">
</form>
                     <tr>
                         <td colspan="2" align="center">
                             <font face="impact" size="6">Add a Disease and its realted information into the database</font><br><br><br>
                         </td>
                     </tr>
                     <tr>
                         <td align="center">
                             <form  name="myForm" method="post" action="acare" onsubmit="return validateForm()" >
                                 <table width="50%">
                                     
                                        
                                    <tr><td>DISEASE:</td><td><input type ="text" name="disease"><br><br></td></tr>
									<tr><td>SYMPTOMS:</td><td><input type ="text" name="symptom"><br><br></td></tr>
									<tr><td>PRECAUTIONS:</td><td><input type ="text" name="precaution"><br><br></td></tr>
                                    
                                     <tr><td></td><td><input type ="submit" value="SUBMIT"></td></tr></table><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
                             </form>
                         </td>
                     </tr>
                 </table>
             </td>
         </tr>
        </table> 
    </body>
</html>