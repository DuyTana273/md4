<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Dictionary</title>
</head>
<body>
<h1>English - Vietnamese Dictionary</h1>
    <form action="search" method="post">
        <label for="englishWord">Enter English Word:</label>
        <input type="text" name="englishWord" id="englishWord" required>
        <button type="submit">Search</button>
    </form>
</body>
</html>