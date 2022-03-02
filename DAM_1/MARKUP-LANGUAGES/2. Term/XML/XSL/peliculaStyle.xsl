<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/"> <!--Starts reading the XML tree from the root(banco is the root)-->
    <html> 
        <body>
            <h1>Pelikulen zerrenda</h1>

            <table border="1">
                <tr bgcolor="#704c78">
                    <td>Izenburua</td>
                    <td>Komentarioa</td>
                    <td>Autoreak</td>
                </tr>
                <xsl:for-each select="peliculas/pelicula">
                <tr>
                    <td><xsl:value-of select="titulo"/></td>
                    <td><xsl:value-of select="comentario"/></td>
                    <td>
                        <ul>
                            <xsl:for-each select="autor">
                                <li><xsl:value-of select="."/></li>
                            </xsl:for-each>
                        </ul>
                    </td>
                </tr>
                </xsl:for-each>
            </table>
        </body>
    </html>
</xsl:template>
</xsl:stylesheet>