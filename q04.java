package İntervıewquestıon1;

import java.util.Scanner;

public class q04 {
    public static void main(String[] args) {
        //strıng pın kodunuzu kontrol eden bir kod yazınız
        Scanner scan = new Scanner(System.in);
        String pinkodu="said.12345";
        int girişhakkı=4;

        while(true){ //döngü dogru oldugu sürece çalışsın
            System.out.println("pin kodu giriniz");
            String girilenpin= scan.nextLine();
            if(pinkodu.equals(girilenpin)){
                System.out.println("başarılı giriş yaptınız");
                break;

            }else{
                System.out.println("yanlış giriş yaptınız...");
                girişhakkı--;
                System.out.println("kalan giriş hakkınız :" + girişhakkı);

            }if(girişhakkı==0){
                System.out.println("giriş hakkınız kalmadı telefon bloke");
                break;

            }

        }

    }
}
