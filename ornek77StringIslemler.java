public static void main(String[] args) {
        String takim ="Fenerbahçe";
        //takim isimli string değişkene fenerbahçe ismini aktarıyoruz.
        
        //length() metodu:
        System.out.println("Fenerbahçe'nin karakter uzunluğu :" + takim.length());
        
        //charAt(indis)metodu:
        System.out.println("indisi 5 olan karakter :" + takim.charAt(5));
        
        //substring(başlangıç-bitiş indisleri) metodu
        System.out.println(takim.substring(5,9));
        
        //indexOf(string değişken)Metodu:
        System.out.println("e karakterinin ilk pozisyonu ya da indisi: " + takim.indexOf('e'));
        
        System.out.println("e karakterinin 2. indisten sonraki ilk pozisyonu yada indisi: " + takim.indexOf('e',2));
        
        //lastindexOf(karakter) metodu:
        //String takim )= "Fenerbahçe";
        int son = takim.lastIndexOf("e");
        System.out.println("son :" + son);//tam sayi değişkeni döndürdüğünden  son değişkene atadık.
        
        //replace(x,y) metodu:
        System.out.println("F ile Ş nin yerlerini değiştir :" + takim.replace("F","Ş"));
        
        //toUpperCasee() metodu:
        System.out.println("bütün harfler büyük :" + takim.toUpperCase());
        
        //toLowerCase() metodu:
        System.out.println("bütün harfler küçük :" + takim.toLowerCase());
        
        //parse() metodu:
        String takim2 ="1097";
        System.out.println("double a çevirelim :" + Double.parseDouble(takim2));
        
        System.out.println("integer e çevirelim :" + Integer.parseInt(takim2));

    }
