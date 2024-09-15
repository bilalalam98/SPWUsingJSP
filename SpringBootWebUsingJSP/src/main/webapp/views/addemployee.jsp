<%@page language="java"%>
<html>
<head>
    <link rel="stylesheet" type="text/css" href="styles.css">
</head>
<body>
    <form action="employee/add" id="employeeForm">
        <h2>Employee Form</h2>
        <label for="employeeId">Employee ID:</label>
        <input type="text" id="eid" name="eid" required><br><br>


        <label for="employeeName">Employee Name:</label>
        <input type="text" id="ename" name="ename" required><br><br>

        <input type="submit" value="Submit">
    </form>
</body>
</html>