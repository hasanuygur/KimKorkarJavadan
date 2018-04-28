public static void main(String[] args) {
        
        Scanner giris =new Scanner(System.in);
        
        int x,y;
        int fxy = 0;
        
        System.out.println("x değerini giriniz");
        x = giris.nextInt();
        
        System.out.println("y değerini giriniz");
        y = giris.nextInt();
        
        if (x > 0 && y < 0)
        {
            fxy = 4*x + 2*y + 4;
        }
        if (x > 0 && y ==0)
        {
            fxy = 2*x - y - 3;
        }
        if(x < 0 && y > 0)
        {
            fxy = 3*x + 4*y +3;
        }
        System.out.println("fxy =" + fxy);
        }
