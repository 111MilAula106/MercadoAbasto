package fonts;

import java.awt.Font;
import java.awt.FontFormatException;
import java.io.IOException;
import java.io.InputStream;

public class CustomFonts {

    private Font OpenSansBold = null;
    private Font OpenSansLight = null;
    private Font OpenSansRegular = null;

    public CustomFonts() {
        String osb = "OpenSans-Bold_0.ttf";
        try {
            InputStream isosb = getClass().getResourceAsStream(osb);
            OpenSansBold = Font.createFont(Font.TRUETYPE_FONT, isosb);
        } catch (FontFormatException | IOException ex) {
            System.err.println(osb + "No se cargo la fuente");
            OpenSansBold = new Font("Open Sans", Font.BOLD, 14);
        }
        
        String osl = "OpenSans-Light_0.ttf";
        try {
            InputStream isosl = getClass().getResourceAsStream(osl);
            OpenSansLight = Font.createFont(Font.TRUETYPE_FONT, isosl);
        } catch (FontFormatException | IOException ex) {
            System.err.println(osl + "No se cargo la fuente");
            OpenSansLight = new Font("Open Sans Light", Font.PLAIN, 14);
        }
        
        String osr = "OpenSans-Regular.ttf";
        try {
            InputStream isosr = getClass().getResourceAsStream(osr);
            OpenSansRegular = Font.createFont(Font.TRUETYPE_FONT, isosr);
        } catch (FontFormatException | IOException ex) {
            System.err.println(osr + "No se cargo la fuente");
            OpenSansRegular = new Font("Open Sans", Font.PLAIN, 14);
        }
    }

    public Font OpenSansBold(int style, float size) {
        Font tfont = OpenSansBold.deriveFont(style, size);
        return tfont;
    }
    
    public Font OpenSansLight(int style, float size) {
        Font tfont = OpenSansLight.deriveFont(style, size);
        return tfont;
    }
    
    public Font OpenSansRegular(int style, float size) {
        Font tfont = OpenSansRegular.deriveFont(style, size);
        return tfont;
    }
}
