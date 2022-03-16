<html>
	<head>
		<link rel="STYLESHEET" TYPE="TEXT/CSS" HREF="style.css">    
		<title>Beer db</title>
	</head>
	<body>
		<?php
			include("beers_connect.php");
	
			$link=KonektatuDatuBasera();
	
			$emaitza=mysqli_query($link,"select * from beers");		
			
		?>
		<div class="taula">
			<h1>Insert beers</h1>
            <form action ="db_insert.php" method="post">
                <table>
                    <tr>
                        <Td>&nbsp;ID&nbsp;</Td> <td><input name="id" type="text" size="4"><br></td>               
                    </tr>
                    <tr>
                        <Td>&nbsp;NAME&nbsp;</Td> <td><input name="name" type="text"><br></td>               
                    </tr>
                    <tr>
                        <Td>&nbsp;PICTURE&nbsp;</Td> <td><input name="picture" type="text"><br></td>               
                    </tr>
                    <tr>
                        <Td>&nbsp;BREVERY_ID&nbsp;</Td> <td><input name="brevery" type="text" size="4"><br></td>               
                    </tr>
                    <tr>
                        <Td><input name="bidali" type="submit" value="txertatu"></td>  
                        <Td><input name="garbitu" type="reset" value="garbitu"></td>             
                    </tr>
                </table>
            </form>
			<a href="index.html">Go back</a>
		</div>
		
	</body>
</html>