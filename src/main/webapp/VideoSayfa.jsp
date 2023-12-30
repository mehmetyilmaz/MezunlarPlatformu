<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Video Sayfası</title>
    <!-- YouTube embed API ekleyebilirsiniz -->
</head>
<body>
    <h2>Video Sayfası</h2>

    <!-- Video Gömme Kodu -->
    <iframe width="560" height="315" src="<c:out value='${video.videoUrl}' ?>" frameborder="0" allowfullscreen></iframe>

    <!-- Yorum Ekleme Formu -->
    <form action="YorumEkleServlet" method="post">
        <input type="hidden" name="videoId" value="<c:out value='${video.id}' />"/>
        <textarea name="yorum" rows="4" cols="50" placeholder="Yorumunuzu buraya yazın"></textarea><br>
        <input type="submit" value="Yorum Ekle">
    </form>

    <!-- Yorum Listesi -->
    <table border="1">
        <thead>
            <tr>
                <th>Tarih</th>
                <th>Saat</th>
                <th>Yorumcu İsmi</th>
                <th>Yorum</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="yorum" items="${yorumlar}">
                <tr>
                    <td><c:out value='${yorum.date}' /></td>
                    <td><c:out value='${yorum.time}' /></td>
                    <td><c:out value='${yorum.yorumcuIsmi}' /></td>
                    <td><c:out value='${yorum.yorum}' /></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</body>
</html>
} catch (SQLException e) {
    System.out.println("SQL Hatası: " + e.getMessage());
    e.printStackTrace();
} catch (Exception e) {
    System.out.println("Beklenmeyen bir hata oluştu: " + e.getMessage());
    e.printStackTrace();
}catch (SQLException e) {
    System.out.println("SQL Hatası: " + e.getMessage());
    e.printStackTrace();
} catch (Exception e) {
    System.out.println("Beklenmeyen bir hata oluştu: " + e.getMessage());
    e.printStackTrace();
}