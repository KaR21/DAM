<html>
    <body>
        
        <h1>Zure datuak ondo gorde dira!</h1>
        Your name is: <?php echo $_POST["uname"]; ?><br><br>
        Your password is: <?php echo $_POST["pswd"]; ?><br><br>
        <?php if(isset($_POST["bodywork_type"])){
            $aBT = $_POST["bodywork_type"];
            $X = count($aBT); 
            echo("You selected $X of body-work type(s):");
            for($i=0; $i < $X; $i++)
            {
                echo($aBT[$i] . " ");
            }
        }
        ?><br><br>
        <?php if(isset($_POST["fuel_type"])){
            $aF = $_POST["fuel_type"];
            $X = count($aF); 
            echo("You selected $X of fuel type(s):");
            for($i=0; $i < $X; $i++)
            {
                echo($aF[$i] . " ");
            }
        }
        ?><br><br>
        Your color is: <?php echo $_POST["favcolor"]; ?><br><br>
        <?php if(isset($_POST["extra"])){
            $aE = $_POST["extra"];  
            $X = count($aE); 
            echo("You selected $X of extra(s):");
            for($i=0; $i < $X; $i++)
            {
                echo($aE[$i] . " ");
            }
        }
        ?><br><br>
        Your range of prize is: <?php echo $_POST["prize"]; ?><br><br>
        Your comment is: <?php echo $_POST["comment"]; ?>
    </body>
</html>