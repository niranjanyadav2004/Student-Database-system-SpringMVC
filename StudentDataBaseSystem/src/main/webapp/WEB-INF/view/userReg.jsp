<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
 
   
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Form</title>

<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

<script type="text/javascript">

$(document).ready( function(){
	
	$("#id").change(function(){
		
		$.ajax({
			
			url:'validateRno',
			data:{
				id:$("#id").val()
			},
			success:function(responseText){
				$("#errMsg").text(responseText);
				if(responseText!=""){
					$("#id").focus();
				}
			}
			
		});
		
	});
	
});

</script>

</head>



<body>
   
   <h2 style="text-align: center; margin-top: 8%; margin-bottom: 5%">Enter Student Details</h2>
   
   
   <div style="margin-left: 37%">
  		<form action="studentForm" method="post" style=" border: 1px solid grey; width: 40%;height:210px; text-align: center; border-radius: 8px">
    
   			<div style="margin-top: 10%">
   			    Roll no : <input type="text" name="rno" id="id" style="margin-bottom: 4%">  <br>
  				Name    : <input type="text" name="name" style="margin-bottom: 4%"> <br>
   				Per     : <input type="text" name="per" style="margin-bottom: 4%">  <br>
   			</div>
   
   			<input type="submit" value="Submit">  <br> <br> 
   			
   			
   			<span id="errMsg" style="color: red;"></span>
   
   		</form>  
   
   		<h2 style="margin-left: 5%">${result} </h2>
    </div>
  
   
      
</body>
</html>

