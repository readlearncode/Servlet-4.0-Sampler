<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Implicit Mapping</title>
</head>
<body>
<%
    HttpServletMapping mapping = request.getHttpServletMapping();

    response.getWriter()
            .append("Mapping match:")
            .append(mapping.getMappingMatch().name())
            .append("<br/>")
            .append("Match value:")
            .append(mapping.getMatchValue())
            .append("<br/>")
            .append("Pattern:")
            .append(mapping.getPattern());
%>
</body>
</html>
