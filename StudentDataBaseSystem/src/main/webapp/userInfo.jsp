<%@page import="java.util.List"%>
<%@page import="com.niranjan.entities.Student"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Student Records</title>
</head>
<style>
.pointer {cursor: pointer;}

#update{
  height:30px;
  width: 28%;
  color: white;
  border-radius:5px;
  background-color: green;
}

#delete{
  height:30px;
  width: 28% ;
  color: black;
  border-radius:5px;
  background-color: red;
}

#add{
  border:1px solid black;
  width: 38%;
  color: white;
  font-size:25px;
  border-radius:5px;
  background-color: rgb(0, 174, 255);
  margin-left: 20%;
}

</style>

<body>

  <h1 style="text-align: center;">Student Information</h1>
  
  <a href="userReg.jsp" style="text-decoration: none;" id="add"> Add Student </a> 
  
  <div align="center">
        <table border="1" cellpadding="5" style="width: 40%; margin-top: 5%">
            <tr>
                <th>Roll No</th>
                <th>Name</th>
                <th>Per</th>
                <th>Action</th>
            </tr>
            <c:forEach items="${records}" var="student">
            <tr>
            
      			 <td>	${student.rno} </td>
      			 <td>	${student.name} </td>
      			 <td>	${student.per}  </td>
      			 <td> 
      			    <div align="center">
      			         <button class="pointer" id="update"> <a href="update.jsp?rno=${student.rno}&name=${student.name}&per=${student.per}" style="text-decoration: none; color: white;"> Update</a> </button>
      			          <button class="pointer" id="delete"> <a href="<c:url value='/delete' />?id=${student.rno}" style="text-decoration: none; color: white;" >Delete</a>
 </button>
      			    </div>
      			  </td> 
      		</tr>		
  			</c:forEach>
        </table>
    </div>   


</body>
</html>