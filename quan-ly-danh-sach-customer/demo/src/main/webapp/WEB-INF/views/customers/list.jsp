<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>List Customer</title>

  <style>
    table {
      border: 1px solid #000;
    }

    th, td {
      border: 1px dotted #555;
    }
  </style>
</head>
<body>

  <table>
    <caption>Customers List</caption>
    <thead>
    <tr>
      <th>Id</th>
      <th>Name</th>
      <th>Email</th>
      <th>Address</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="c" items="${customers}">
      <tr>
        <td><c:out value="${c.id}"/></td>
        <td>${c.name}</td>
        <td>${c.email}</td>
        <td>${c.address}</td>
      </tr>
    </c:forEach>
    </tbody>
  </table>

</body>
</html>
