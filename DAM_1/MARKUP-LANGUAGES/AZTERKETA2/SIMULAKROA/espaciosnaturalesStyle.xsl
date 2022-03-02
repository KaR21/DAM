<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
    <html> 
        <body>
            <h1>ESPACIOS NATURALES</h1>

            <table border="1">
                <tr bgcolor="#704c78">
                    <th>Documentname</th>
                    <th>Turismdescription</th>
                </tr>
                <xsl:for-each select="rows/row">
					<xsl:if test="@num > 30">
						<tr>
							<td><xsl:value-of select="documentname"/></td>
							<td><xsl:value-of select="turismdescription"/></td>
						</tr>
					</xsl:if>
                </xsl:for-each>
            </table>
        </body>
    </html>
</xsl:template>
</xsl:stylesheet>