<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/"> <!--Starts reading the XML tree from the root(banco is the root)-->

    <html> 
        <head>
            <link rel="stylesheet" type="text/css" href="style_peliculas.css"></link>
        </head>
        <body>
            <div id="erdian">

                <h1>Pelikulen zerrendak</h1>

                <table border="1">
                    <tr>
                        <th>Izenburua</th>
                        <th>Autorea</th>
                        <th>Komentarioa</th>
                    </tr>
                    <xsl:for-each select="peliculas/pelicula">
                        <tr>
                            <td><xsl:value-of select="titulo"/></td>
                            <td>
                                <ul>
                                        <xsl:for-each select="autor">
                                            <li><xsl:value-of select="."/></li>
                                        </xsl:for-each>    
                                </ul>
                            </td>
                            <td><xsl:value-of select="comentario"/></td>
                        </tr>  
                    </xsl:for-each>
                </table>
                <img src="film.jpg"/>
            </div>
        </body>
    </html>
</xsl:template>
</xsl:stylesheet>