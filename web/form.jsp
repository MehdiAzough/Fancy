<%-- 
    Document   : formjsp
    Created on : 23 mars 2017, 00:38:53
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
        <fieldset>
            <legend>MVC Servlet plus JSTL, Stateful EJB</legend> 
            <form action="FancyListServlet"> 
                <label>Number of entries:
                    <input type="text" name="size"/></label><br/>
                <label>Range of values for each entry: 
                    <input type="text" name="range"/></label><br> 
                <input type="submit"/> 
            </form> 
        </fieldset> 
    </body>
</html>
