public static void main(String[] args) {
        //değişkenlerimizi tanımlayalım
        int birinciSayi = 8;
        int ikinciSayi = 5;
        //yeni metotumuzu oluşturduktan sonra main metotta yeni metot çağrılmalıdır.
        //mutlakFark isimli bir değişken tanımlayarak
        //farkiniAL metodunu parametleri ile birlikte çağıralım
        
        int mutlakFark = farkiniAl(birinciSayi,ikinciSayi);
        //sonucu ekrana yazdıralım
        System.out.println(birinciSayi + " ve " + ikinciSayi + " in mutlak farki :" + mutlakFark);
    }
    
    public static int farkiniAl(int x, int y){
        int farkiniAl;
        if (x > y){
            farkiniAl =x-y;
        }
        else {
            farkiniAl = y-x;
        }
        return farkiniAl;
    }//metodun gövde sonu
