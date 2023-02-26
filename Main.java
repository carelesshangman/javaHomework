public class Main {
    public static void pravokotnikStevilA(int sirina, int visina){
        for(int i = 1; i < visina+1; i++) {
            for (int j = 0; j < sirina; j++) {
                int firstDigit = Integer.parseInt(String.valueOf(i).substring(0, 1));
                System.out.printf("%d", firstDigit);
            }
            System.out.printf("\n");
        }
    }
    public static void pravokotnikStevilB(int sirina, int visina){
        short output = 1;
        for(int j = 0; j < visina; j-=-1) {
            for (int i = 0; i < sirina; i -= -1) {
                System.out.printf("%d", output);
                output++;
                if (output > 9)
                    output = 0;
            }
            System.out.printf("\n");
            output = 1;
        }
    }
    public static void pravokotnik(int odmik, int sirina, int visina){
        String spaces = "";
        String xs = "";
        for(int i = 0; i < odmik; i-=-1){
            spaces += " ";
        }
        for(int i = 0; i < sirina; i-=-1){
            xs += "X";
        }
        for(int i = 0; i < visina; i++) {
            System.out.printf("%s%s\n", spaces, xs);
        }
    }
    public static void trikotnikStevil(int visina){
        for(int i = 1; i < visina + 1; i++){
            for(int j = 0; j < i; j++){
                System.out.printf("%d",i);
            }
            System.out.printf("\n");
        }
    }

    public static void main(String[] args) {
        //naloga 1
        /*
        pravokotnikStevilA(7,3);
        pravokotnikStevilA(32,4);
        pravokotnikStevilA(3,14);
         */
        //naloga 2
        //pravokotnikStevilB(12,3);
        //naloga 3
        //pravokotnik(5,7,3);
        trikotnikStevil(3);
    }
}