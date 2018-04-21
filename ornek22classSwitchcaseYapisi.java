public static void main(String[] args) {
        
        int hafta = 5;
        //haftanın 5.gününü sorgulamaktayız
        //doğru bulununca uygulamadan çıkılır.
        switch(hafta){
            case 1: System.out.println("Pazartesi");break;
            case 2: System.out.println("Sali");break;
            case 3: System.out.println("Carsamba");break;
            case 4: System.out.println("Persembe");break;
            case 5: System.out.println("Cuma");break;
            case 6: System.out.println("Cumartesi");break;
            case 7: System.out.println("Pazar");break;
        }
        System.out.println();//bir satır boşluk bıraksın diye yazıldı.
        //break deyimini kardırıp sonuca bakalım
        int hafta2 =4;
        switch(hafta2){
            case 1: System.out.println("Pazartesi");
            case 2: System.out.println("Sali");
            case 3: System.out.println("Carsamba");
            case 4: System.out.println("Persembe");
            case 5: System.out.println("Cuma");
            case 6: System.out.println("Cumartesi");
            case 7: System.out.println("Pazar");
            //break komutunu çıkarırsak perşembeden sonraki 
            //büyük bünler veya sonraki komutlar çalıştı.
            
        }
        System.out.println();
        
        //hiç bir koşulun sağlanmamasi durumu(default)
        int hafta3 = 8;
        switch(hafta3){
            case 1: System.out.println("Pazartesi");break;
            case 2: System.out.println("Sali");break;
            case 3: System.out.println("Carsamba");break;
            case 4: System.out.println("Persembe");break;
            case 5: System.out.println("Cuma");break;
            case 6: System.out.println("Cumartesi");break;
            case 7: System.out.println("Pazar");break;
            default: System.out.println("hiçbir koşul sağlanmiyor");
            
        }
}
