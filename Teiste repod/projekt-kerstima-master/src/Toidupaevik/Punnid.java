package Toidupaevik;

import javafx.scene.control.CheckBox;
//klass võimaldab lisada toiduainele numbrilist väärtust (getter-setter), et saaks kasutada arvutamise meetodit
public class Punnid extends CheckBox {
    private int value;

    public int getValue() {
        return value;
    }
    public void setValue(int value) {
        this.value = value;
    }

    public Punnid(String text, int value) {
        super(text);
        this.value = value;
    }


    public Punnid (String text) {
        super(text);
    }

}
