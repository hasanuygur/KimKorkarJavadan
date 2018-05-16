public static void main(String[] args) {
        
        //dizilerimizi dizi1 ve dizi2 olarak, dizi2nin boyutunu
        //dizi1 e eşit olarak tanımlayalım
        int[]dizi1 = {1,3,3,4};
        int[]dizi2 = new int[dizi1.length];
        
        //for döngüsü ile dizi 1 i ve dizi 2ye kopyalayalım
        for(int i = 0; i<dizi1.length; i++){
            dizi2[i] = dizi1[i];
            //dizi1 in elemanlarını dizi2 ye eleman olarak atatık
        }
        //dizi2 nin elemanlarını ekrana yazdıralım
        for(int i=0; i<dizi2.length; i++){
            System.out.println(dizi2[i]);
        }
        
    }
