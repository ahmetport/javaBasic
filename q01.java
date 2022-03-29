package İntervıewquestıon1;

import java.util.Arrays;
import java.util.Scanner;

public class q01 {
    public static void main(String[] args) {
        // kullanıcıdan bir strıng alınız
        //strıngde var olan her karakterin sayısını ekrana yazdırınız
        // örnek:a=3, l=1 c=1 n=1
        //abaa  a=3 b=1

        Scanner scan = new Scanner(System.in);
        System.out.println("strıng bir ıfade giriniz");
        String str = scan.nextLine();
        String arr[] = str.split("");
        //System.out.println(Arrays.toString(arr));

        //sort yapıp sıralayalım kodun daha efektıf olması için

        Arrays.sort(arr);
       // System.out.println(Arrays.toString(arr));

        //sayaç oluştur
        int counter = 0;

        for (int i = 1; i < arr.length; i++) {
            if (arr[i-1].equals(arr[i])) {
                counter++;
            }else{
                System.out.println(arr[i-1] +" sayısı "   +(counter+1));
                counter = 0;
            }
            if(i==arr.length-1){  //en sona geldıgınde
                System.out.println(arr[i] + "sayısı" +(counter+1));

            }

        }


        }


    }

