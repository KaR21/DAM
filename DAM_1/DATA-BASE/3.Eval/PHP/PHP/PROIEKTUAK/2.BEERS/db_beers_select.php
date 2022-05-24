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
						$helbidea=$erregistroa["picture"];?>
						<img src="<?php echo $helbidea; ?>" width="180" height="214"><br><?php
						/*printf("<tr><td>&nbsp;%d</td><td>&nbsp;%s&nbsp;</td><td><img src ="echo $helbidea;"></td><td>&nbsp;%d&nbsp;</td></tr>", $erregistroa["id"],$erregistroa["nameb"],$erregistroa["breweryID"]);*/
					}
					mysqli_free_result($emaitza);
					mysqli_close($link);
				?>
			</table>
			<a href="index.html">Go back</a>
		</div>
		
	</body>
</html>