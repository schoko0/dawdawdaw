
public class seconddd {


        public static void main(String[] args) {
            int a = 1;
            int b = 2;
            int c = 3;
            System.out.println("Die Summe betraegt: " + Summe(a,b,c));
            System.out.println("Die Raumlaenge betraegt: " + Summe(a,b,c));


        }

        private static int Summe(int a, int b, int c){
            int summea = a + b + c;
            int summeb = a + (int)Math.sqrt(b) - c;
            int result;

            if(summea > summeb){
                result = summea;
            } else {
                result = summeb;
            }
            return result;
            //test test123
            //test test

        }


}
