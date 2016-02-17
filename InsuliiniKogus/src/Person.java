import javafx.beans.property.SimpleStringProperty;

import javax.xml.bind.annotation.XmlElement;

/**
 * Created by Taavi Tilk on 4.12.2015.
 */
public class Person  {

    private final SimpleStringProperty toit;
    private final SimpleStringProperty kogus;
    private final SimpleStringProperty yhik;




    public Person(String t, String k, String y) {
        toit = new SimpleStringProperty(t);
        kogus = new SimpleStringProperty(k);
        yhik = new SimpleStringProperty(y);
    }

    public String getToit() {
        return toit.get();
    }

    public void setToit(String t) {
        toit.set(t);
    }

    public String getKogus() {
        return kogus.get();
    }

    public void setKogus(String k) {
        kogus.set(k);
    }

    public String getYhik() {
        return yhik.get();
    }

    public void setYhik(String y) {
        yhik.set(y);
    }
}
