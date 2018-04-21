public static void main(String[] args) {
        
       int sayi = 0;
       do {
           System.out.println("sayi =" + sayi);
       }
       while(sayi<0);
    int sayac = 1;   
    do{
        System.out.println("ben bir do while dongusuyum");
        sayac ++;
    }
    while (sayac<=0);
    
    /*
    yukarıdaki değişkene 1 atanan ifadece sayaç <=koşulunu sağamadığından
    döngü bir defa dönüyor. daha sonra koşulu sağlamadığı için döngüden çıkar
    aşağıdaki sayaç2<=5 doğru koşul olduğu için döngü 5 defa gerçekleşir
    */
    int sayac2 = 1;
    do{
        System.out.println("ben bir donguyum");
        sayac2 ++;
    }
    while(sayac2<=5);
    }
