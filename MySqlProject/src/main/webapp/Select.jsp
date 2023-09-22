<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

    <form action="JdbcGetController" method="get">
        <table>
            <tr>
                <td>Enter Id:</td>
                <td><input type="text" name="id" maxlength="5" size="3" /></td>
            </tr>
  
        </table>
        <br /> <input type="submit" value="View" />
    </form>
    <br />
</body>
</html>