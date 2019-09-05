<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%><%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>${recipe.label }</title>
</head>
<body>
<img src="${recipe.image }"><br>
<h1>${recipe.label }</h1>
<ul>
<c:forEach var="ingredient" items="${recipe.ingredientLines }">
<li>${ingredient }
</c:forEach>
<a href="${recipe.url }">Source Link</a>
</ul>
</body>
</html>