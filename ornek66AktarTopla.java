public static void main(String[] args) {
        
       int [] D = {1,2,3,4,5,6,7,8,9,10};
       int toplam=0;
       for(int x:D){
           System.out.println("dizi elemanları :" + x);
           toplam +=x;
       }
       System.out.println("toplam =" + toplam);
    }
