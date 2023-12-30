<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="com.example.servlet.KisilerServlet" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Kişiler Ana Sayfa</title>
    <style>
        .ogrenci-kart {
            border: 1px solid #ccc;
            padding: 10px;
            margin-bottom: 10px;
            text-align: center;
        }
        .ogrenci-resim {
            max-width: 100px;
            max-height: 100px;
        }
    </style>
</head>
<body>
<%@include file="./shared/navbar.jsp" %>
    <h2>Öğrenciler</h2>

    <!-- Öğrenci Listesi -->
     <!-- <a href="ogrenciDetay.jsp?id=${kisi.kullanici_adi}">${kisi.ad} ${kisi.soyad} </a> -->
    <c:forEach var="kisi" items="${kisiler}">
        <div class="ogrenci-kart">
          
            ${kisi.ad} ${kisi.soyad}
        </div>
    </c:forEach>
    <%@include file="./shared/footer.jsp" %>
</body>
</html>
