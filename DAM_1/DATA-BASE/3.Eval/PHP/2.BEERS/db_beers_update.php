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
			<table BORDER=1 >
				<Tr>
					<Th>&nbsp;ID</Th>
					<Th>&nbsp;NAME&nbsp;</Th>
					<Th>&nbsp;PICTURE&nbsp;</Th>
					<Th>&nbsp;BREVERY_ID&nbsp;</Th>
				</Tr>
				<?php
					while($erregistroa = mysqli_fetch_array($emaitza))
					{
		
						printf("<tr><td>&nbsp;%d</td><td>&nbsp;%s&nbsp;</td><td>&nbsp;%s&nbsp;</td><td>&nbsp;%d&nbsp;</td></tr>", $erregistroa["id"],$erregistroa["nameb"],$erregistroa["picture"],$erregistroa["breweryID"]);
					}
					mysqli_free_result($emaitza);
					mysqli_close($link);
				?>
			</table>
		</div>

		<div class="taula">
			<h1>Update beers</h1>
            <form action ="db_update.php" method="post">
            <table>
                    <tr>
                        <Td>&nbsp;ID&nbsp;</Td> <td><input name="id" type="text" size="4"><br></td>               
                    </tr>
                    <tr>
                        <Td>&nbsp;NAME&nbsp;</Td> <td><input name="nameb" type="text"><br></td>               
                    </tr>
                    <tr>
                        <Td>&nbsp;PICTURE&nbsp;</Td> <td><input name="picture" type="text"><br></td>               
                    </tr>
                    <tr>
                        <Td>&nbsp;BREVERY_ID&nbsp;</Td> <td><input name="breweryID" type="text" size="4"><br></td>               
                    </tr>
                    <tr>
                        <Td><input name="bidali" type="submit" value="update"></td>  
                        <Td><input name="garbitu" type="reset" value="garbitu"></td>             
                    </tr>
                </table>
            </form>
			<a href="index.html">Go back</a>
		</div>
		
	</body>
</html>