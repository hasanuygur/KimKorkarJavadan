public static void main(String[] args) {
        int[]dizi1 = {1,3,3,4};
        int[]dizi2 = new int [dizi1.length];
        //kopyalama işlemini arraycopy metodu ile yaparsak
        System.arraycopy(dizi1,0,dizi2,0,4);
        //dizi1 in ilk elemanı dizi2nin ilk elelanından başlamak
        //dizi1 in 4 elemanı dizi2ye kopyalanacak demektir.
        
        //dizi2 yi ekrana yazdıralım
        for(int x=0 ; x<dizi1.length; x++){
            System.out.println(dizi2[x]);
        }
      
            
    }
