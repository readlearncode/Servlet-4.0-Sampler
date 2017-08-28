<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>JSP with inline ServerPush Example</title>
</head>
<body>
<h2>JSP with inline ServerPush Example</h2>

<% request.newPushBuilder()
        .path("images/ThumbsUpDuke.jpeg")
        .setHeader("content-type", "image/jpeg")
        .setHeader("cache-control", "public")
        .push();%>

<img src="${pageContext.servletContext.contextPath}/images/ThumbsUpDuke.jpeg">
</body>
</html>
