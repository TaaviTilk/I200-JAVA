
package Toidupaevik;

import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.TextAlignment;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.util.ArrayList;
import java.util.List;


public class Tervitus {

    Button buttonArvuta;//arvutamise nupp
    Button buttonClose; //akna sulgemise nupp
    Button buttonTyhista; //tühista valiku nupp
    Button buttonJuhis; //selgitava akna nupp
    static boolean answer; //tõevärtus true v false

    Label resultLabelTarbinud; //oled tabinud
    Label resultLabelSooveel; //võid veel süüa
    Label resultLabelYlesoodud; //ületasid lubatud koguse


        ListView<String> listView;
    private List<Punnid> intValueCheckboxList = new ArrayList<>();//toiduainete massiiv
    private List<Sugu> intValueCheckboxList1 = new ArrayList<>();//mees-naine valiku massiiv
    Stage primaryStage = new Stage();

    Tervitus() {
        setupScene();//meetod, mis paneb paika stseeni
        setupNupp();//paneb paika arvuta/sulge/tühista nupud
    }

    private void setupScene() {

        resultLabelTarbinud = new Label();
        resultLabelSooveel = new Label();
        resultLabelYlesoodud = new Label();



        GridPane grid = new GridPane();//võimaldab stseeni jagada osadeks, et iga asi oleks õiges kohas
        Scene scene = new Scene(grid, 1200, 800);// stseeni mõõdud
        grid.setPadding(new Insets(10, 10, 10, 10)); //tekitab 10pixelise ääre ümber
        grid.setVgap(10);//tekitab vertikaalselt vahed
        grid.setHgap(10); //horisontaalselt vahed
        grid.setStyle("-fx-background-color: palegreen");//no saad taustavärvi


        Label tervitus = new Label("Tere kaalujälgija!");
        tervitus.setFont(new Font("Forte", 24));//seab fondi
        GridPane.setConstraints(tervitus, 0, 0);//seab sildi esimesse tulpa ja esimesse lahtrisse

        Label Piimatooted = new Label("Piimatooted");
        Piimatooted.setFont(new Font("Forte", 24));//font muutus
        GridPane.setConstraints(Piimatooted, 0, 2);//esimene on tulba, teine rea number
        Label Piim = new Label("2 portsu");
        GridPane.setConstraints(Piim, 0, 3);

        Punnid box1 = new Punnid("Rasvata piim, 300 ml", 90);
        intValueCheckboxList.add(box1);
        GridPane.setConstraints(box1, 0, 4);
        Punnid box2 = new Punnid("1% piim, 200 ml", 90);
        intValueCheckboxList.add(box2);
        GridPane.setConstraints(box2, 0, 5);
        Punnid box3 = new Punnid("2,5% piim, 200 ml", 90);
        intValueCheckboxList.add(box3);
        GridPane.setConstraints(box3, 0, 6);
        Punnid box4 = new Punnid("1% keefiir, 200 ml", 90);
        intValueCheckboxList.add(box4);
        GridPane.setConstraints(box4, 0, 7);
        Punnid box5 = new Punnid("2,5% keefir, 100 ml", 90);
        intValueCheckboxList.add(box5);
        GridPane.setConstraints(box5, 0, 8);
        Punnid box6 = new Punnid("jogurt (<100 cal), 100 ml", 90);
        intValueCheckboxList.add(box6);
        GridPane.setConstraints(box6, 0, 9);

        Label Teraviljatooted = new Label("Teraviljatooted");
        Teraviljatooted.setFont(new Font("Forte", 24));
        GridPane.setConstraints(Teraviljatooted, 1, 2);
        Label Tera = new Label("4 portsu");
        GridPane.setConstraints(Tera, 1, 3);

        Punnid box7 = new Punnid("leib, keskmine viil, 30 g", 80);
        intValueCheckboxList.add(box1);
        GridPane.setConstraints(box7, 1, 4);
        Punnid box8 = new Punnid("makaronid keedetud, 100 ml", 80);
        intValueCheckboxList.add(box8);
        GridPane.setConstraints(box8, 1, 5);
        Punnid box9 = new Punnid("puder (riis, tatar, manna jt) 100 ml", 80);
        intValueCheckboxList.add(box9);
        GridPane.setConstraints(box9, 1, 6);
        Punnid box10 = new Punnid("helbed (kaera, riisi jne) 75 ml", 80);
        intValueCheckboxList.add(box10);
        GridPane.setConstraints(box10, 1, 7);
        Punnid box11 = new Punnid("müsli, 3 spl", 80);
        intValueCheckboxList.add(box11);
        GridPane.setConstraints(box11, 1, 8);
        Punnid box12 = new Punnid("herned (toored, konserv) 120 g", 80);
        intValueCheckboxList.add(box12);
        GridPane.setConstraints(box12, 1, 9);
        Punnid box13 = new Punnid("mais (toores, konserv) 80 g", 80);
        intValueCheckboxList.add(box13);
        GridPane.setConstraints(box13, 1, 10);
        Punnid box14 = new Punnid("kartul 2 pisikest v 1 keskmine", 80);
        intValueCheckboxList.add(box14);
        GridPane.setConstraints(box14, 1, 11);

        Label Rasvad = new Label("Rasvad");
        Rasvad.setFont(new Font("Forte", 24));
        GridPane.setConstraints(Rasvad, 2, 2);
        Label Rasv = new Label("2 portsu");
        GridPane.setConstraints(Rasv, 2, 3);

        Punnid box15 = new Punnid("majonees, 1 tl", 40);
        intValueCheckboxList.add(box15);
        GridPane.setConstraints(box15, 2, 4);
        Punnid box16 = new Punnid("taimeõli, 1 tl", 40);
        intValueCheckboxList.add(box16);
        GridPane.setConstraints(box16, 2, 5);
        Punnid box17 = new Punnid("pähklid 7g, ca 5tk", 40);
        intValueCheckboxList.add(box17);
        GridPane.setConstraints(box17, 2, 6);
        Punnid box18 = new Punnid("juust, 30 g", 40);
        intValueCheckboxList.add(box18);
        GridPane.setConstraints(box18, 2, 7);

        Label Proteiinid = new Label("Proteiinid");
        Proteiinid.setFont(new Font("Forte", 24));
        GridPane.setConstraints(Proteiinid, 3, 2);
        Label Prot = new Label("3 portsu");
        GridPane.setConstraints(Prot, 3, 3);

        Punnid box19 = new Punnid("liha (kana, veis, väherasvane siga jt) 30 g", 60);
        intValueCheckboxList.add(box19);
        GridPane.setConstraints(box19, 3, 4);
        Punnid box20 = new Punnid("kala (heik, lest jt väherasvased) 60 g", 60);
        intValueCheckboxList.add(box20);
        GridPane.setConstraints(box20, 3, 5);
        Punnid box21 = new Punnid("kala (angerjas, lõhe, räim, suitsukala) 30 g", 60);
        intValueCheckboxList.add(box21);
        GridPane.setConstraints(box21, 3, 6);
        Punnid box22 = new Punnid("kodujuust 80 g", 60);
        intValueCheckboxList.add(box22);
        GridPane.setConstraints(box22, 3, 7);
        Punnid box23 = new Punnid("kohupiim < 10 % rasva, 80 g", 60);
        intValueCheckboxList.add(box23);
        GridPane.setConstraints(box23, 3, 8);
        Punnid box24 = new Punnid("vähk, krabi, krabipulk, 30 g", 60);
        intValueCheckboxList.add(box24);
        GridPane.setConstraints(box24, 3, 9);
        Punnid box25 = new Punnid("vorst, poolfabrikaadid, 30 g", 60);
        intValueCheckboxList.add(box25);
        GridPane.setConstraints(box25, 3, 10);
        Punnid box26 = new Punnid("muna, 1 tk", 60);
        intValueCheckboxList.add(box26);
        GridPane.setConstraints(box26, 3, 11);

        Label Puuviljad = new Label("Puuviljad");
        Puuviljad.setFont(new Font("Forte", 24));
        GridPane.setConstraints(Puuviljad, 4, 2);
        Label Puuv = new Label("3 portsu");
        GridPane.setConstraints(Puuv, 4, 3);

        Punnid box27 = new Punnid("apelsin, 1 keskmine", 60);
        intValueCheckboxList.add(box27);
        GridPane.setConstraints(box27, 4, 4);
        Punnid box28 = new Punnid("banaan, 1/2", 60);
        intValueCheckboxList.add(box28);
        GridPane.setConstraints(box28, 4, 5);
        Punnid box29 = new Punnid("greip, 1/2", 60);
        intValueCheckboxList.add(box29);
        GridPane.setConstraints(box29, 4, 6);
        Punnid box30 = new Punnid("kiivi, 1 tk", 60);
        intValueCheckboxList.add(box30);
        GridPane.setConstraints(box30, 4, 7);
        Punnid box31 = new Punnid("õun, 1 keskmine", 60);
        intValueCheckboxList.add(box31);
        GridPane.setConstraints(box31, 4, 8);
        Punnid box32 = new Punnid("viinamarjad 100 g", 60);
        intValueCheckboxList.add(box32);
        GridPane.setConstraints(box32, 4, 9);
        Punnid box33 = new Punnid("nektariin, 1 keskmine", 60);
        intValueCheckboxList.add(box33);
        GridPane.setConstraints(box33, 4, 10);
        Punnid box34 = new Punnid("pirn, 1 keskmine", 60);
        intValueCheckboxList.add(box34);
        GridPane.setConstraints(box34, 4, 11);
        Punnid box35 = new Punnid("ploom, 3 keskmist", 60);
        intValueCheckboxList.add(box35);
        GridPane.setConstraints(box35, 4, 12);
        Punnid box36 = new Punnid("marjad 120 g", 60);
        intValueCheckboxList.add(box36);
        GridPane.setConstraints(box36, 4, 13);

        Image image = new Image(getClass().getResourceAsStream("naine.png"));//lisab pildid
        Image image1 = new Image(getClass().getResourceAsStream("mees.png"));

        Sugu box37 = new Sugu("Naine", 1700);//seob soo kasti max lubatud kcal arvuga
        intValueCheckboxList1.add(box37);
        GridPane.setConstraints(box37, 1, 0);
        Sugu box38 = new Sugu("Mees", 1800);
        intValueCheckboxList1.add(box38);
        GridPane.setConstraints(box38, 1, 1);

        box37.setOnAction((event3) -> {
            box37.setGraphic(new ImageView(image));//lisab mehe pildi, kui valime naise
            box38.setSelected(false);//kustutab linnukese ära, kui varem oli valikus mees
            box38.setGraphic(null);
            box38.setText("Mees");//tagastab mehe sildi
        });

        box38.setOnAction((event4) -> {
            box38.setGraphic(new ImageView(image1));//sama mis eelmisel aga vastupidi
            box37.setSelected(false);
            box37.setText("Naine");
            box37.setGraphic(null);
        });

        buttonArvuta = new Button("Arvuta");
        GridPane.setConstraints(buttonArvuta, 1, 14);

        buttonClose = new Button("Sulge");
        GridPane.setConstraints(buttonClose, 1, 15);

        buttonTyhista = new Button("Tühista valik");
        GridPane.setConstraints(buttonTyhista, 1, 16);

        buttonJuhis = new Button("Kasutamisõpetus");
        GridPane.setConstraints(buttonJuhis, 4, 0);
        //korjab kokku kõik nupud ja muud valikud/sildid
        grid.getChildren().addAll(tervitus, Piimatooted, Piim, box1, box2, box3, box4, box5, box6,
                Teraviljatooted, Tera, box7, box8, box9, box10, box11, box12, box13, box14,
                Rasvad, Rasv, box15, box16, box17, box18,
                Proteiinid, Prot, box19, box20, box21, box22, box23, box24, box25, box26,
                Puuviljad, Puuv, box27, box28, box29, box30, box31, box32, box33, box34, box35, box36, box37, box38,
                resultLabelTarbinud, resultLabelSooveel, resultLabelYlesoodud, buttonArvuta, buttonClose, buttonTyhista, buttonJuhis);

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    //järgnev osa on selgitava akna töös hoidmiseks (kasutatud koodi https://www.youtube.com/watch?v=SpL3EToqaXA)
    private boolean display(String title, String message) {
        Stage window = new Stage();

        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinHeight(500);//seab minimaalse ja maksimaalse akna suuruse, kui maks ei pane, läheb tekst üle ekraani laiali
        window.setMinWidth(700);
        window.setMaxHeight(600);
        window.setMaxWidth(800);

        Label label = new Label();
        label.setText(message);
        label.setWrapText(true);
        label.setTextAlignment(TextAlignment.JUSTIFY);//teksti ääred võrdseks
        label.setFont(new Font("Calibri", 16));//font ja tähe suurus

        Button closeButton = new Button("sulge");
        closeButton.setOnAction((event) -> {
            window.close();
        });

        VBox layout = new VBox(10.0D);
        layout.getChildren().addAll(label, closeButton);
        layout.setAlignment(Pos.CENTER);//paigutab aknas sulgemise nupu keskele
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
        return answer;
    }// selgitava akna tegevus lõppes, läheb edasi põhiosa

    private void setupNupp() {
        buttonArvuta.setOnAction((event) -> {
            calculate();//kutsub välja arvutamise meetodi
        });
        buttonClose.setOnAction((event1) -> {
            primaryStage.close();
        });
        buttonTyhista.setOnAction((event2) -> {
            for (Punnid box : intValueCheckboxList) {
                box.setSelected(false);
                resultLabelSooveel.setText(null);
                resultLabelYlesoodud.setText(null);
                resultLabelTarbinud.setText(null);
            }
            for (Sugu sugu : intValueCheckboxList1) {
                sugu.setSelected(false);
                sugu.setGraphic(null);

            }
        });

        //selgitava akna tekst
        buttonJuhis.setOnAction((event) -> {
            boolean result = display("Kuidas kasutada", "\n" +//kaldkriips+n lõikab teksti ja viib järgmisele reale
                    "Toiduainete gruppide kohal on toodud päevakogused portsjonites, mis tuleb ära süüa.\n" +
                    "\n" +
                    "Kui neid ära ei söö, siis teed tervisle liiga.\n" +
                    "Kui oled kontorirott ja sööd neist portsudest rohkem, siis kaalust alla ei võta\n" +
                    "\n" +
                    "Muidu võib väheliikuv naisterahvas päevas süüa 1700 kcalorit ja meesterahvas 1800 kcal\n" +
                    "Ekraanil olev tekst - võid veel süüa- näitab, et sa ei võta juurde\n" +
                    "\n" +
                    "Kui ekraanile tekib tekst, et oled söönud rohkem, kui..., no siis paisud.\n " +
                    "\n" +
                    "NB! lisaks toodud portsudele pead iga päev sööma veel 600 g või rohkem juurvilju\n" +
                    "(ära muretse need kaloreid ei anna)\n" +
                    "\n" +
                    "Sa pead jooma 1,5 liitrit vett! \n" +
                    "\n" +
                    "NB! Otsusta kumb sa oled, naine või mees, muidu näed tulemust valesti");

            System.out.println(result);
        });
    }

    private void calculate() {

        int kogus = 0;
        for (Sugu sugu : intValueCheckboxList1){
            if (sugu.isSelected()){
                kogus = kogus + sugu.getValue();//võtab ülalt, sõltuvalt sellest, kas oled mees või naine maks lubatud koguse
            }
        }
        int jaak = 0;
        int jaakule = 0;
        int total = 0;

        for (Punnid box : intValueCheckboxList) {
            if (box.isSelected()) {
                total = total + box.getValue();//liidab valitud toiduainete kastide väärtused
                jaak = kogus - total;//lahutab valitud väärtused maksimaalsest lubatud kogusest (näitab palju saab veel paisumata süüa)
                jaakule = total - kogus; //näitab kui palju üle sööd, ilmub vaid siis kui ületad lubatud kogust

                if (total < kogus) {
                    resultLabelTarbinud.setText("Sa oled tarbinud " + total + "kcal");
                    GridPane.setConstraints(resultLabelTarbinud, 1, 18);
                    resultLabelSooveel.setText("Sa võid veel süüa " + jaak + "kcal");
                    GridPane.setConstraints(resultLabelSooveel, 1, 19);
                } else {
                    resultLabelTarbinud.setText("Sa oled tarbinud - " + total + "kcal");
                    GridPane.setConstraints(resultLabelTarbinud, 1, 18);
                    resultLabelYlesoodud.setText("Sa ületsid oma päevanormi - " + jaakule + "kcal");
                    GridPane.setConstraints(resultLabelYlesoodud, 1, 20);
                    resultLabelSooveel.setText(null);
                }
            }
        }
    }
}
