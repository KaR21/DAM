<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/"> <!--Starts reading the XML tree from the root(banco is the root)-->
    <html> 
        <body>
            <h1>Pelikulen zerrenda</h1>

            <table border="1">
                <tr bgcolor="#704c78">
                    <td>Izena</td>
                    <td>Prezioa</td>
                    <td>Stock kopurua</td>
                    <td>Herria</td>
                </tr>
                <xsl:for-each select="products/product">
                
                    <xsl:sort select="price">
                        <tr>
                            <td><xsl:value-of select="name"/></td>
                            <td><xsl:value-of select="price"/></td>
                            <td><xsl:value-of select="stock"/></td>
                            <td><xsl:value-of select="country"/></td>
                        </tr>
                    </xsl:sort>
                </xsl:for-each>
            </table>
        </body>
    </html>
</xsl:template>
</xsl:stylesheet>