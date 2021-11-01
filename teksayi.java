import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;


public class App {
    public static void main(String[] args) throws Exception {
   
        ArrayList<Integer> orjDizi = new ArrayList<Integer>();

        


        System.out.println("Enter 10 Numbers ");

        for(int i=0;i<10;i++){
            Scanner sc= new Scanner(System.in);
            Integer thenumber = sc.nextInt();
            orjDizi.add(thenumber);
        }

        ArrayList<Integer> tekDizi = new ArrayList<Integer>();
        if(orjDizi.get(0)%2==1){
           tekDizi.add(orjDizi.get(0));

        }
        if(orjDizi.get(1)%2==1){
            tekDizi.add(orjDizi.get(1));
 
         }
         if(orjDizi.get(2)%2==1){
            tekDizi.add(orjDizi.get(2));
 
         }
         if(orjDizi.get(3)%2==1){
            tekDizi.add(orjDizi.get(3));
 
         }
         if(orjDizi.get(4)%2==1){
            tekDizi.add(orjDizi.get(4));
 
         }
         if(orjDizi.get(5)%2==1){
            tekDizi.add(orjDizi.get(5));
 
         }
         if(orjDizi.get(6)%2==1){
            tekDizi.add(orjDizi.get(6));
 
         }
         if(orjDizi.get(7)%2==1){
            tekDizi.add(orjDizi.get(7));
 
         }
         if(orjDizi.get(8)%2==1){
            tekDizi.add(orjDizi.get(8));
 
         }
         if(orjDizi.get(9)%2==1){
            tekDizi.add(orjDizi.get(9));
 
         }

         tekDizi.sort(null);

         if(tekDizi.size()>=1){
            System.out.println("Girilen sayılardan en büyük tek sayıyı bulmak için " + ((tekDizi.size())-1) + " yazın");
         int sayi;
         Scanner giris = new Scanner(System.in);
         sayi = giris.nextInt();
         System.out.print(tekDizi.get(sayi));
         
         }
         
         else{
             System.out.println("Girdiğiniz Sayılar İçerisinde Tek Sayı Bulunmuyor...");
         }


    }
}

