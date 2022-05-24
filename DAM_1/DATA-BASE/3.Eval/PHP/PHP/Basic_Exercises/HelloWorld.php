<!DOCTYPE html>
<html>
    <head>
        <style>
            table, td{
                border: black 1px solid;
            }
        </style>
    </head>
    <body>

        <h1>My first PHP page</h1>

        <?php
            printf("Bi zenbakia formatu desberdinekin: %d: %f: %.2f <br>", 2, 3, 4);
            for ($x = 0; $x <= 10; $x++) {
                echo "Hello World! <br>";
            }

        ?>
        <br>
        <table>
            <?php
                for ($x = 0; $x <= 10; $x++) {?>
                    <tr>
                        <td>
                            <?php echo $x; ?>
                        </td>
                    </tr>
                    <?php
                }
            ?>

        </table>
    </body>
</html>