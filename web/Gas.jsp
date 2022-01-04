<%-- 
    Document   : Gas
    Created on : 16-Feb-2017, 10:02:23
    Author     : Dedi Wardani
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="ub" class="Check.Harga" scope="page"/>
<jsp:setProperty name="ub" property="satu"/>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>2014A-week1</title>
    </head>
    <body>
        <h1>Hasil di ambil dari class Check.Harga </h1><br/>
        <h2><jsp:getProperty name="ub" property="satu"></jsp:getProperty> </h2>
    </body>
</html>
