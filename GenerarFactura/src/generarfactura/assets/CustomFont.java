package generarfactura.assets;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;

public class CustomFont {

    private Font antonio = null;
    private Font chunkfive = null;

    public CustomFont() {
        String antonioFontName = "Antonio-Bold.ttf";
        try {
            InputStream isAntonio = getClass().getResourceAsStream(antonioFontName);
            antonio = Font.createFont(Font.TRUETYPE_FONT, isAntonio);
        } catch (FontFormatException | IOException ex) {
            System.err.println(antonioFontName + "No se cargo la fuente");
            antonio = new Font("Arial", Font.PLAIN, 14);
        }
        
        String chunkfiveFontName = "chunkfive.ttf";
        try {
            InputStream isChunkfive = getClass().getResourceAsStream(chunkfiveFontName);
            chunkfive = Font.createFont(Font.TRUETYPE_FONT, isChunkfive);
        } catch (FontFormatException | IOException ex) {
            System.err.println(chunkfiveFontName + "No se cargo la fuente");
            chunkfive = new Font("Arial", Font.PLAIN, 14);
        }
    }

    public Font Antonio(int style, float size) {
        Font tfont = antonio.deriveFont(style, size);
        return tfont;
    }
    
    public Font Chunkfive(int style, float size) {
        Font tfont = chunkfive.deriveFont(style, size);
        return tfont;
    }
}
