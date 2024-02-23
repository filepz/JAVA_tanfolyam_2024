import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //heteskereso();
        //ketszam();
        //teszt();
        //elsoezer();
        tokeletes();
    }

    public static void heteskereso() {
        boolean vanhetes = false;
        System.out.println("Keressük meg a megadott pozitiv egész  számban a '7'-es számjegyet.");
        System.out.print("Adja meg a számot?");

        Scanner sc = new Scanner(System.in);
        int szam = sc.nextInt();
        while (szam >= 7) {
            int osztasutan = szam / 10;
            int maradek = szam % 10;
            if (maradek == 7) {
                vanhetes = true;
                break;
            }
            szam = osztasutan;

        }
        System.out.print(vanhetes);
    }
    public static boolean primszam(int szam) {
        boolean primszam2 = true;
        for (int i = 2; i <= szam/2; i++) {
            if (szam % i == 0) {
                primszam2=false;
                //return  primszam2;
            }
        }
        return primszam2;
    }
    public static void ketszam(){
        int also;
        int felso;
        int szam1;
        int szam2;
        System.out.print("add meg az elso szamot");
        Scanner sc = new Scanner(System.in);
        szam1=sc.nextInt();
        System.out.print("add meg a masodik szamot");
        Scanner sc2 = new Scanner(System.in);
        szam2=sc2.nextInt();
        if (szam1<=szam2) {
            also=szam1;
            felso=szam2;
        }else {
            also=szam2;
            felso=szam1;
        }
        System.out.println("also"+also+"felso"+felso);
        for (int i=also;i<=felso;i++){
            if (primszam(i)){
                System.out.println(i);
            }
        }


    }
    public static void teszt(){
        System.out.print("add meg a szamot");
        Scanner sc = new Scanner(System.in);
        System.out.print(primszam(sc.nextInt()));
    }
    public static void elsoezer(){
        int i=0;
        int k=2;
        while (i<=1000){
            if (primszam(k)){
                i=i+1;
            }
            k++;
        }
        System.out.println(k-1);
    }
    public static void tokeletes(){
        int osszeg=0;
        System.out.print("Adja meg a számot");
        Scanner sc = new Scanner(System.in);
        int szam=sc.nextInt();
        for(int j=1;j<szam;j++){
            if (szam%j==0){
                System.out.println("oszto:"+j);
                osszeg=osszeg+j;
            }
        }
        System.out.println(osszeg);
    }
}
