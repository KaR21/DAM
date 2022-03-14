<html>
	<head>
		<link rel="STYLESHEET" TYPE="TEXT/CSS" HREF="style.CSS">    
		<title>Beer db</title>
	</head>
	<body>
		<?php
			include("beers.php");
	
			$link=KonektatuDatuBasera();
	
			$emaitza=mysqli_query($link,"select * from beers");		
			
		?>
		<TABLE BORDER=1 >
			<Tr>
				<Th>&nbsp;ID</Th>
                <Th>&nbsp;NAME&nbsp;</Th>
                <Th>&nbsp;PICTURE&nbsp;</Th>
                <Th>&nbsp;BREVERY_ID&nbsp;</Th>
			</Tr>
			<?php
				while($erregistroa = mysqli_fetch_array($emaitza))
				{
	
					printf("<tr><td>&nbsp;%d</td><td>&nbsp;%s&nbsp;</td><td>&nbsp;%s&nbsp;</td><td>&nbsp;%d&nbsp;</td></tr>", $erregistroa["id"],$erregistroa["name"],$erregistroa["picture"],$erregistroa["breweryID"]);
				}
				mysqli_free_result($emaitza);
				mysqli_close($link);
			?>
		</table>
	</body>
</html>