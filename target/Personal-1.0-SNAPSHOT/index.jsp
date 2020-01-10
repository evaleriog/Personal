<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <h1>Welcome to my personal website</h1>


    <c:forEach var="song" items="${songs}">
        <div>
            <h2>Song Name: ${song.song_name}</h2>
            <p>Album: ${song.album_name}</p>
        </div>
    </c:forEach>

    <p>This is a test to see if we can create a new full-stack application</p>
</body>
</html>