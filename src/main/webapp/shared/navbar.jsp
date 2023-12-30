<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
	<style>
        body {
            font-family: Arial, sans-serif;
            margin: 20px;
            background-color: #f4f4f4;
        }

        header {
            background-color: #333;
            color: white;
            text-align: center;
            padding: 15px;
        }

        nav {
            background-color: #555;
            overflow: hidden;
        }

        nav ul {
            list-style-type: none;
            margin: 0;
            padding: 0;
            overflow: hidden;
        }

        nav li {
            float: left;
        }

        nav a {
            display: block;
            color: white;
            text-align: center;
            padding: 14px 16px;
            text-decoration: none;
        }

        nav a:hover {
            background-color: #ddd;
            color: black;
        }

        section {
            padding: 20px;
            background-color: #fff;
        }

        footer {
            background-color: #333;
            color: white;
            text-align: center;
            padding: 10px;
            position: fixed;
            bottom: 0;
            width: 100%;
        }
    </style>
	<header>
        <h1>Üniversite Mezunlar Platformu</h1>
    </header>

    <nav>
        <ul>
            <li><a href="KisiKayit.jsp">Kişi Kayıt</a></li>
            <li><a href="OturumAc.jsp">Oturum Aç</a></li>
            <li><a href="ForumServlet">Forum</a></li>
            <li><a href="KisilerServlet">Kişiler</a></li>
            <li><a href="FotograflarAnasayfa.jsp">Fotoğraflar</a></li>
            <li><a href="VideolarAnasayfa.jsp">Videolar</a></li>
            <li><a href="Kullanicilar.jsp">Kim, Nerede, Ne Yapıyor?</a></li>
            <li><a href="Harita.jsp">Harita</a></li>
        </ul>
    </nav>