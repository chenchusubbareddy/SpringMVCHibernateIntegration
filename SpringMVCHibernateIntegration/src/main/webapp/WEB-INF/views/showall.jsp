<%@ page language="java" isELIgnored="false"
	contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


	<div align="center">
		<table border="1" cellpadding="5">
			<caption>
				<h2>List of users</h2>
			</caption>
			<tr>
				<th>StudentID</th>
				<th>Student Email</th>
				<th>Studnet FirstName</th>
				<th>Student LastNAme</th>
				<th>DOB</th>
				<th>DELETE</th>
			</tr>
			<c:forEach var="s" items="${sudentData}">
				<tr>
					<td><c:out value="${s.sid}" /></td>
					<td><c:out value="${s.email}" /></td>
					<td><c:out value="${s.firstName}" /></td>
					<td><c:out value="${s.lastName}" /></td>
					<td><c:out value="${s.dob}" /></td>
					<td><a href="deletestd?sid=${s.sid}">DELETE</a></td>
				</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>