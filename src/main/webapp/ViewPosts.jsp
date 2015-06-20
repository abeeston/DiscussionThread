<%-- 
    Document   : ViewPosts
    Created on : Jun 16, 2015, 7:37:49 PM
    Author     : Amy
--%>
<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>View Posts</title>
    </head>
    <body>
        <h1>Posts</h1>
        <div>
            <c:forEach var="post" items="${PostsList}">
                <h5>${post.user} </h5>
                ${post.date} <br/> ${post.content} <br/>
            </c:forEach>
        </div>
        <form action="enterNewPost.jsp" method="GET">
            <input type="submit" value="Create a New Post"/>
        </form>
    </body>
</html>
