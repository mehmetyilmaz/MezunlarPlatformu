<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title> Harita</title>

    <!-- Leaflet Kütüphanesi -->
    <link rel="stylesheet" href="https://unpkg.com/leaflet/dist/leaflet.css" />
    <script src="https://unpkg.com/leaflet/dist/leaflet.js"></script>

    <!-- Harita Stilleri -->
    <style>
        #harita {
            height: 300px;
            width : 600px
        }
    </style>
</head>
<body>
	<%@include file="./shared/navbar.jsp" %>
    <h2>Harita</h2>

    <!-- Harita Div -->
    <div id="harita"></div>

    <!-- Harita Skripti -->
    <script>
        // Harita Oluştur
        var harita = L.map('harita').setView([39.9334, 32.8597], 6); // Türkiye'nin ortası (latitude, longitude, zoom level)

        // Harita Katmanı Ekle
        L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', {
            attribution: '© OpenStreetMap contributors'
        }).addTo(harita);

        // Panning ve Zoom Kontrolleri
        L.control.zoom({ position: 'topright' }).addTo(harita);
        L.control.scale().addTo(harita);
    </script>
    <%@include file="./shared/footer.jsp" %>
</body>
</html>
