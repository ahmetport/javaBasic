package İntervıewquestıon1;

import java.util.Scanner;

public class q03 {
    public static void main(String[] args) {
        //kullanıcıdan pozitif bir sayı girmesini isteyin ve asal olup olmadıgını kontrol edin

        Scanner scan = new Scanner(System.in);
        System.out.println("bir sayı giriniz");
        int sayı=scan.nextInt();
        boolean asalMı=true;

        for (int i=2; i<sayı; i++){
            if(sayı%i==0){
                asalMı=false;
                break;
            }

        }
        if(asalMı)  //if tek satır olursa body acmaya gerek yok
        System.out.println("sayı asaldır");
        else System.out.println(   "  sayı asal degildir");
    }
}
