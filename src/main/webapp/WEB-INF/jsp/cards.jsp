<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Cards</title>
</head>
<body>
<h1>Here will be your cards</h1>
<table>
    <tr>
        <th>English</th>
        <th>Russian</th>
        <th>Transcription</th>
        <th>Type</th>
        <th>Level</th>
        <th>Attempt</th>
        <th>Streak</th>
    </tr>
    <jsp:useBean id="cards" scope="request" type="java.util.Set"/>
    <c:forEach var="card" items="${cards}">
        <tr>
            <td>${card.word.english}</td>
            <td>${card.word.russian}</td>
            <td>${card.word.transcription}</td>
            <td>${card.word.type}</td>
            <td>${card.word.englishLevel}</td>
            <td>${card.attempt}</td>
            <td>${card.streak}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
