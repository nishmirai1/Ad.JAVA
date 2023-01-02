<%-- 
    Document   : add
    Created on : 26 Dec, 2022, 2:20:37 PM
    Author     : mcacnj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Adding Two values</title>
    </head>
    <body>
        <h1>Adding Two values</h1>
        <%
            int f1=Integer.parseInt(request.getParameter("field1"));
            int f2=Integer.parseInt(request.getParameter("field2"));
            int sum=f1+f2;
            %>
            <jsp:forward page="/result.jsp">
                <jsp:param name="result" value="<%=sum%>"/>
            </jsp:forward>
    </body>
</html>
