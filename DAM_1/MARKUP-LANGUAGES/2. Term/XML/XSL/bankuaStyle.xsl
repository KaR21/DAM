<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/"> <!--Starts reading the XML tree from the root(banco is the root)-->
    <html> 
        <body>
            <h1>Nire bankua</h1>
            <h3>Kontu zkia saldoa</h3>

            <table border="1">
                <tr bgcolor="#704c78">
                    <td>Kontu zkia</td>
                    <td>Saldoa</td>
                </tr>
                <xsl:for-each select="banco/cuenta">
                <tr>
                    <td><xsl:value-of select="numero-cuenta"/></td>
                    <td><xsl:value-of select="saldo"/></td>
                </tr>
                </xsl:for-each>
            </table>
        </body>
    </html>
</xsl:template>
</xsl:stylesheet>