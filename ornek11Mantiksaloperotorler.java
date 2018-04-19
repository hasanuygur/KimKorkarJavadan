public static void main(String[] args) {
        boolean x = true;
        boolean y = false;
        boolean z = true;
        boolean t = false;

        //AND operatörü (&&):her iki tarafdakide true ise true döner.
        //diğer tüm durumlarda false sonuç olur.

        System.out.println("x && y :" + (x && y));
        //sonuç false olmalı
        System.out.println("x && z :" + (x && z));
        //sonuç true olmalı
        System.out.println("y && t :" + (y && t));
        //sonuç false olmalı

        //OR operatörü (||): her iki tarafdakide false olursa sonuç false döner.
        //diğer tüm durumlarda true döner.

        System.out.println("x || y :" + (x || y));
        //sonuç true olmalı
        System.out.println("y || t :" + (y || t));
        //sonuç false olmalı
        
        //XOR özel or operatörü(^):her iki tafaftakide aynı ise false olur.
        //ifadeler farklı ise sonuç true olur.
        System.out.println("x ^ y :" + (x ^ y));
        //sonuç true olmalı
        System.out.println("x ^ z :" + (x ^ z));
        //sonuç false olmalı
        
        //NOT-operatörü(!): kendinden sonrasını ters halini alır
        System.out.println("!x :" + (!x));
        //sonuç false olmalı
        System.out.println("!y :" + (!y));
        //sonuç true olmalı
        
    }


