package com.example.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.service.KisiService;

@WebServlet("/OturumAcServlet")
public class OturumAcServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String oturumDurumu;
        try {
            String kullaniciAdi = request.getParameter("kullaniciAdi");
            String sifre = request.getParameter("sifre");

            KisiService kisiService = new KisiService();
            boolean oturumAcildi = kisiService.kisiGiris(kullaniciAdi, sifre);

            if (oturumAcildi) {
                oturumDurumu = "Başarılı";
            } else {
                oturumDurumu = "Başarısız";
            }
        } catch (Exception e) {
            e.printStackTrace();
            oturumDurumu = "Hata: " + e.getMessage();
        }

        // Oturum açma durumunu request'e bir nitelik olarak ekleyin
        request.setAttribute("oturumDurumu", oturumDurumu);

        // Aynı sayfaya geri gönder
        request.getRequestDispatcher("/Index.jsp").forward(request, response);
    }
}
