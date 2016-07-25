/**
 * Created by sniendorf on 22.07.2016.
 */
public class seconddd {


        public static void main(String[] args) {
            int a = 3;
            int b = 2;
            int c = 3;
            System.out.println("Die Summe betraegt: " + Summe(a,b,c));
            System.out.println("Die Raumlaenge betraegt: " + Summe(a,b,c));


        }

        private static int Summe(int a, int b, int c){
<<<<<<< HEAD
            int summe = a + b + c;
            int summe2 = a + (int)Math.pow(b,2) - c;
            int result;

            if(summe < summe2){
                result = summe;
            } else {
                result = summe2;
=======
            int summea = a + b + c;
            int summeb = a + (int)Math.sqrt(b) - c;
            int result;

            if(summea > summeb){
                result = summea;
            } else {
                result = summeb;
>>>>>>> lane
            }
            return result;
        }


}
