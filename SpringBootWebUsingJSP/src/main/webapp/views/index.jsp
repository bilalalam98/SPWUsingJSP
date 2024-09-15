<%@page language="java"%>

<html>
<head>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <form action="add" id="additionForm">
     <h2>Addition Program</h2>
        <label for="number1">Number 1:</label>
        <input type="number" id="number1" name="number1" required><br><br>
        <label for="number2">Number 2:</label>
        <input type="number" id="number2" name="number2" required><br><br>
        <input type="submit" value="Submit">
    </form>
    <p id="result"></p>
</body>
</html>
