<html>
<head>
   <title>Hello Example</title>
</head>

<body>
<%@ taglib uri='http://java.sun.com/jsp/jstl/core' prefix='c' %>

<c:choose>
   <c:when test='${!empty param.name}'>
      <h2>Hello, <c:out value='${param.name}'/></h2>
   </c:when>
   <c:otherwise>
      <h2>Hello, stranger</h2>
   </c:otherwise>
</c:choose>

</body>
</html>
