<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/">
<html>
  <head>
    <link rel="stylesheet" type="text/css" href="style.css" media="all" />
  </head>

  <body>
  <div id="osoa">
  <br></br>
	  <h1>CITAS HUMORISTICAS</h1>

	  <xsl:for-each select="citas/cita">
			<div id="citaBat">
				<p><b><xsl:value-of select="autor"/></b>
				<br></br>
				<i><xsl:value-of select="texto"/></i></p>
			</div>
	  </xsl:for-each>
	  <br></br>
  </div>
  

  </body>
</html>
</xsl:template>
</xsl:stylesheet>