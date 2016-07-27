package Parser;

import Guns.Model;
import com.sun.prism.shader.Mask_TextureRGB_AlphaTest_Loader;
import jdk.internal.org.xml.sax.helpers.DefaultHandler;

import java.util.Vector;
import java.util.jar.Attributes;

/**
 * Created by Deniska on 7/6/2016.
 */
public class Parser extends DefaultHandler implements ConstNote {
    Vector models = new Vector();
    Model curr = new Model();
    int current = -1;

    public Parser() {

    }

    public void startDocument() {
        System.out.println("parsing started");
    }

    public void endDocument() {
        System.out.print("parsing ended");
    }

    public void startElement(String uri, String localName, String qName, Attributes attrs) {
        if (qName.equals("Model")) {
            curr = new Model();
            curr.setModel(attrs.getValue("0"));
        }
        if (qName.equals("FullRange")) current = FULLRANGE;
        else if (qName.equals("KillRange")) current = KILLRANGE;
        else if (qName.equals("Cage")) current = CAGE;
        else if (qName.equals("OPTIC"))
            current = OPTIC;
        else if (qName.equals("Material"))
            current = MATERIAL;
        else if (qName.equals("Origin"))
            current = ORIGIN;
        else if (qName.equals("Color"))
            current = COLOR;
        else if (qName.equals("Price"))
            current = PRICE;
    }

    public void endElement(String uri, String localName, String qName) {
        if (qName.equals("Model")) models.add(curr);
    }

    public void characters(char[] ch, int start, int length) {
        String s = new String(ch, start, length);
        try {
            switch (current) {
                case FULLRANGE:
                    curr.setName(s);
                    break;
                case KILLRANGE:
                    curr.setTel(Integer.parseInt(s));
                    break;
                case URL:
                    try {
                        curr.setUrl(new URL(s));
                    }
                    catch (MalformedURLException e) {
                    break;
                case STREET:
                    curr.address.setStreet(s);
                    break;
                case CITY:
                    curr.address.setCity(s);
                    break;
                case COUNTRY:
                    curr.address.setCountry(s);
                    break;
            }



    }



}}}
interface ConstNote {
    int FULLRANGE = 1, KILLRANGE = 2, CAGE = 3,
            OPTIC = 4, MATERIAL = 5, ORIGIN = 6, COLOR = 7, PRICE = 8;
}

