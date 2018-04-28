public static void main(String[] args) {
        
        int x = 5;
        
        while (x < 3)
        {
            x = x+1;
        }
        System.out.println("x =" + x);
        //bu göngüde ilk önce koşula bakar uyarsa işlemi yapar uymazsa atlar
        //uymadığı için atlar ve sonucu x=5 verir
        
        System.out.println("do while dongusunu incelersek");
        int y = 5;
        
        do
        {
            y = y+1;
        }
        
        while (y <3 );
        System.out.println("y =" + y);
        //burda ise önce işlem gerçekleşir sonra koşula bakar.
        
        }
