<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib prefix="sf" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>

<center><h1>Hibernate Example</h1><br/>
  <form:form method="POST" action="/index/students/update">
    <input path="id" name="id" value="${user.id}" style="display:none"/>
  <label>Username </label>
  <input path="username" name="username" value="${user.username}"/>
  <label>Password </label>
  <input path="password" name="password" value="${user.password}"/>
  <label>Email </label>
  <input path="email" name="email" value="${user.email}"/>
  <input type="submit" name="action" value="Update"/>
</form:form>

</center>


</body>
</html>
