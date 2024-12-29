<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:template match="/">
    <html>
    <link rel="stylesheet" href="Libros.css"/>
        <body>
            <h2>Mis Libros</h2>
            <table>
            <tr><th>Item</th><th>Fabricante</th></tr>
            <xsl:for-each select="//componente">
                <tr>
                    <td><xsl:value-of select="item"/></td>
                    <td><xsl:value-of select="fabricante"/></td>
                </tr>
            </xsl:for-each>
            </table>    
        </body>
    </html>
</xsl:template>
</xsl:stylesheet>