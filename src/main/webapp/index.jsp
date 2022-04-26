<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome to JAVA web app.</h1><br>
<form action="<%=request.getContextPath()%>/home" method="post">
<input type="text" name="userName" placeholder="username" /> <br>
<input type="password" name ="password"  placeholder="password" />
<input type="submit" value="Login" />
</form>
</body>
</html>