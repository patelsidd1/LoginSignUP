<html>
<head>
    <title> Registration Page </title>
    <%@ include file = "./base.jsp"%>

    <style>
        body {
            background-image: url('https://img.freepik.com/free-photo/blur-field-texture_1160-907.jpg?t=st=1739258428~exp=1739262028~hmac=d21a3fc98454b1382dade84d4d6347f363fab0b462f516f381f1d62478075075&w=740');
            background-size: cover;
            background-position: center;
            background-repeat: no-repeat;
            background-attachment: fixed;
        }
        .container {
            background: rgba(255, 255, 255, 0.9);
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 10px 20px rgba(0, 0, 0, 0.1);
            max-width: 900px;
            margin: auto;
            margin-top: 50px;
        }
        .preview-container {
            text-align: center;
            margin-top: 10px;
        }
        .preview-img {
            width: 100px;
            height: 100px;
            border-radius: 50%;
            object-fit: cover;
            display: none;
            border: 2px solid #ddd;
            padding: 5px;
        }
    </style>

    <script>
        function previewImage(event) {
            var preview = document.getElementById('imagePreview');
            var file = event.target.files[0];

            if (file) {
                var reader = new FileReader();
                reader.onload = function (e) {
                    preview.src = e.target.result;
                    preview.style.display = 'block';
                };
                reader.readAsDataURL(file);
            }
        }
    </script>

</head>
<body>
    <div class="container">
        <h2 class="text-center" style="
            font-size: 2rem;
            font-weight: bold;
            color: #007bff;
            background: #007bff;
            color: white;
            padding: 15px;
            border-radius: 8px;
            letter-spacing: 1px;
            text-shadow: 2px 2px 4px rgba(0, 123, 255, 0.3);
            margin-bottom: 20px;
        ">
             Registration Form
        </h2>

        <form action="registerUser" method="post" enctype="multipart/form-data">

            <div class="row">
                <!-- Left Column -->
                <div class="col-md-6">
                    <div class="form-group">
                        <label style="font-weight: bold;">Mobile</label>
                        <input type="text" class="form-control" name="mobile" value="${mobile}" readonly>
                    </div>

                    <div class="form-group">
                        <label style="font-weight: bold;">Name</label>
                        <input type="text" class="form-control" name="name" placeholder="Enter name" required>
                    </div>

                    <div class="form-group">
                        <label style="font-weight: bold;">Email</label>
                        <input type="email" class="form-control" name="email" placeholder="Enter your Email" required>
                    </div>

                   <div class="form-group">
                       <label style="font-weight: bold;">Gender</label>
                       <div style="display: flex; gap: 30px; align-items: center; margin-top: 10px;">
                           <div>
                               <input type="radio" id="male" name="gender" value="male" required>
                               <label for="male" style="margin-left: 8px; font-size: 16px;">Male</label>
                           </div>
                           <div>
                               <input type="radio" id="female" name="gender" value="female">
                               <label for="female" style="margin-left: 8px; font-size: 16px;">Female</label>
                           </div>
                           <div>
                               <input type="radio" id="other" name="gender" value="other">
                               <label for="other" style="margin-left: 8px; font-size: 16px;">Other</label>
                           </div>
                       </div>
                   </div>


                </div>

                <!-- Right Column -->
                <div class="col-md-6">
                    <div class="form-group">
                        <label style="font-weight: bold;">City</label>
                        <input type="text" class="form-control" name="city" placeholder="Enter your city" required>
                    </div>

                    <div class="form-group">
                        <label style="font-weight: bold;">State</label>
                        <input type="text" class="form-control" name="state" placeholder="Enter your state" required>
                    </div>

                    <div class="form-group">
                        <label style="font-weight: bold;">Zip Code</label>
                        <input type="text" class="form-control" name="zipCode" placeholder="Enter zip code" required>
                    </div>

                    <!-- Image Upload Section -->
                    <div class="form-group">
                        <label style="font-weight: bold;">Upload Profile Image</label>
                        <input type="file" class="form-control" name="pImage" accept="image/*" onchange="previewImage(event)" required>

                        <!-- Image Preview -->
                        <div class="preview-container">
                            <img id="imagePreview" class="preview-img" alt="Profile Preview">
                        </div>
                    </div>
                </div>
            </div>

            <button type="submit" class="btn btn-success btn-block mt-3" style="font-size: 1.2rem; font-weight: bold;">
                Register
            </button>
        </form>
    </div>
</body>
</html>
