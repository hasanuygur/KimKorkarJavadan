public static void main(String[] args) {
        
       int a = 45 , b = 2 , c = 45 , d = 2 ;
       a++;
       ++b;
       c--;
       --d;
       System.out.println("a=" + a + " b=" + b +" c=" + c + " d=" + d);
       //verilen değerleri bir arttırıp azaltık.
       
       //operatörler önde veya arkada olması durumu biraz işleri karıştırabilir
       int sayi1 = 7;
       int sayi2 = 7;
       int sayi3 = sayi1++;
       int sayi4 = ++sayi2;
       
       System.out.println("sayi3 =" + sayi3);
       System.out.println("sayi4 =" + sayi4);
       
       
    }
