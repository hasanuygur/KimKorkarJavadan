public static void main(String[] args) {
        
        //and operatörü:ilk terimler 1 se sonuç 1, farklı ise 0 çıkar
        byte a1 = 4;
        byte a2 = 7;
        byte a3 = (byte)(a1&a2);
        System.out.println("a2 =" + a3);
        //a3=4 -> sonuç 100 ve 111 ikilik sisteme göre bakılır.
        //sonuç 100 çıkar ama sistem ikilik tabanda vermez.
        
        //or operatörü:her hangi biri 1 ise 1 üretir
        byte o1 = 3;
        byte o2 = 5;
        byte o3 = (byte)(o1 | o2);
        System.out.println("o3 =" + o3);
        //o3=7 
        
        //xor operatörü: birbirinden farklıysa 1 uygular
        byte x1 = 6, x2 = 7;
        byte x3 = (byte)(x1 ^ x2);
        System.out.println("x3 =" + x3);
        //x3=1
        
        //complement operatörü(~): 1 i 0 a, 0 ı 1 e çevirir.
        byte c1 = 6;
        byte c2 = (byte)(~6);
        System.out.println("c2 =" + c2);
        //c2=-7
        
        //kaydırma operatörü (>><<)
        int a = 8, b = 1;
        System.out.println("(a<<b) :" + (a<<b));
        //sola kaydırılır iki ile çarpılır.
        System.out.println("(a>>b) :" +(a>>b));
        //sağa kaydırılır iki ile bölünür.
        
        int x = 12, y = 6, z = 0, t = 0;
        z = x > y ? x : y;
        //eğer x değişkeni y değişkeninden büyükse,z değişkeni x olsun
        t = x < y ? x : y;
        //eğer x değişkeni y değişkeninden küçükse değilse, t değişkeni y olsun
        System.out.println("z =" + z);
        System.out.println("t =" + t);
        
    }
