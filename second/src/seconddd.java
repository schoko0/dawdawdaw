/**
 * Created by sniendorf on 22.07.2016.
 */
public class seconddd {


        public static void main(String[] args) {
            int a = 1;
            int b = 2;
            int c = 3;
            System.out.println("Die Summe betraegt: " + Summe(a,b,c));


        }

        private static int Summe(int a, int b, int c){
            int summe = a + b + c;
            int summe2 = a + (int)Math.sqrt(b) - c;
            int result;

            if(summe > summe2){
                result = summe;
            } else if (summe < summe2){
                result = summe2;
            } else {
                return summe;
            }

            return result;
        }


}
