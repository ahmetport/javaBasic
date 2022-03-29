package İntervıewquestıon1;

import java.util.Scanner;

public class q02 {
    public static void main(String[] args) {

        //kullanıcıdan alınan bir strıngın ilk ve son harfını yıne kullanıcıdan alınan sayı kadar return eden method yazınız
        //örnek input elma 2  output eaea
        Scanner scan=new Scanner(System.in);
        System.out.println("bir strıng giriniz");
        String str= scan.nextLine();

        System.out.println("bir sayı giriniz");
        int sayı=scan.nextInt();
        ilksonharf(str,sayı);
        System.out.println("girilen strıngın ilk ve son harfının birleşik hali: " +ilksonharf(str,sayı));

    }//main sonu

    private static String ilksonharf(String str, int sayı) {
        String s=str.substring(0,1) + str.substring(str.length() - 1);//ea
        String b=""; //kova gibi düşün üstteki harfleri birleştirip aldık

        for (int i=0;i<sayı; i++){ //ea dan kaç tane yzadıracagımı bana for söylüyor
            b+=s;  //b=b+s

        }
        return b;
    }

}
