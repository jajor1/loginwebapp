<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login Success</title>
</head>
<body>

<%
	if(session.getAttribute("uname")==null) {
		response.sendRedirect("input.jsp");
	}
%>
<h1>
Welcome <%=session.getAttribute("uname") %>
<br>
You are logged in!
</h1>
<br><br>
<form action=logout.jsp>
<input type=submit value=Logout>
</form>
</body>
</html>