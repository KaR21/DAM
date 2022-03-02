<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/"> <!--Starts reading the XML tree from the root(banco is the root)-->
    <html> 
        <body>
            <h1>Pelikulen zerrenda</h1>

            <table border="1">
                <tr bgcolor="#704c78">
                    <td>Izenburua</td>
                    <td>Idazlea</td>
                    <td>Editoriala</td>
                    <td>Isbn</td>
                    <td>Orriak</td>
                </tr>
                <xsl:for-each select="liburutegia/liburua">
                    <xsl:sort select="orriak">
                        <tr>
                            <td><xsl:value-of select="izenburua"/></td>
                            <td><xsl:value-of select="idazlea"/></td>
                            <td><xsl:value-of select="editoriala"/></td>
                            <td><xsl:value-of select="isbn"/></td>
                            <td><xsl:value-of select="orriak"/></td>
                        </tr>
                    </xsl:sort>
                </xsl:for-each>
            </table>
        </body>
    </html>
</xsl:template>
</xsl:stylesheet>