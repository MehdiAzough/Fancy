<%-- 
    Document   : Fancyjsp
    Created on : 23 mars 2017, 00:35:58
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
        <h2>General Info</h2>
        <ul>
            <li>Smallest: ${fancyList.smallest}</li>
            <li>Largest: ${fancyList.largest}</li>
            <li>Sum: ${fancyList.sum}</li>
            <li>Server : ${pageContext.servletContext.serverInfo}</li>
        </ul>
        <%@taglib prefix="c"
                  uri="http://java.sun.com/jsp/jstl/core" %>
        <h2>Specific Numbers</h2>
        <ol>
            <c:forEach var="number" items="${fancyList.num}">
                <li>${number}</li>
            </c:forEach>
        </ol>
    </body>
</html>
