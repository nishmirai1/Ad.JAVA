<%-- 
    Document   : Home
    Created on : 23 Jan, 2023, 1:59:15 PM
    Author     : mcacnj
--%>

<%@page contentType="text/html" pageEncoding="UTF-8" autoFlush="true" language="java" import="java.util.Date" info="student information" session="true" isErrorPage="true" errorPage="Error.jsp"%>


        <!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login Page</title>
    </head>
    <body>
        <form action="Login.jsp">
            <table>
                <tr>
                    <td>Enter Name:</td>
                    <td><input type="name" name="user"/></td>
                </tr>
                <tr>
                    <td>Enter Your Password:</td>
                    <td><input type="password" name="pass"/></td>
                </tr>
                <tr>
                    <td><input type="submit" name="submit" value="SUBMIT"/></td>
                </tr>
            </table>
        </form>
    </body>
</html>
