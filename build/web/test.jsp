<%-- 
    Document   : index
    Created on : 11/10/2017, 04:24:21 PM
    Author     : gaboqm
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>JSP Page ejemplo enterprise java bean</title>
    </head>
    <body>
        <h1>Java Bean Enterprise</h1>
        <jsp:useBean id="test" scope="request" class="gabo.corp.com.t10.bean.TestModel" />
        <jsp:setProperty name="test" property="nombre" value="Gabo" />
        El nombre desde el enterprise bean: <jsp:getProperty name="test" property="nombre" />
        <hr>
        El email es: <jsp:getProperty name="test" property="correo" />
    </body>
</html>
