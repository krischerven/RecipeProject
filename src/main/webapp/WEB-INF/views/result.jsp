<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://stackpath.bootstrapcdn.com/bootswatch/4.3.1/solar/bootstrap.min.css" rel="stylesheet" integrity="sha384-8nq3OiMMgrVFAHyRMMO+DTfMEciSY+c3Awhj/5ljQ1xck1Uv2BUtMjsjLD8GT5Er" crossorigin="anonymous">
</head>
<body>
<c:forEach var="r" items="${response.hits }" varStatus="loop">
<a href="show-recipe?id=${loop.index}&query=${response.q}">${r.recipe.label}</a><br>
Calories: ${r.recipe.calories}<br>
<img src='${r.recipe.image}'/><br>
<br>
</c:forEach>
</body>
</html>