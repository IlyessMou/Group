<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Create Quiz</title>
</head>
<body>
    <h2>Create a New Quiz</h2>
    <form:form method="POST" action="/quiz/create" modelAttribute="newQuiz">
        <div>
            <label for="quizName">Quiz Name:</label>
            <form:input path="title" id="quizName" type="text" />
            <form:errors path="title" cssClass="error"/>
        </div>

        <div>
            <label>Difficulty:</label>
            <form:select path="difficulty">
                <form:option value="easy">Easy</form:option>
                <form:option value="medium">Medium</form:option>
                <form:option value="hard">Hard</form:option>
                <form:option value="challenge">Challenge</form:option>
            </form:select>
            <form:errors path="difficulty" cssClass="error"/>
        </div>

        <div>
            <label>Privacy:</label>
            <form:select path="isPrivate">
                <form:option value="false">Public</form:option>
                <form:option value="true">Private</form:option>
            </form:select>
            <form:errors path="isPrivate" cssClass="error"/>
        </div>

        <div>
            <button type="submit" class="btn btn-primary">Create Quiz</button>
        </div>
    </form:form>
</body>
</html>
