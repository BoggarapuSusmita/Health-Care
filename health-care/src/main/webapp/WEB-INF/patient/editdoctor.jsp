<%@page import="health.doctor.DoctorUsers"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<title>Edit Doctor Details</title>
 <script>
//Checking whether the fields are empty or not on pressing the submit button
function validateForm() {
    var x = document.forms["myForm"]["specification"].value;
    var r = document.forms["myForm"]["dept"].value;
    var y = document.forms["myForm"]["contact_no"].value;
    var z = document.forms["myForm"]["username"].value;

if((y==null || y=="")&&(x==null || x=="") &&(r==null || r=="")) 
{
        alert("All fields are blank");
        document.forms["myForm"]["username"].focus();//to highlight this field
        return false;   
    }
if (r==null || r=="") {
    alert(" dept is missing");
    document.forms["myForm"]["dept"].focus();//to highlight this field
    return false;   
}
 if (x==null || x=="") {
        alert(" specification is missing");
        document.forms["myForm"]["specification"].focus();//to highlight this field
        return false;   
    }
    if (y==null || y=="") {
        alert("Contact No. must be filled ");
         document.forms["myForm"]["contact_no"].focus();
        return false;
       
    }
}
//Checking whether a field contains number or not when the field loses its focus

function blurred()
{
  var y = document.forms["myForm"]["contact_no"].value;
  if(isNaN(y)==true)
  {
    alert("Plz enter a valid contact no.");
    document.forms["myForm"]["contact_no"].focus();
    return false;
  }
  else{
  if(y.length<10 || y.length>10)
      {
          alert("Plz enter a valid contact no.Plz check the length. ");
          document.forms["myForm"]["contact_no"].focus();    
          return false;
      }
      else
          {
              return true;
          }
  }
}
</script>
    </head>
    <body>
        <table width="100%" height="100%">
         <tr>
           <td bgcolor="white">
           <center> <font face="Arial" size="9" color="blue">Sehat</font></center>
           <marquee><font face="Jokerman" size="5" color="green">Jaan hai toh jahan hai</font></marquee>
           <form action="h">
	<input type="submit" value="HOME">
</form>
           </td>
        </tr>
         <tr>
             <td bgcolor="RoyalBlue"><br><br>
                 <table width="100%" height="100%">
                     <tr>
                         <td align="center">
                      	<%
							DoctorUsers u1=(DoctorUsers)request.getAttribute("u1");
						%>
                             <form  name="myForm" method="post" action="dedit"  >
                                 <table width="50%">
                                     
                                     <tr><td><font color="red" size="4">All Fields are mandatory</font></td></tr>    
                                    <tr><td>USERNAME:</td><td><input type ="text" name="username" value="<%=u1.getUsername()%>"><br><br></td></tr>
									<tr><td>DEPARTMENT:</td><td><input type ="text" name="dept" value="<%=u1.getDept()%>"><br><br></td></tr>
									<tr><td>GENDER:</td><td><input type ="text" name="gender" value="<%=u1.getGender()%>"><br><br></td></tr>
									<tr><td>SPECIFICATION:</td><td><input type ="text" name="specification" value="<%=u1.getSpecification()%>"><br><br></td></tr>
                                    <tr><td>CONTACT NO.</td><td><input type="text" name="contact_no" value="<%=u1.getContact_no()%>"><br><br></td></tr>
                                     <tr><td>PASSWORD:</td><td><input type="password" name="password" value="<%=u1.getPassword()%>"><br><br></td></tr>
                                     <tr><td>SECURITY QUESTION:</td><td><select name="securityquestion" value="<%=u1.getSecurityquestion()%>">
                                               <option value="">Select your Question</option>  
                                               <option value="PetName">Pet Name</option>
                                               <option value="SchoolName">School Name</option>
                                               <option value="FavFood">Favourite Food</option>
                                               <option value="FavAuthor">Favourite Author</option>
                                               </select><br><br></td></tr>
                                              
                                     <tr><td>ANSWER:</td><td><input type ="text" name="answer" value="<%=u1.getAnswer()%>"><br><br></td></tr>
                                     <tr><td></td><td><input type ="submit" value="SUBMIT"></td></tr></table><br><br>
                             </form>
                             ${notreg}
                         </td>
                     </tr>
                 </table>
             </td>
         </tr>
        </table> 
    </body>
</html>