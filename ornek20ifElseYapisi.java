public static void main(String[] args) {
        
        int puan = 85;
        char sonuc;
        if(puan >= 88){
            sonuc = 'a';
        }
        else if (puan<=90){
            sonuc = 'b';
        //aşağıdaki c seçeneği daha kesin olsada bu yapi şartların doğru
        //olduğu ilk kod bloğunu çalıştırır.
        }
        else if (puan == 85){
            sonuc = 'c';
        }
        else {
            sonuc = 'd';
        }
        System.out.println("sonuc :" + sonuc);
    }
