public static void main(String[] args) {
        
        //System.out.println("main metot 1");
        int birinciSayi = 8;
        int ikinciSayi = 5;
        //System.out.println("main metot 2");
        
        int mutlakFark = farkiniAl(birinciSayi,ikinciSayi);
        System.out.println("birinciSayi =" + birinciSayi);
        //birinciSayi nin değişkeninin dğerinin değişip değişmediğini
        //kontrol etmek adina ekrana yazdiriyoruz.
        System.out.println(birinciSayi + " ve " + ikinciSayi + " in mutlak farki :" + mutlakFark);
        //System.out.println("main metot sonu");
    }
    
    public static int farkiniAl(int x, int y){
        //System.out.println("farkiniAl metotu 1");
        int farkiniAl;
        if (x > y){
            farkiniAl =x-y;
        }
        else {
            farkiniAl = y-x;
        }
        x = 13;
        //System.out.println("farkiniAl metotu 2");
        return farkiniAl;
    }
