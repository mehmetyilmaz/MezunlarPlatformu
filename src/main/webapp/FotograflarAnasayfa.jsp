<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.sql.*" %>
<%@ page import="com.example.util.DatabaseUtil" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Fotoğraflar</title>
</head>
<body>
    <h2>Fotoğraflar</h2>
    
    <c:forEach var="photo" items="${photos}">
        <div>
            <img src="<c:out value='${photo.thumbnailUrl}' />" alt="<c:out value='${photo.description}' />">
            <a href="FotografSayfa.jsp?photoId=<c:out value='${photo.id}' '>Detaylar</a>
        </div>
    </c:forEach>
</body>
</html>
