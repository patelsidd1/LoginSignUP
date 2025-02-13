<html>
<head>
<title> Registration Page </title>
  <%@ include file = "./base.jsp"%>

  <style>
            body {
                background-image: url('https://img.freepik.com/free-photo/blur-field-texture_1160-907.jpg?t=st=1739258428~exp=1739262028~hmac=d21a3fc98454b1382dade84d4d6347f363fab0b462f516f381f1d62478075075&w=740'); /* Path to your image */
                background-size: cover;
                background-position: center;
                background-repeat: no-repeat;
                background-attachment: fixed;
            }
    </style>


</head>
<body>
<div style="display: flex; justify-content: center; align-items: center; height: 110vh;">
    <div class="card shadow-lg p-4" style="width: 400px; border-radius: 10px; background: #f8f9fa;">
        <div class="card-header bg-primary text-white text-center" style="font-size: 1.5rem; font-weight: bold;">
            Registration Form
        </div>
        <div class="card-body">
            <form  action="registerUser" method="post">
                <div  class="form-group">
                    <label style="font-weight: bold;">Mobile</label>
                    <input type="text" class="form-control" name="mobile" value="${mobile}" readonly>
                </div>

                <div class="form-group">
                    <label for="firstName" style="font-weight: bold;">Name</label>
                    <input type="text" class="form-control" name="name" placeholder="Enter name" required>
                </div>

                <div class="form-group">
                    <label for="email" style="font-weight: bold;">Email</label>
                    <input type="text" class="form-control" name="email" placeholder="Enter your Email" required>
                </div>

                <div class="form-group">
                    <label style="font-weight: bold;">Gender</label>
                    <div style="display: flex; gap: 15px; margin-top: 5px;">
                        <div>
                            <input type="radio" id="male" name="gender" value="male" required>
                            <label for="male">Male</label>
                        </div>
                        <div>
                            <input type="radio" id="female" name="gender" value="female">
                            <label for="female">Female</label>
                        </div>
                        <div>
                            <input type="radio" id="other" name="gender" value="other">
                            <label for="other">Other</label>
                        </div>
                    </div>
                </div>

                <div class="form-group">
                    <label for="city" style="font-weight: bold;">City</label>
                    <input type="text" class="form-control" name="city" placeholder="Enter your city" required>
                </div>

                <div class="form-group">
                    <label for="state" style="font-weight: bold;">State</label>
                    <input type="text" class="form-control" name="state" placeholder="Enter your state" required>
                </div>

                <div class="form-group">
                    <label for="zipCode" style="font-weight: bold;">Zip Code</label>
                    <input type="text" class="form-control" name="zipCode" placeholder="Enter zip code" required>
                </div>

                <button type="submit" class="btn btn-success btn-block" style="font-size: 1.2rem; font-weight: bold;">
                    Register
                </button>
            </form>
        </div>
    </div>
</div>
</body>
</html>
