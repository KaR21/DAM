<html>

  <head>
    <title>login</title>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/css/bootstrap.min.css">
    <script src="https://cdn.jsdelivr.net/npm/jquery@3.5.1/dist/jquery.slim.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.1/dist/umd/popper.min.js"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@4.6.1/dist/js/bootstrap.bundle.min.js"></script>
    <style></style>
  </head>
    <div>

      <form action="kontsultatu_erabiltzaileak.php" method="post">
        
        <div class="form-group">
          <label for="UserName">Username:</label>
          <input type="text" class="form-control" placeholder="Enter the username" name="UserName">
        </div>

        <div class="form-group">
          <label for="Password">Password:</label>
          <input type="password" class="form-control" placeholder="Enter the password" name="Password">
        </div>


        <button type="submit" class="btn btn-primary bidali">Send</button>
        <button type="reset" class="btn btn-primary">Reset</button>
        
      </form>
    </div>

    <?php
      if(isset($_GET["okerra"])){
          if($_GET["okerra"]=="bai"){
              ?>

              <p style="color:#F00">
                  <b>Datuak txarto sartu dituzu</b></p>
              <img src="stop.png" style=float:left>

              <?php
          }
      }
      ?>
      <?php
      if(isset($_GET["datuakondo"])){
          if($_GET["datuakondo"]=="bai"){
            ?>

            <p style="color:#0F0">
                </table>
            </div>
            <?php
          }
      }
      ?>
  </body>
</html>