<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>

<nav class="navbar navbar-dark bg-dark">
    <a href="/index" class="navbar-header">Songs</a>

    <ul class="navbar-nav navbar-right flex-row">
        <c:choose>
            <c:when test="${isLogged != null}">
                <li class="nav-item"><a href="/logout" class="nav-link">Log Out</a></li>
            </c:when>
            <c:otherwise>
                <li class="nav-item">
                    <form class="form-inline" method="POST" action="/login">
                        <input  class="form-control mr-sm-2" type="text" placeholder="Username" name="username" value="${userInput}"/>
                        <input  class="form-control mr-sm-2" type="password" placeholder="Password" name="password" value="${passInput}">
                        <button class="btn btn-outline-success my-2 my-sm-0">Log In</button>
                    </form>
                </li>
                <li class="nav-item">
                    <a href="/signup" class="nav-link">Sign Up</a>
                </li>
            </c:otherwise>
        </c:choose>
    </ul>

</nav>
