package OOP;

import java.util.ArrayList;

/**
 * Siin failis kasutatakse objekti Seljakott, aga Seljakott klassi ei eksisteeri. Sinu ülesanne
 * on see luua. Pane tähele, et mitte ükski objekti muutuja ei tohi olla
 * kättesaadav objektist väljaspoolt.
 *
 * Käesolevat klassi ei tohi muuta! Arvad, et ei jää vahele? :)
 */
public class Reis {

    public static void main(String[] args) {

        String omanikuNimi = "Kihnu Virve";
        Seljakott kott = new Seljakott(omanikuNimi);

        kott.lisaAsi("Hambapasta");
        kott.lisaAsi("Hambahari");
        kott.lisaAsi("Pleier");
        kott.lisaAsi("Langevari");
        kott.eemaldaAsi("Langevari"); // Ah mis sellest ikka vedada, saab ilma ka

        System.out.println("Kotis on järgmised asjad: " + kott.misOnKotis());
        System.out.println("Asju on kotis nii mitu: " + kott.mituAsjaOnKotis());
        System.out.println("Omaniku nimi on: " + kott.omanikuNimi());

        kott.rebene(); // oh shit, mis nüüd saab?

        System.out.println("Kotis on järgmised asjad: " + kott.misOnKotis());
        System.out.println("Asju on kotis nii mitu: " + kott.mituAsjaOnKotis());
    }

    private static class Seljakott {

        String omanikunimi;
        ArrayList<String> asjad = new ArrayList<>();
        ArrayList<String> asjad2 = new ArrayList<>();

        public Seljakott(String omanikuNimi) {
            omanikunimi = omanikuNimi;
        }


        public void lisaAsi(String asi) {asjad.add(asi);}

        public void eemaldaAsi(String asi) {asjad2.add(asi);
           // System.out.println("eemaldatud-"+asjad2.add(asi));
            }

        public String misOnKotis() {
            return asjad.toString();
        }

        public int mituAsjaOnKotis() {return asjad.size();}

        public String omanikuNimi() {
            return omanikunimi;
        }

        public void rebene() {
            asjad.removeAll(asjad2);
        }
    }
}
