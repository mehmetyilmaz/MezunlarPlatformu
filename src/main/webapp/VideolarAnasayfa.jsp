<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Videolar</title>
</head>
<body>
    <h2>Videolar</h2>
    
    <c:forEach var="video" items="${videos}">
        <div>
            <img src="<c:out value='${video.thumbnailUrl}' />" alt="<c:out value='${video.title}' />">
            <a href="VideoSayfa.jsp?videoId=<c:out value='${video.id}'">Detaylar</a>
        </div>
    </c:forEach>
</body>
</html>
