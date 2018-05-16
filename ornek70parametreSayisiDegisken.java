public static void main(String[] args) {
        toplamSayi(3);
        toplamSayi(3,5,7);
        toplamSayi(3,5,7,9,11);
        
    }//public static void main sonu
    public static void toplamSayi(int... sayilar){
        //metotla birlikte verilen değişken sayılar integer olup parametre listesi sayılarıdır.
        
            int toplam=0;
            //toplama işlemini toplam isimli depişkene atayıp, belleği boşalttık.
            
                for(int sayi : sayilar){
                    toplam += sayi;
                    //geliştirilmiş for döngüsü ile tüm değişkenlerin üzerinden
                    //geçerek toplama işlemini yapıyoruz.
                }
                System.out.println("sayilerin toplamı :" + toplam);
    }
