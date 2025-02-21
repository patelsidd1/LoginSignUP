<!doctype html>
<html lang="en">
<head>
  <title>Dashboard</title>
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
            margin-top: 50px;
            display: flex;
            justify-content: center;
        }
        .user-card {
            background: #ffffff;
            padding: 20px;
            border-radius: 10px;
            box-shadow: 0px 4px 10px rgba(0, 0, 0, 0.1);
            width: 400px;
        }
        .user-card h3 {
            text-align: center;
            color: #007bff;
            margin-bottom: 20px;
        }
        .user-detail {
            display: flex;
            justify-content: space-between;
            padding: 8px 0;
            border-bottom: 1px solid #ddd;
        }
        .user-detail:last-child {
            border-bottom: none;
        }
        .label {
            font-weight: bold;
            color: #333;
        }
  </style>

</head>
<body>

       <div class="container">
           <div class="user-card">
               <h3>${user.name}</h3>
               <div class="user-detail">
                   <span class="label"></span>
                   <img src="<c:url value='/images/${user.profileImage}' />" alt="User Image" style="width: 100px; height: 100px; border-radius: 50%;">
               </div>
               <div class="user-detail">
                   <span class="label">Mobile No:</span>
                   <span>${user.mobile}</span>
               </div>
               <div class="user-detail">
                   <span class="label">Name:</span>
                   <span>${user.name}</span>
               </div>
               <div class="user-detail">
                   <span class="label">Email:</span>
                   <span>${user.email}</span>
               </div>
               <div class="user-detail">
                   <span class="label">Gender:</span>
                   <span>${user.gender}</span>
               </div>
               <div class="user-detail">
                   <span class="label">City:</span>
                   <span>${user.city}</span>
               </div>
               <div class="user-detail">
                   <span class="label">State:</span>
                   <span>${user.state}</span>
               </div>
               <div class="user-detail">
                   <span class="label">Zip Code:</span>
                   <span>${user.zipCode}</span>
               </div>


           </div>
       </div>

       </body>
</html>
