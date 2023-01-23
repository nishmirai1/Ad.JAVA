<%-- 
    Document   : CallApplet
    Created on : 23 Jan, 2023, 3:27:01 PM
    Author     : mcacnj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <jsp:plugin type="applet" code="Call.class" codebase="test" height="400" width="700">
            <jsp:fallback>Plugin tag not supported by browser </jsp:fallback>
        </jsp:plugin>
            <h4>
                <front Color="red">
                    The above applet is loaded using java plugin from a jsp page using plugin tag </front>
            </h4>
    </body>
</html>
