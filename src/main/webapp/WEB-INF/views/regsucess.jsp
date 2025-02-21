
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>Registration Successful</title>
    <%@ include file = "./base.jsp"%>
    <style>
        body {
            background-image: url('https://img.freepik.com/free-photo/blur-field-texture_1160-907.jpg?t=st=1739258428~exp=1739262028~hmac=d21a3fc98454b1382dade84d4d6347f363fab0b462f516f381f1d62478075075&w=740');
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            background-attachment: fixed;
            text-align: center;
            font-family: Arial, sans-serif;
        }
        .container {
            margin-top: 50px;
        }
        .card {
            background: #ffffff;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.1);
            width: 400px;
            margin: auto;
        }
        h2 {
            color: #28a745;
        }
        .btn {
            display: block;
            width: 100%;
            padding: 10px;
            margin-top: 10px;
            font-size: 1.2rem;
            font-weight: bold;
            text-decoration: none;
            text-align: center;
            border-radius: 5px;
        }
        .btn-login {
            background-color: #007bff;
            color: white;
        }
        .btn-register {
            background-color: #28a745;
            color: white;
        }
    </style>
</head>
<body>

    <div class="container">
        <div class="card">
            <h2>Registration Completed Successfully!</h2>
            <p>Please login to continue.</p>

            <a href="${pageContext.request.contextPath}/login" class="btn btn-login">Go to Login</a>
            <a href="${pageContext.request.contextPath}/signup" class="btn btn-register">Register Another User</a>
        </div>
    </div>





</body>
</html>
