
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Kullanıcılar</title>
</head>
<body>
    <h2>Kullanıcılar</h2>

    <table border="1">
        <thead>
            <tr>
                <th>ID</th>
                <th>Ad</th>
                <th>Soyad</th>
                <!-- Diğer sütunlar buraya eklenecek... -->
            </tr>
        </thead>
        <tbody>
            <c:forEach var="kullanici" items="${kullanicilar}">
                <tr>
                    <td><c:out value="${kullanici.id}" /></td>
                    <td><c:out value="${kullanici.ad}" /></td>
                    <td><c:out value="${kullanici.soyad}" /></td>
                    <!-- Diğer sütunlar buraya eklenecek... -->
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
