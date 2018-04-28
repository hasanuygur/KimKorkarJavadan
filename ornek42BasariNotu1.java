public static void main(String[] args) {
        
        Scanner giris =new Scanner(System.in);
        
        int not;
        System.out.println("notunuzu giriniz");
        not = giris.nextInt();
        
        switch(not){
            case 90:
                System.out.println("AA");
                break;
            case 80:
                System.out.println("BA");
                break;
            case 70:
                System.out.println("BB");
                break;
            case 60:
                System.out.println("CB");
                break;
            case 50:
                System.out.println("CC");
                break;
            default:
                System.out.println("FF");
                break;
                
        //switch case yapısı ile tek bir değere göre işlem yapılabilindiğinden
        //80-89 gibi aralıklar yerine 85 gibi tek değerler kullanbiliriz.
        }
        
        
        }
