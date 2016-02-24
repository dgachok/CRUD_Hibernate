<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Hibernate example</title>
</head>
<body>
<center><h1>Hibernate Example</h1><br/>


  <form:form method="POST" action="/index/students">
    <label>Username </label>
    <input path="username" name="username"/>
    <label>Password </label>
    <input path="password" name="password"/>
    <label>Email </label>
    <input path="email" name="email" />
    <button type="submit">Add</button>
  </form:form>

<br/>

  <table border="2px">
    <thead>
    <tr>
      <td>Id</td>
      <td>Username</td>
      <td>Password</td>
      <td>Email</td>
      <td></td>
    </tr>
    </thead>
    <tbody>

    <c:forEach items="${users}" var="users">
      <tr>
        <td>${users.id}</td>
        <td>${users.username}</td>
        <td>${users.password}</td>
        <td>${users.email}</td>
        <td><a href="/index/students/${users.id}">Delete</a></td>
        <td><a href="/index/students/edit/${users.id}">Edit</a></td>
      </tr>
    </c:forEach>

    </tbody>
  </table>
</center>
</body>
</html>
