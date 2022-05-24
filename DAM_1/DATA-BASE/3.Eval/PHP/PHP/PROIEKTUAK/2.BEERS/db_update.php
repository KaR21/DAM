<html>
    <body> 
        <?php
        include("beers_connect.php");
        $id=$_POST["id"];
        $name=$_POST["nameb"];
        $picture=$_POST["picture"];
        $brevery=$_POST["breweryID"];
        $lotura= KonektatuDatuBasera();
        $emaitza= mysqli_query($lotura, "update beers set nameb ='$name', picture ='$picture', breweryID ='$brevery' WHERE id ='$id'");
        ?>
        <a href="db_beers_select.php">See all the beers</a><br>
        <a href="index.html">Go back</a>
    </body>
</html>