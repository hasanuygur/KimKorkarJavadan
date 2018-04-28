public static void main(String[] args) {
        
        Scanner giris =new Scanner(System.in);
        
        int not;
        System.out.println("notunuzu giriniz");
        not = giris.nextInt();
        
        if (not >= 90)
            System.out.println("AA");
        else if(not >= 80)
            System.out.println("BA");
        else if(not >= 70)
            System.out.println("BB");
        else if(not >= 60)
            System.out.println("CB");
        else if(not >= 50)
            System.out.println("CC");
        else
            System.out.println("FF");
        
        //ek1: kitaba göre biraz kısattım
        //notumuzun harf değerini daha kesin belirleyebiliyoruz.
        
        
        }
