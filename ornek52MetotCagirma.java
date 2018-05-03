public static void main(String[] args) {
        //değişkenlerimizi tanımlayalım
        System.out.println("main metot 1");
        int birinciSayi = 8;
        int ikinciSayi = 5;
        System.out.println("main metot 2");
        //yeni metotumuzu oluşturduktan sonra main metotta yeni metot çağrılmalıdır.
        //mutlakFark isimli bir değişken tanımlayarak
        //farkiniAL metodunu parametleri ile birlikte çağıralım
        
        int mutlakFark = farkiniAl(birinciSayi,ikinciSayi);
        //sonucu ekrana yazdıralım
        System.out.println(birinciSayi + " ve " + ikinciSayi + " in mutlak farki :" + mutlakFark);
        System.out.println("main metot sonu");
    }
    
    public static int farkiniAl(int x, int y){
        System.out.println("farkiniAl metotu 1");
        int farkiniAl;
        if (x > y){
            farkiniAl =x-y;
        }
        else {
            farkiniAl = y-x;
        }
        System.out.println("farkiniAl metotu 2");
        return farkiniAl;
    }//metodun gövde sonu
