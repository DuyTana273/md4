<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>Currency Converter</title>
</head>
<body>
<h1>Currency Converter: USD to VND</h1>
<form action="convert" method="post">
  <label for="usdAmount">Amount in USD:</label>
  <input type="number" name="usdAmount" id="usdAmount" step="0.01" required>
  <button type="submit">Convert</button>
</form>
</body>
</html>