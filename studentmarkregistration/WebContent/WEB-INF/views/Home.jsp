<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri= "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body topmargin="15" leftmargin="15" marginwidth="10">
<form action="" method="post">
<center>
Student ID<select name="Student_ID">
	<c:forEach var = "id" items = "${list}">
		<option value="${id}">"${id}"</option>
	</c:forEach>
	</select>
</center>
<br><br>

<center>Student Name :<input type="text"  name="Student Name"></center><br><br>
<center>Student Standard :<input type="text" name="StudentStandard"></center><br><br>
<center>Student Category :<input type="text" name="StudentCategory"></center><br><br>
<center><input type="submit" value="add">
</center></form>

</body>
</html>