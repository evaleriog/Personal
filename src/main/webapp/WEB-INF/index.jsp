<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Welcome"/>
    </jsp:include>
</head>
<body>

    <jsp:include page="/WEB-INF/partials/navbar.jsp"></jsp:include>

    <h1>Welcome <c:out value="${user.getUsername()}"></c:out></h1>

    <c:forEach var="song" items="${songs}">
        <div>
            <h2>Song Name: ${song.song_name}</h2>
            <p>Album: ${song.album_name}</p>
        </div>
    </c:forEach>

    <p>This is a test to see if we can create a new full-stack application</p>
    <jsp:include page="/WEB-INF/partials/scripts.jsp"></jsp:include>
</body>
</html>