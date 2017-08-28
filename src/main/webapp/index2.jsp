<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP and Server Push</title>
</head>
<body>

<% request.newPushBuilder()
        .path("images/ThumbsUpDuke.jpeg")
        .setHeader("content-type", "image/jpeg")
        .setHeader("cache-control", "public")
        .push();%>

<img src="${pageContext.servletContext.contextPath}/images/ThumbsUpDuke.jpeg">
</body>
</html>
