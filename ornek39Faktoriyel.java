    
        Scanner tara = new Scanner (System.in);
        int x;
        System.out.println("bir sayi giriniz");
        x = tara.nextInt();
        
        int sayac = 1;
        int faktoriyel = 1;
        //faktöriyelin matematiksel tanımı göre başlanğıç değerlerine 1 atadık
        
        do
        {
            faktoriyel = faktoriyel*sayac;
            sayac = sayac + 1;
        }
        while (sayac <=x);
        System.out.println(faktoriyel);
        
        
        
        }
