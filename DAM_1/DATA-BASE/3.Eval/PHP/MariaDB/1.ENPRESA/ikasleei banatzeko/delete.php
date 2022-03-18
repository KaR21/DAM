
<html>
	<body>
		<?php
	include("test_connect_db.php");			
	$link=KonektatuDatuBasera();
	$id = $_GET["lang_identifikatzailea"];

	$emaitza = mysqli_query($link, "delete from langilea where langile_ID ='$id'");

	$kontsulta=mysqli_query($link,"select * from langilea");
		
		?>
		<TABLE BORDER=1 >
			<Tr>
				<Th>&nbsp;Langilearen identifikatzailea</Th><Th>&nbsp;Langilearen izena&nbsp;</Th>
			</Tr>
			<?php
				while($erregistroa = mysqli_fetch_array($kontsulta))
				{	
					
					printf("<tr><td>&nbsp;%s</td><td>&nbsp;%s&nbsp;</td></tr>", $erregistroa["langile_ID"],$erregistroa["langile_izena"]);
				}
				mysqli_free_result($kontsulta);
				mysqli_close($link);
			?>
		</table>
		
	</body>
</html>