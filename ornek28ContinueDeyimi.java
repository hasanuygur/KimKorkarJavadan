public static void main(String[] args) {
        for (int x = 0; x < 8; x++){
            if(x==6){
                //x=6 for döngüsündeki pas geçilme noktası
                continue;
                //kod bloğu çalıştığında 6 rakamını atladığı görülür.
            }
            System.out.println("x =" + x);
        }
        
        System.out.println("dongu sonlandirildi");
        //etiketli continue deyimine örnek
        pasGec:
        for(int y = 0; y < 8; y++){
            
            for(int z = 0; z<6;z++){
                if (z ==4){
                    continue pasGec;
                    /*kod bloğu çalıştığında dongünun z=3 sayisine kadar
                    ekrana getirilecektir.
                    bu işlem üstteki dongu sınırı olan 8 defa takrarlanacaktir.
                    */
                    
                }
                    System.out.println("z =" + z);
                }
                
                System.out.println("dongü pas geçildiğinden ekrana bişey yazdirmaz");
                System.out.println("y =" + y);
            }
}
