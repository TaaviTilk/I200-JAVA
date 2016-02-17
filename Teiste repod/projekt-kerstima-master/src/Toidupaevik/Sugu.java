package Toidupaevik;

import javafx.scene.control.CheckBox;
//lisab naine-mees valikule väärtuse (numbrilise), et saaks siduda lubatud ülempiiriga
public class Sugu extends CheckBox {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }
    public Sugu (String text, int value){
        super(text);
        this.value = value;
    }
    public Sugu (String text){
        super(text);
    }
}
