<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page import="java.sql.*" %>
<%@ page import="com.example.util.DatabaseUtil" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Fotoğraf Sayfası</title>
</head>
<body>
    <h2>Fotoğraf Sayfası</h2>
    
    <img src="<c:out value='${photo.largeUrl}' />" alt="<c:out value='${photo.description}' />">
    
    <div>
        <textarea id="commentText"></textarea>
        <button onclick="addComment(<c:out value='${photo.id}' />)">Yorum Ekle</button>
    </div>

    <div>
     <table>
      <thead>
         <tr>
          <th>Tarih</th>
          <th>Saat</th>
           <th>Yorumcu İsmi</th>
           <th>Yorum</th>
          </tr>
         </thead>
        <tbody>
         <c:forEach var="comment" items="${comments}">
            <tr>
             <td><c:out value="${comment.date}" /></td>
              <td><c:out value="${comment.time}" /></td>
             <td><c:out value="${comment.commenterName}" /></td>
            <td><c:out value="${comment.commentText}" /></td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>

    <script>
        function addComment(photoId) {
            var commentText = document.getElementById("commentText").value;
            // JavaScript ile yorum eklemeye yönelik işlemler
        }
    </script>
</body>
</html>
