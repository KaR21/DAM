<html>
    <body>
        
        <?php
        include("beers_connect.php");
        $id =$_POST["id"];
        $name =$_POST["nameb"];
        $brevery =$_POST["brevery"];
		
		# Array bidirekzionala da. Horretarako "$_FILES" metodoa erabiltzen da. 
	 	printf( 'Arrayan dagoen guztia bistaratu: <br>');
		print_r($_FILES);
		
		echo'<br><br>';
		echo 'Argazkiaren izena: --> ';
		print_r($_FILES['Argazk']['name']);
		
		echo'<br><br>';
		echo 'Argazki mota: --> ';
		print_r($_FILES['Argazk']['type']);
		
		echo'<br><br>';
		echo 'Argazkiaren helbidea: --> ';
		print_r($_FILES['Argazk']['tmp_name']);
	  
	
		$serbitzarikoHelbidea = 'Argazkiak'; 							# Karpeta sortu "Argazkiak", honen barruan beste bat "DB". 
		$helbideTemporala = 	$_FILES['Argazk']['tmp_name']; 				# Argazkiaren helbidea:
		$argazkiIzena = 		$_FILES['Argazk']['name']; 					# Argazki izena:
		$bukaeraHelbidea = 		$serbitzarikoHelbidea.'/'.$argazkiIzena; 	# Bukaerako helbidearen helbidea gorde. 
		move_uploaded_file($helbideTemporala,$bukaeraHelbidea);
	
        $lotura = KonektatuDatuBasera();
        $emaitza = mysqli_query($lotura, "insert into beers values('$id', '$name','".$bukaeraHelbidea."', '$brevery')");
        ?>
        <a href="db_beers_select.php">See all the beers</a><br>
        <a href="index.html">Go back</a>
    </body>

</html>