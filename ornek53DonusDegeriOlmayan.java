public static void main(String[] args) {
        
        int birinciSayi = 8;
        int ikinciSayi = 5;
        
        buyukSayiyiEkranaYazdir(birinciSayi,ikinciSayi);
        //metot cagrilme işlemi değer dondurmediğinden basit bir ifade şeklinde gerçekleşir
        
    }
    
    public static void buyukSayiyiEkranaYazdir(int x, int y){
        //donus değeri olmadiğindan void kullandık.
        
        if (x > y){
            System.out.println("buyuk sayi :" + x +"'dir");
        }
        else {
            System.out.println("buyuk sayi :" + y +"'dir");
        }
        //donus değeri olmadiğindan retun değerini kullanmadik
        //+ void ile birlikte kullanılamaz
        //bu metotu main metodu içerisinden çağıralim
    }
