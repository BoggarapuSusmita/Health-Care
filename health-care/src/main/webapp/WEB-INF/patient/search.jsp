<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Symptoms</title>
</head>
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
                         <td colspan="2" align="center">
                            <font face="impact" size="6">SEARCH YOUR DISEASE</font><br><br><br> 
                         </td>
                     </tr>
                     <tr>
                         <td align="center">
                             <form  name="myForm" method="post" action="disease" onsubmit="return validateForm()" >
                                 <table width="50%">                                   
                                     
                                     <tr><td>SYMPTOM 1:</td><td><select name="symptom1">
                                               <option value="">Select your Option</option>  
                                               <option value="headache">Head Ache</option>
                                               <option value="Vomiting">Vomiting</option>
                                               <option value="StomachAche">Stomach Ache</option>
                                               <option value="Fever">Fever</option>
											   <option value="LooseMotion">Loose Motion</option>
											   <option value="BackAche">Back Ache</option>
											   <option value="ColdCough">Cold and Cough</option>
                                               </select><br><br></td></tr>
									<tr><td>SYMPTOM 2:</td><td><select name="symptom2">
                                               <option value="">Select your Option</option>  
                                               <option value="headache">Head Ache</option>
                                               <option value="Vomiting">Vomiting</option>
                                               <option value="StomachAche">Stomach Ache</option>
                                               <option value="Fever">Fever</option>
											   <option value="LooseMotion">Loose Motion</option>
											   <option value="BackAche">Back Ache</option>
											   <option value="ColdCough">Cold and Cough</option>
                                               </select><br><br></td></tr>
									<tr><td>SYMPTOM 3:</td><td><select name="symptom3">
                                               <option value="">Select your Option</option>  
                                               <option value="headache">Head Ache</option>
                                               <option value="Vomiting">Vomiting</option>
                                               <option value="StomachAche">Stomach Ache</option>
                                               <option value="Fever">Fever</option>
											   <option value="LooseMotion">Loose Motion</option>
											   <option value="BackAche">Back Ache</option>
											   <option value="ColdCough">Cold and Cough</option>
                                               </select><br><br></td></tr>
                                              
                                     
                                     <tr><td></td><td><input type ="submit" value="SUBMIT"></td></tr></table><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br><br>
                             </form>
                         </td>
                     </tr>
                 </table>
             </td>
         </tr>
        </table> 
    </body>
</html>