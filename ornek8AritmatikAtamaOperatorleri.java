public static void main(String[] args) {
        
       int a = 25, b = 15 , c = 35 , d = 20;
       int e = 5 , f = 3 , g = 36 , h = 9 , k = 20 , m = 7;
       a += b; //a = a + b işlemini yapar
       c -= d; //c = c - d işlemini yapar
       e *= f; //e = e * f işlemini yapar 
       g /= h; //g = g / h işlemini yapar
       k %= m; //k = k % m işlemini yapar(k yı m böl kalanı kya aktar)
       System.out.println("a =" + a);
       System.out.println("c =" + c);
       System.out.println("e =" + e);
       System.out.println("g =" + g);
       System.out.println("k =" + k);
       // sonuçlar en soldaki int değişkenlerine atanır
       //a=40 , c=15 , e=15 , g=4 , k = 6
