<html>
    <body>
        <?php
        include("beers_connect.php");
        $id =$_POST["id"];
        $lotura = KonektatuDatuBasera();
        $emaitza = mysqli_query($lotura, "delete from beers where id ='$id'");
        ?>
        <a href="db_beers_select.php">See all the beers</a><br>
        <a href="index.html">Go back</a>
    </body>

</html>