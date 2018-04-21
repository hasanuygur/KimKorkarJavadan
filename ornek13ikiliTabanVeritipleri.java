public static void main(String[] args) {
        
        byte b = (byte) 0b10101001;
        short s = (short) 0b1010100101001100;
        int i1 = 0b10100001010001011010000101000101;        
        int i2 = 0B10100001010001011010000101000101;
        //b nin büyük yada küçük olmasının önemi yoktur.
        
        long I = 0b1010000101000101101000010100010110100001010001011010000101000101L;
        // sonundaki L konulur long tipinde olduğu için
        
        System.out.println("b =" + b);
        System.out.println("s =" + s);
        System.out.println("i1 =" + i1);
        System.out.println("i2 =" + i2);
        System.out.println("I =" + I);
        
    }
