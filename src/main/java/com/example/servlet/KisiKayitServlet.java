package com.example.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.example.model.Kisi;
import com.example.service.KisiService;

@WebServlet("/KisiKayitServlet")
public class KisiKayitServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // Parametreleri al
        String ad = request.getParameter("ad");
        String soyad = request.getParameter("soyad");
        String cinsiyet = request.getParameter("cinsiyet");
        String hobiler = request.getParameter("hobiler");
        String sehir = request.getParameter("sehir");
        String kullaniciAdi = request.getParameter("kullaniciAdi");
        String sifre = request.getParameter("sifre");
        
        
        Kisi kisi1 = new Kisi(ad,soyad,cinsiyet,hobiler,sehir,kullaniciAdi,sifre,"",0);

        KisiService kisiServis = new KisiService();
        kisiServis.addKisiWithImageUrl(kisi1);
        
        // Resim işleme
        //Part filePart = request.getPart("resim"); // <input type="file" name="resim">
        //String fileName = Paths.get(filePart.getSubmittedFileName()).getFileName().toString(); // MSIE fix.
        //String resimYolu = "/images/" + fileName; // Sunucudaki kaydetme yolu

        //try (InputStream fileContent = filePart.getInputStream()) {
        //    Files.copy(fileContent, Paths.get(resimYolu), StandardCopyOption.REPLACE_EXISTING);
        //}
        /*
        try {
            Connection conn = DatabaseUtil.getConnection(); // Veritabanı bağlantısı
            String sql = "INSERT INTO kisiler (ad, soyad, cinsiyet, hobiler, sehir, kullanici_adi, sifre, resim_url, yetki_seviyesi) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement statement = conn.prepareStatement(sql);
            statement.setString(1, ad);
            statement.setString(2, soyad);
            statement.setString(3, cinsiyet);
            statement.setString(4, hobiler);
            statement.setString(5, sehir);
            statement.setString(6, kullaniciAdi);
            statement.setString(7, sifre);
            statement.setString(8, ""); // Resim URL'si
            statement.setString(9, "0");
            int result = statement.executeUpdate();
            if (result > 0) {
                request.setAttribute("kayitSonucu", "Kayıt başarılı. Teşekkür ederiz!");
            }
        } catch (Exception e) {
            e.printStackTrace();
            request.setAttribute("kayitSonucu", "Kayıt başarısız: " + e.getMessage());
        }
		*/
        // Aynı sayfaya geri dön
        request.getRequestDispatcher("Index.jsp").forward(request, response);
    }
}
