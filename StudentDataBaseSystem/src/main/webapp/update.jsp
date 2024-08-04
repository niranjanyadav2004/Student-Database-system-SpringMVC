<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Page</title>
</head>
<body>

     <h2 style="text-align: center; margin-top: 8%; margin-bottom: 5%">Update Student</h2>
     
   <div style="margin-left: 37%">  
     <form action="updateStudent" method="post" style=" border: 1px solid grey; width: 40%;height:210px; text-align: center; border-radius: 8px">
     
           Rno  : <input type="text" name="rno" style="margin-bottom: 4% ; margin-top: 13%"  value=<%= request.getParameter("rno") %> readonly>  <br>
           
           Name : <input type="text" name="name" style="margin-bottom: 4%" value=<%= request.getParameter("name") %> >  <br>
           
           Per : <input type="text" name="per" style="margin-bottom: 4%" value=<%= request.getParameter("per") %> >   <br>
           
           <input type="submit" value="Update" style="margin-bottom: 4%">    <br>
           
           
     </form>
   </div>  

</body>
</html>