<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
    <link href="<c:url value="/resources/css/tramps.css" />" rel="stylesheet" type="text/css" media="screen" />
    <title>Listing Tramps</title>
</head>
<body>
<div class="container">
<h1>Tramps of New Zealand</h1>
<c:if test="${not empty tramps}">
 
    <table class="normal-table">
        <thead>
            <tr>
                <th>Key</th>
                <th>Name</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach var="tramp" items="${tramps}">
            <tr>
                <td>${tramp.key}</td>
                <td>${tramp.value}</td>
            </tr>
        </c:forEach>
        </tbody>
    </table>
</c:if>
 
</div>
</body>
</html>