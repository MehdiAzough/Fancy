<%-- 
    Document   : notfound
    Created on : 23 mars 2017, 00:44:58
    Author     : Azough Mehdi
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Error size : ${requestScope.size}  fff: ${requestScope.range} </h1>
        Erreur Code ${requestScope.probleme}
    </body>
</html>
