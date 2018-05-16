public static void main(String[] args) {
        
       int[]girSayi = new int[10];
       int giris;
       Scanner tara = new Scanner(System.in);
       //dizi elemanlarına değer atanıyor, for döngüsü ile kaç defa 
       //tam sayı girileceği belirleniyor
       for(int x=0; x<girSayi.length; x++){
           System.out.println("Tam sayi giriniz :");
           giris = tara.nextInt();
           girSayi[x] = giris;
       }
       for(int x=0; x<girSayi.length; x++){
           System.out.println("girSayi["+x+"]= " + girSayi[x]);
       }
        
    }//public static void sonu
