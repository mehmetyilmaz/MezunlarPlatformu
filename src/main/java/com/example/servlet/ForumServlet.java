package com.example.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.example.model.ForumMesaj;
import com.example.service.ForumService;

@WebServlet("/ForumServlet")
public class ForumServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        try {
            String kullaniciAdi = request.getParameter("kullaniciAdi");
            String icerik = request.getParameter("icerik");

            ForumMesaj forumMesaj = new ForumMesaj(0, kullaniciAdi, icerik, null);

            ForumService forumService = new ForumService();
            forumService.addForumMesaj(forumMesaj);

            response.sendRedirect(request.getContextPath() + "/ForumServlet");
        } catch (Exception e) {
            e.printStackTrace();
            response.sendRedirect(request.getContextPath() + "/forumMesajError.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        ForumService forumService = new ForumService();
        List<ForumMesaj> mesajlar = forumService.getAllForumMesajlar();

        request.setAttribute("mesajlar", mesajlar);
        request.getRequestDispatcher("/Forum.jsp").forward(request, response);
    }
}
