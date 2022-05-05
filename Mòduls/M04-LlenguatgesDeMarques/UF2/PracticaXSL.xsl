<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>
    <xsl:template match="/">
        <html>
            <head>
                <title>
                    <xsl:value-of select="parc/@nom"/>
                </title>
                <meta charset = "UTF-8"/>
                <link rel="stylesheet" type="text/css" href="horariParc.css"/>
            </head>
            <body>      
                <header class="capcalera">
                    <span>
                        <img alt="logoParc" width="50" height="50">
                            <xsl:attribute name="src">
                                <xsl:value-of select="parc/@logo"/>
                            </xsl:attribute>
                        </img>
                    </span>
                    <span class="nom">
                        <xsl:value-of select="parc/@nom"/>  
                    </span>
                </header>   
                <header class="dades">
                    Obrim del <xsl:value-of select="parc/dates/dataObertura"/> al <xsl:value-of select="parc/dates/dataTancament"/>
                </header>
                <xsl:for-each select ="parc/horaris/mes[@nom = 'Novembre']">
                    <header class="mes">
                        <xsl:value-of select="@nom"/>
                    </header>
                </xsl:for-each> 
                
                <table>
                    <tr>
                        <xsl:for-each select ="parc/horaris/mes[@nom = 'Juliol']/periode/diaSetmana">
                            <th>
                                <xsl:value-of select="text()"/>
                            </th>
                        </xsl:for-each>
                    </tr>
                    <tr>
                        <xsl:for-each select="parc/horaris/mes[@nom ='Novembre']/periode[@diaInici = '1']/diaSetmana">
                            <td>
                                <xsl:choose>
                                    <xsl:when test="not(@diaMes)">
                                        <div> </div>
                                    </xsl:when>
                                    <xsl:otherwise>
                                        <div class ="dia">
                                            <xsl:value-of select="@diaMes"/>
                                        </div> 
                                        <xsl:choose>
                                            <xsl:when test="not(@horaObertura)">
                                                <div>TANCAT</div>
                                            </xsl:when>
                                            <xsl:otherwise>
                                                <div>
                                                    <xsl:value-of select="@horaObertura"/> - <xsl:value-of select="@horaTancament"/>
                                                </div>
                                            </xsl:otherwise>
                                        </xsl:choose>
                                    </xsl:otherwise>
                                </xsl:choose>
                                    
                            </td>
                        </xsl:for-each>
                    </tr>
                    <tr>
                        <xsl:for-each select="parc/horaris/mes[@nom ='Novembre']/periode[@diaInici = '2']/diaSetmana">
                            <td>
                                <div class ="dia">
                                    <xsl:value-of select="@diaMes"/>
                                </div> 
                                <xsl:choose>
                                    <xsl:when test="not(@horaObertura)">
                                        <div>TANCAT</div>
                                    </xsl:when>
                                    <xsl:otherwise>
                                        <div>
                                            <xsl:value-of select="@horaObertura"/> - <xsl:value-of select="@horaTancament"/>
                                        </div>
                                    </xsl:otherwise>
                                </xsl:choose>  
                            </td>
                        </xsl:for-each>
                    </tr>
                    <tr>
                        <xsl:for-each select="parc/horaris/mes[@nom ='Novembre']/periode[@diaInici = '9']/diaSetmana">
                            <td>
                                <div class ="dia">
                                    <xsl:value-of select="@diaMes"/>
                                </div> 
                                <xsl:choose>
                                    <xsl:when test="not(@horaObertura)">
                                        <div>TANCAT</div>
                                    </xsl:when>
                                    <xsl:otherwise>
                                        <div>
                                            <xsl:value-of select="@horaObertura"/> - <xsl:value-of select="@horaTancament"/>
                                        </div>
                                    </xsl:otherwise>
                                </xsl:choose>  
                            </td>
                        </xsl:for-each>
                    </tr>
                    <tr>
                        <xsl:for-each select="parc/horaris/mes[@nom ='Novembre']/periode[@diaInici = '16']/diaSetmana">
                            <td>
                                <div class ="dia">
                                    <xsl:value-of select="@diaMes"/>
                                </div> 
                                <xsl:choose>
                                    <xsl:when test="not(@horaObertura)">
                                        <div>TANCAT</div>
                                    </xsl:when>
                                    <xsl:otherwise>
                                        <div>
                                            <xsl:value-of select="@horaObertura"/> - <xsl:value-of select="@horaTancament"/>
                                        </div>
                                    </xsl:otherwise>
                                </xsl:choose>  
                            </td>
                        </xsl:for-each>
                    </tr>
                    <tr>
                        <xsl:for-each select="parc/horaris/mes[@nom ='Novembre']/periode[@diaInici = '23']/diaSetmana">
                            <td>
                                <div class ="dia">
                                    <xsl:value-of select="@diaMes"/>
                                </div> 
                                <xsl:choose>
                                    <xsl:when test="not(@horaObertura)">
                                        <div>TANCAT</div>
                                    </xsl:when>
                                    <xsl:otherwise>
                                        <div>
                                            <xsl:value-of select="@horaObertura"/> - <xsl:value-of select="@horaTancament"/>
                                        </div>
                                    </xsl:otherwise>
                                </xsl:choose>  
                            </td>
                        </xsl:for-each>
                    </tr>
                    <tr>
                        <xsl:for-each select="parc/horaris/mes[@nom ='Novembre']/periode[@diaInici = '30']/diaSetmana">
                            <td>
                                 
                                <xsl:choose>
                                    <xsl:when test="not(@diaMes)">
                                        <div> </div>
                                    </xsl:when>
                                    <xsl:otherwise>
                                        <div class ="dia">
                                            <xsl:value-of select="@diaMes"/>
                                        </div> 
                                        <xsl:choose>
                                            <xsl:when test="not(@horaObertura)">
                                                <div>TANCAT</div>
                                            </xsl:when>
                                            <xsl:otherwise>
                                                <div>
                                                    <xsl:value-of select="@horaObertura"/> - <xsl:value-of select="@horaTancament"/>
                                                </div>
                                            </xsl:otherwise>
                                        </xsl:choose>
                                    </xsl:otherwise>
                                </xsl:choose>
                                    
                            </td>
                        </xsl:for-each>
                    </tr>
                </table>
                <footer class="dades">
                    <div>
                        <xsl:value-of select="parc/adreca"/>
                    </div>
                    <div>
                        <xsl:value-of select="parc/ciutat"/> - <xsl:value-of select="parc/pais"/> 
                    </div>
                    <div> web: <a>
                            <xsl:attribute name="href">
                                <xsl:value-of select="parc/paginaWeb"/>
                            </xsl:attribute>
                            <xsl:value-of select="parc/paginaWeb"/>
                        </a> 
                    </div>
                </footer>
            </body>
        </html>
    </xsl:template>

</xsl:stylesheet>
