<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
         pageEncoding="ISO-8859-1" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
    <title>Insert title here</title>
</head>
<body>


<c:set var="userVar" scope="session" value="${requestScope.user}"/>

<form action="${pageContext.request.contextPath}/user-servlet" method="post">
    <p>
        Name: <input type="text" name="name" value="${userVar.name}">
    </p>
    <p>
        Password: <input type="password" name="password"
                         value="${userVar.password}">
    </p>
    <p>
        Age: <input type="text" name="age" value="${userVar.age}">
    </p>

    <input type="hidden" name="userId" value="${userVar.id}">
    <input type="submit" name="button" value="Update">
    <input type="submit" name="button" value="Delete">
</form>


<button type="button" onclick="window.location='/';">Home</button>

</body>
</html>