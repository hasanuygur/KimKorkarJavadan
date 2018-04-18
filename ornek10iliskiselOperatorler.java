public static void main(String[] args) {
        
       if (5==5){
           System.out.println("bu iki sayi birbirine eşittir");
       }
       
       int birinciSayi = 8;
       int ikinciSayi = 5;
       //bundan sonraki karşılarştırmaları bu iki sayiya göre yapalım
       
       if(birinciSayi==ikinciSayi){
           System.out.println("birinci sayi ikinciye eşittir.");
           //iki sayi birbirine eşit olmadığından bu çıktı görünmez.
       }
       
       if(birinciSayi!=ikinciSayi){
           System.out.println("birinci sayi ikinciye eşit değildir.");
       }
       
       if(birinciSayi>ikinciSayi){
           System.out.println("birinci sayi ikiciden büyüktür");
       }
       
       if(birinciSayi>=ikinciSayi){
           System.out.println("birinci sayi ikinciye büyük eşittir");
       }
        
    }
