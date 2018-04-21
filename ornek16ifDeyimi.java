public static void main(String[] args) {
        
        int birinciSayi = 8;
        int ikinciSayi = 5;
        if (birinciSayi < ikinciSayi) {
        //koşul doğru olmadığından işlem yapmaz.    
            System.out.println("birinciSayi ikinciSayidan küçüktür");
        }
        if(birinciSayi > ikinciSayi){
        //koşul doğru olduğu için aşağıdaki ifada çalışır.    
            System.out.println("birinciSayi ikinciSayidan büyüktür.");
        }
        
        if(birinciSayi != ikinciSayi){
        //koşul doğru oldugundan işlem yapılır.    
            System.out.println("birinciSayi ilinciSayiya eşit değildir.");
        }
        
    }
