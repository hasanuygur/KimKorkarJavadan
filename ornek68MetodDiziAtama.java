public static void main(String[] args) {
        
       int[] dizi = {3,5,7,9,11};
       metodDizi(dizi);
       //oluşturulan metod dizi elemanları ile çağrıldı
       
    }//public static void sonu
    
    public static void metodDizi(int[] dizi){
        for(int x=0; x<dizi.length; x++){
            //for döngüsü ile dizi elemanlarına ulaşıyoruz.
            System.out.println(dizi[x]);
        }
