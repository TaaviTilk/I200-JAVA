package OOP;

import java.util.ArrayList;

/**
 * Siin failis kasutatakse objekti Foor, aga Foor klassi ei eksisteeri. Sinu ülesanne
 * on see luua. Pane tähele, et mitte ükski objekti muutuja ei tohi olla
 * kättesaadav objektist väljaspoolt.
 *
 * Käesolevat klassi ei tohi muuta! Arvad, et ei jää vahele? :)
 */
public class Foor_OOP_koik_koos {
    public static void main(String[] args) {

        String fooriNimetus = "Sõle-Paldiski SR3A";
        Foor foor = new Foor(fooriNimetus);

        foor.syytaTuli("punane");
        foor.syytaTuli("kollane");
        foor.syytaTuli("roheline");
        foor.kustutaTuli("punane");
        foor.kustutaTuli("kollane");

        System.out.println("Fooril peaks põlema ainult punane, tegelt põleb: " + foor.misTuledPolevad());
        System.out.println("Foori nimetus on " + foor.votaNimetus());

        foor.hakkeridSaidKontrolli(); // Paanika!

        System.out.println("Fooris põlevad tuled: " + foor.misTuledPolevad());
        System.out.println("Foori nimetus on: " + foor.votaNimetus());
    }
    public static class Foor {

        private String fooriNimi;
        private ArrayList<String> tuli1 = new ArrayList<>();
        private ArrayList<String> tuli2 = new ArrayList<>();


        public Foor (String fooriNimetus) {
            fooriNimi = fooriNimetus;
        }


        public void syytaTuli(String varv) {
            tuli1.add(varv);
        }


        public void kustutaTuli(String varv) {
            tuli2.add(varv);
        }

        public String misTuledPolevad() {
            return tuli1.toString();
        }

        public String votaNimetus() {
            return fooriNimi;
        }

        public void hakkeridSaidKontrolli() {
            System.out.println("häkkerid said kontrolli");
            tuli1.removeAll(tuli2);
        }
    }
}
