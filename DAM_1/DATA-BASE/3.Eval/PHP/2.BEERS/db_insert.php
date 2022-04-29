<html>
    <body>
        
        <?php
        include("beers_connect.php");
        $id =$_POST["id"];
        $name =$_POST["nameb"];
        $picture =$_POST["picture"];
        $brevery =$_POST["brevery"];
        $lotura = KonektatuDatuBasera();
        $emaitza = mysqli_query($lotura, "insert into beers values('$id', '$name','$picture', '$brevery')");
        ?>
        <a href="db_beers_select.php">See all the beers</a><br>
        <a href="index.html">Go back</a>
    </body>

</html>