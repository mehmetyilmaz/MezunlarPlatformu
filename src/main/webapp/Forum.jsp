<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="com.example.servlet.ForumServlet" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Forum</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f4f4;
            margin: 0;
            padding: 0;
        }

        .container {
            width: 80%;
            margin: 0 auto;
            background-color: #fff;
            padding: 20px;
            border-radius: 5px;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }

        h2, h3 {
            color: #333;
            text-align: center;
        }

        form {
            display: flex;
            flex-direction: column;
        }

        label {
            margin-bottom: 10px;
            color: #333;
        }

        input[type="text"],
        textarea {
            padding: 8px;
            margin-bottom: 15px;
            box-sizing: border-box;
            width: 100%;
        }

        input[type="submit"] {
            background-color: #4CAF50;
            color: white;
            padding: 10px 15px;
            border: none;
            border-radius: 4px;
            cursor: pointer;
        }

        input[type="submit"]:hover {
            background-color: #45a049;
        }

        table {
            width: 100%;
            border-collapse: collapse;
            margin-top: 20px;
        }

        table, th, td {
            border: 1px solid #ddd;
        }

        th, td {
            padding: 10px;
            text-align: left;
        }

        th {
            background-color: #4CAF50;
            color: white;
        }
    </style>
</head>
<body>
	<%@include file="./shared/navbar.jsp" %>
    <div class="container">
        <h2>Forum</h2>

        <!-- Mesaj ekleme formu -->
        <form action="ForumServlet" method="post">
            <label for="kullaniciAdi">Kullanıcı Adı:</label>
            <input type="text" id="kullaniciAdi" name="kullaniciAdi" required>

            <label for="icerik">İçerik:</label>
            <textarea id="icerik" name="icerik" required></textarea>

            <label for="tarih">Tarih:</label>
            <input type="text" id="tarih" name="tarih" value="<%= new java.text.SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new java.util.Date()) %>" readonly>

            <input type="submit" value="Mesajı Gönder">
        </form>

        <!-- Mesaj listesi -->
        <h3>Mesajlar</h3>
        <table>
            <tr>
                <th>Kullanıcı Adı</th>
                <th>İçerik</th>
                <th>Tarih</th>
            </tr>
            <c:forEach var="mesaj" items="${mesajlar}">
                <tr>
                    <td>${mesaj.kullaniciAdi}</td>
                    <td>${mesaj.icerik}</td>
                    <td>${mesaj.tarih}</td>
                </tr>
            </c:forEach>
        </table>
    </div>
    <%@include file="./shared/footer.jsp" %>
</body>
</html>
