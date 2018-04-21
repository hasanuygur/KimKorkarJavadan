public static void main(String[] args) {
        
        int yas = 25;
        int dogumTarihi = 1985;
        if(yas==25 && dogumTarihi==1985){
            System.out.println("yazilanlar tamamiyle doğrudur.");
        }
        if(yas==25 && dogumTarihi==1990){
        //&& operatörü göre her iki önermede doğru olmalı
        //birisi yanlış olduğunda işlem yapılmayacaktır.    
        //ekran çıktısı alınmayacaktır.
            System.out.println("yazilanlar tamamiyle doğrudur.");
        }
        if(yas==25 || dogumTarihi==1990){
        //|| operatör için bir tanesinin doğru olması yeterlidir.
        // bu yüzden işlem yapar.
            System.out.println("yazilanların bir parçası doğrudur...");
        }
    }
