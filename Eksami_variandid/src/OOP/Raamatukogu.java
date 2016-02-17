package OOP;

import com.sun.deploy.util.ArrayUtil;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Raamatukogus on Sõnaraamat. Õigemini siis on, kui sa selle klassi kirjutad.
 *
 * Raamatukogu klassi ei tohi muuta.
 */
public class Raamatukogu {
    public static void main(String[] args) {

        String raamatuKeel = "Eesti";
        Sonaraamat raamat = new Sonaraamat(raamatuKeel);
        raamat.sisestaSona("puaas");
        raamat.sisestaSona("uubuma");
        raamat.sisestaSona("uudikristamine");
        raamat.sisestaSona("suaree");
        raamat.sisestaSona("sarkasm");
        raamat.sisestaSona("iroonia");

        System.out.println("Mis raamatud kaes on: " + raamat.misRaamatOn());
        String[] vaste = raamat.otsiEsimeseTaheJargi("u");
        System.out.println(Arrays.toString(vaste));

        String[] vaste2 = raamat.otsiEsimeseTaheJargi("s");
        System.out.println(Arrays.toString(vaste2));

        raamat.eemaldaSona(vaste2[0]);

        raamat.misKeelesRaamatOn();

    }

    private static class Sonaraamat {

        private ArrayList <String> raamat1 = new ArrayList<>();
        private ArrayList <String> raamat2 = new ArrayList<>();
        private String keel;

        public Sonaraamat(String raamatuKeel) {
            String keel = raamatuKeel;
            System.out.println(keel);
        }

        public void sisestaSona(String sona) {
            raamat1.add(sona);
           // System.out.println(raamat1.add(sona));
        }


        public void eemaldaSona(String s) {
            raamat2.remove(s);


        }

        public String misKeelesRaamatOn() {
            System.out.println(Sonaraamat.this);
            System.out.println("ssss");
            System.out.println(keel);
            return keel;
        }

        public String[] otsiEsimeseTaheJargi(String u) {

            char taht = u.charAt(0);
            //System.out.println(taht);
            //int count = 0;
            for (int i = 0; i <raamat1.size() ; i++) {
                if (raamat1.get(i).charAt(0)== taht){
                    raamat2.add(raamat1.get(i));
                    //System.out.println("-"+raamat2.add(raamat1.get(i)));
                    //count++;
                }
            }

            //System.out.println("to string"+raamat2.toString());

            String [] tulemus = new String[raamat2.size()];
            for (int i = 0; i <raamat2.size() ; i++) {
                tulemus [i]= raamat2.get(i);

            }
            raamat2.clear();
            return tulemus;

        }
        public String misRaamatOn() {

            return raamat1.toString();

        }
    }
}
