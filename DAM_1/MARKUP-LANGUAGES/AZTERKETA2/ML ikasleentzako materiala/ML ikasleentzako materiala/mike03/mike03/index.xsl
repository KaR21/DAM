<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/">
<html>
  <head>
    <title>mike03</title>
	<meta http-equiv="content-type" content="application/xhtml+xml; charset=iso-8859-1"/>
	<link rel="stylesheet" href="mike03.css" type="text/css"/>
  </head>

  <body>
	<div id="container">
  <div id="headerWrap">
    <div id="header">
      <h1><a href="http://www.free-css.com/">mike03</a></h1>
      <ul id="navigation">
        <li><a href="http://www.free-css.com/">Page5</a></li>
        <li><a href="http://www.free-css.com/">Page4</a></li>
        <li><a href="http://www.free-css.com/">Page3</a></li>
        <li><a href="http://www.free-css.com/">Page2</a></li>
        <li><a href="http://www.free-css.com/">Home</a></li>
      </ul>
    </div>
  </div>
  <div id="content">
    <div id="contentHeader">
      <div id="siteDescription">
        <p>Here could be the description of your cool site!</p>
      </div>
    </div>
    <div id="main">
      <div class="post">
        <h2>Telefonoak</h2>
		<table border="1">
                <tr>
                    <th>Izena</th>
                    <th>Abizena</th>
					<th>Abdina</th>
                    <th>Telefonoak</th>
                </tr>
                <xsl:for-each select="agenda/contacto">
					<tr>
						<td><xsl:value-of select="nombre"/></td>
						<td><xsl:value-of select="apellido"/></td>
						<td><xsl:value-of select="edad"/></td>
						<td><xsl:for-each select="telefonos">
							<ul><xsl:value-of select="telcasa"/></ul>
							<ul><xsl:value-of select="telmovil"/></ul>
							<ul><xsl:value-of select="teltrabajo"/></ul>
						</xsl:for-each></td>
					</tr>
                </xsl:for-each>
            </table>
      </div>
      
    </div>
    <div id="secondary">
      <h2>About</h2>
      <p>Here could be some sidebar. You can put here whatever you want. May be some linkroll or some 
        additional information</p>
      <h2>Version</h2>
      <p>Template: mike03</p>
      <p>Current template version: 1.3 (05/01/07)</p>
      <h2>Search</h2>
      <form method="get" id="searchform" action="#">
        <fieldset>
        <input type="text" name="s" id="searchtext"/>
        <input type="submit" id="searchsubmit" value="search"/>
        </fieldset>
      </form>
    </div>
  </div>
  <div id="footer">
    <p>2006  Courtesy | Design by <a href="http://www.mikeyarmish.com">Mike Yarmish</a><a href="http://www.svinus.be">Svinus zoekmachine optimalisatie</a></p>
  </div>
</div>
  

  </body>
</html>
</xsl:template>
</xsl:stylesheet>