public static void main(String[] args) {
        
       int[] dizi = {3,5,7,9,11};
       metodDizi(dizi);
       
       //diziyi yeni elemanları ile birlikte ekrana yazalım.
            for(int x=0; x<dizi.length; x++){
                System.out.println(dizi[x]);
            }
       
    }//public static void sonu
    
    public static void metodDizi(int[] dizi){
        dizi[0]=120;
        dizi[1]=166;
        //bu işlem ile dizini 0ve1 indisli elemanlarına 120 ve 166 değerlerini atamış olacağız
        //bu tip değişikliklerde dizinin uzunluğunu aşmayan indisler kullanılmalıdır.
        
    }
