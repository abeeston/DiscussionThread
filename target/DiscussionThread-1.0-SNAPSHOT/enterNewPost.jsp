<%-- 
    Document   : enterNewPost
    Created on : Jun 16, 2015, 7:20:34 PM
    Author     : Amy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome ${param.username}</h1>
        <form action="CreatePost" method="GET">
            <h3> Create a new post </h3>
            <textarea name="content"></textarea><br/>
            <input hidden type="text" name="username" value="${param.username}"/>
            <input type="submit" value="Post"/>
        </form>
        <form action="LoadPosts" method="GET">
            <h3> Or view archived posts </h3>
            <input type="submit" value="View Posts"/>
        </form>
    </body>
</html>
