 <%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Select Details</title>
</head>
<body>
    <form action="JdbcGetController" method="get">
        <table>
            <tr>
                <td>Enter ID:</td>
                <td><input type="text" name="id" maxlength="3" size="4" /></td>
            </tr>
  
        </table>
        <br /> <input type="submit" value="View Data" />
    </form>
    <br />
    <input type="button" value="Return to Home"
        onclick="window.location.href='Home.jsp'" />
  
</body>
</html> 