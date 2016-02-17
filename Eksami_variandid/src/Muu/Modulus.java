package Muu;

// Demonstreerib operaatorit %
class Modulus {
    public static void main(String args[]) {

        for (int i = 0; i <45; i++) {
            if(i/9%2==0){
                System.out.println(i+"-"+i/9+" =0");
            }else
            {
                System.out.println(i+"-"+i/9+" =1");
            }

        }
    }
}
