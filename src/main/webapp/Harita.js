
<script>
    var harita = L.map('harita').setView([39.9334, 32.8597], 6);

    L.tileLayer('https://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png', 
    { attribution: "© OpenStreetMap contributors"}).addTo(harita);

    // Panning ve Zoom Kontrolleri
    L.control.zoom({ position: 'topright' }).addTo(harita);
    L.control.scale().addTo(harita);
</script>
