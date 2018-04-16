public static void main(String[] args) {
        
       byte byteSayi = (byte) 15;
       /*byte tipinde bir değişken oluşturur ve 
       değişkenini bu değişkenine atar*/
       short shortSayi = (short) 7;
       int intSayi = 12345;
       /* int tipinde değişken oluşturur ve bu değeri
       12345 değerini bu değişkene atar.
       */
       long longSayi = 1234567890;
       float floatSayi = 1.1234567f;
       
       String isim = "alper";
       //karakter katarlarını alabilir.
       
       boolean dogruMu;
       dogruMu = false;
       boolean yanlisMi = true;
       //her iki yazım şeklide tüm veri tiplerine uygulanabilir.
       System.out.println(byteSayi);
       System.out.println("byteSayi =" + byteSayi);
       //yukarıdaki satırların ikiside aynı anlama geliyor ama öğrenme
       //aşamasında ikincisini kullanmamız daha uygun olur.
       System.out.println(shortSayi);
       //isim belirtmeden sadece değeri ekrana yazdırır.
       System.out.println("shortSayi =" + shortSayi);
       //ekrana yazdırılan değerin ne olduğu belirtilir. shortSayi=7 gibi
       
       System.out.println(intSayi);
       System.out.println("intSayi =" + intSayi);
       System.out.println(longSayi);
       System.out.println("longSayi =" + longSayi);
       System.out.println(floatSayi);
       System.out.println("floatSayi =" + floatSayi);
       System.out.println('e');
       System.out.println("isin :" + isim);
       System.out.println("yil 2010 :" + yanlisMi);
       System.out.println("yil 2009 : " + dogruMu);
     
    }
