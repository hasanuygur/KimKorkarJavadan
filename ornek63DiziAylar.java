public static void main(String[] args) {
        
       String[] Aylar ={" ","ocak","şubat","mart","nisan","mayıs","haziran","temmuz","ağustos","eylül","ekim","kasım","aralık"};
       Scanner tara = new Scanner(System.in);
       int yil;
       System.out.println("bir tam sayi giriniz :");
       yil = tara.nextInt();
       
       if (yil>0 && yil<=12){
           System.out.println(yil + ".ay..." + Aylar[yil]);
       }
       else {
           System.out.println("1 ile 12 arasinda bir değer giriniz");
       }
        
    }
