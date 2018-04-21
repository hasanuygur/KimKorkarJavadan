public static void main(String[] args) {
        
        int a=24, b=3, c=99, d=1;
        int e = (b>=3)? 111:(a/b);
        int f = (d<=1)? 0:(c/b);
        int g = (d==0)? 0:(c/b);
        
        System.out.println("e =" + e);
                System.out.println("f =" + f);
                        System.out.println("g =" + g);
        //e = (b>=3)? 111:(a/b); koşul doğru ice e ye 111 atar yanlışsa
        //a/b işlemini yapar e ye atar. g de bu koşul sağlanmıştır.


    }
