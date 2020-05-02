<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="createTicket" method="post">
		Movie <input name="movie">
		Screen <input name=screen>
		Seat <input name=seat>
		<input type="submit" value="Purchase">
	</form>
	${msg}
</body>
</html>