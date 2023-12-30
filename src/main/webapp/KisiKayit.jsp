<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Kişi Kayıt Formu</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
        }

        h2 {
            text-align: center;
        }

        form {
            width: 300px;
            margin: 0 auto;
        }

        label {            
            margin-bottom: 15px;
        }

        input, select {
            width: 100%;
            padding: 8px;
            margin-bottom: 10px;
            box-sizing: border-box;
        }

        input[type="radio"], input[type="file"] {
            width: auto;
            margin-right: 5px;
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
    </style>
</head>
<body>
	<%@include file="./shared/navbar.jsp" %>
    <h2>Kişi Kayıt Formu</h2>

    <form action="KisiKayitServlet" method="post">
        <label for="ad">Ad:</label>
        <input type="text" id="ad" name="ad" required>

        <label for="soyad">Soyad:</label>
        <input type="text" id="soyad" name="soyad" required>
        
        <fieldset>
		  <legend>Cinsiyet:</legend>
		
		  <div>
		    <input type="radio" id="erkek" name="cinsiyet" value="Erkek" required>
		    <label for="erkek">Erkek</label>
		  </div>
		
		  <div>
		    <input type="radio" id="kadin" name="cinsiyet" value="Kadın" required>
		    <label for="kadin">Kadın</label>
		  </div> 
		</fieldset>
        <label for="hobiler">Hobiler:</label>
        <input type="text" id="hobiler" name="hobiler" placeholder="Hobilerinizi virgülle ayırarak girin" required>

        <label for="sehir">Şehir:</label>
        <select id="sehir" name="sehir" required>
            <option value="istanbul">İstanbul</option>
            <option value="ankara">Ankara</option>
            <option value="izmir">İzmir</option>
        </select>

        <label for="kullaniciAdi">Kullanıcı Adı:</label>
        <input type="text" id="kullaniciAdi" name="kullaniciAdi" required>

        <label for="sifre">Şifre:</label>
        <input type="password" id="sifre" name="sifre" required>

         
        <input type="submit" value="Kayıt Ol">
    </form>
    <%@include file="./shared/footer.jsp" %>
</body>
</html>
