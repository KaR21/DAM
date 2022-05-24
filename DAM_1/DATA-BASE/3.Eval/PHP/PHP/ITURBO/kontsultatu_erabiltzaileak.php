<html>
	<head>
		<link rel="STYLESHEET" TYPE="TEXT/CSS" HREF="style_php.CSS">      
		<title>insert</title>
	</head>
	<body>


    <?php
			include("connect_db.php");

            $UserName=$_POST["UserName"];
            $Password=$_POST["Password"];

            $link=KonektatuDatuBasera();
			$emaitza=mysqli_query($link,"select UserName, Password
                                        from erabiltzaileak
                                        where UserName = '$UserName'
                                            and Password = '$Password'
                                            ");

            if(mysqli_num_rows($emaitza)==0){
                header("Location:logeatu.php?okerra=bai");
            }
            else{
                session_start();
                $_SESSION['UserName'] = $UserName;
                header("Location:logeatu.php?datuakondo=bai");
            }
            ?>
        <br>