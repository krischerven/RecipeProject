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
<c:forEach var="ingredient" items="${recipe.ingredientLines }">
${ingredient }<br>
</c:forEach>
</body>
</html>