public static void main(String[] args) {
        
       int intSayi;
       float floatSayi = 3.23f;
       double doubleSayi = 12.12;
       //intSayi=floatSayi;
       //yukarıdaki yanlış komut olur program çalışmaz o yüzden aşağıdakini
       //yazarız.
       intSayi = (int) floatSayi;
       //burada float tipi int tipine çevirildiğinden çalışır
       System.out.println("floatSayi =" + floatSayi);
       //float tiğinde float sayi yazılacaktır.
       System.out.println("intSayi =" + intSayi);
       //int veri tipinde cast ettiğimiz floatSayi yi int tipinde yazdıracaktır
       /*yukarıdaki int veri tipinin çıktısı 3 olacaktır.
       .23 olan kısım kaybolur.bu yüzden dönüşümlere matamatiksel projelerde
        önem vermeliyiz*/
       
       //int-double arasi casting yapalım
       int intSayi2 = 15;
       double doubleDonusum;
       doubleDonusum = (double) intSayi2;
       System.out.println("dolubleDonusum =" + doubleDonusum);
       //donüşüm yapınca çıktı 15.0 olacak
     
    }
