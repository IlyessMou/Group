<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>Create Quiz</h2>
<form action="/quiz/create" method="POST">
    <label>Name:</label>
    <input type="text" name="name" required />
    <label>Difficulty:</label>
    <select name="difficulty">
        <option value="easy">Easy</option>
        <option value="medium">Medium</option>
        <option value="hard">Hard</option>
        <option value="challenge">Challenge</option>
    </select>
    <label>Privacy:</label>
    <select name="isPrivate">
        <option value="false">Public</option>
        <option value="true">Private</option>
    </select>
    <button type="submit">Next</button>
</form>

</body>
</html>