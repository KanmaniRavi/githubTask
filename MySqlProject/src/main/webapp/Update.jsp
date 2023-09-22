<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>UpdateDetails</title>
</head>
<body>
	<h2>Fill in your details</h2>

	<form action="JdbcGetController" method="get">

      <div>
			  Id : <input type="text" name="id" id="id">  
		</div>
		     
		<div>
			  Name : <input type="text" name="name" id="name">  
		</div>
		 <br /> <br />                                      
		<div>
			 Email : <input type="text" name="email" id="email">   
		</div>
		   <br /> <br />                           
		<div>
			Phone : <input type="text" name="phone" id="phone"> 
		</div>
		  <br /> <br />                 
		<div>
			<br /> <input type="submit" value="Update Data" />
		</div>
		 
	</form>
	<br />

</body>
</html>