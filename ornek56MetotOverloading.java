public static void main(String[] args) {
        
        int birinciSayi = 8;
        int ikinciSayi = 5;
        double sayi1 = 8.5;
        double sayi2 = 5.8;
        //ilk durumda metot verdiğimiz argümanlar integer olduğundan 
        //parametreleri int metot önce çalışır
        int mutlakFark = farkiniAl(birinciSayi,ikinciSayi);
        
        System.out.println(birinciSayi + " ve " + ikinciSayi + " in mutlak farki :" + mutlakFark);
        
        //ikinci durumda metota verdiğimiz argümanlar double olduğundan
        //parametleri int metot önce çalışır.
        double mutlakFarkDouble = farkiniAl(sayi1,sayi2);
        
        System.out.println(sayi1 + " ve " + sayi2 + " in mutlak farki :" + mutlakFarkDouble);
    }
    //metotumuzun ismi farkiniAl
    //parametre değişken tipi ise integer
    public static int farkiniAl(int x, int y){
        int farkiniAl;
        if (x > y){
            farkiniAl = x - y;
        }
        else {
            farkiniAl = y - x;
        }
        return farkiniAl;
    }
    
    //metodumuzun ismi farkiniAl
    //parametre değişken tipi ise double
    public static double farkiniAl(double x, double y){
        double farkiniAl;
        if( x > y){
            farkiniAl = x - y;
        }
        else {
            farkiniAl = y - x;
        }
        return farkiniAl;
    }
