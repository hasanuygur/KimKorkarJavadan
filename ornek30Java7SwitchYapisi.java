public static void main(String[] args) {
        
        //cuma gününü sorgulayacağız doğru bulunca uygulamadan çıkılacaktır.
        String hafta = "Cuma";
        
        switch(hafta){
            case "Pazartesi":
                System.out.println("bugün günlerden pazartesi");break;
            case "Sali":
                System.out.println("bugün günlerden sali");break;
            case "Carsamba":
                System.out.println("bugün günlerden carsamba");break;
            case "Persembe":
                System.out.println("bugün günlerden persembe");break;
            case "Cuma":
                System.out.println("bugün günlerden cuma");break;
            case "Cumartesi":
                System.out.println("bugün günlerden cumartesi");break;
            case "Pazar":
                System.out.println("bugün günlerden pazar");break;
        }
    }
