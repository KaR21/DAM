<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
  <xsl:template match="/">
<html>
  <head>
    <link rel="stylesheet" type="text/css" href="style.css" media="all" />
  </head>

  <body>
	<div id="divh">
	  <h1><xsl:value-of select="tienda/nombre"/></h1>
	  <h3><xsl:value-of select="tienda/telefono"/></h3>
	  </div>
	    <div id="osoa">
		<table>
			<tr>
				<th>Kodigoa</th>
				<th>Artikulua</th>
				<th>Ezaugarriak</th>
				<th>Prezioa</th>
			</tr>
			<xsl:for-each select="tienda/producto">
				<tr>
					<td><xsl:value-of select="codigo"/></td>
					<td><xsl:value-of select="articulo"/></td>
					<td><xsl:for-each select="caracteristicas/linea">
						<ul><xsl:value-of select="."/></ul>
					</xsl:for-each></td>
					<td><xsl:value-of select="precio"/></td>
				</tr>
			</xsl:for-each>
		</table>
		<img src="irratia.png"/>
	</div>
  

  </body>
</html>
</xsl:template>
</xsl:stylesheet>