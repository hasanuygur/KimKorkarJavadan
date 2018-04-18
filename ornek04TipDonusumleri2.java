public static void main(String[] args) {
        
       String s1 = "12";
       String s2 = "13";
       //şeklinde verilen değerleri dönüştürelim
       //string veri tipinin int veri tipine dönüştürülmesi
       int intDonusum1 = Integer.valueOf(s1);
       int intDonusum2 = Integer.parseInt(s2);
       
       System.out.println("intDonusum1 =" + intDonusum1);
       System.out.println("intDonusum2 =" + intDonusum2);
       
       //ek1: aşağıda s1 s2 karakter olduğundan çıktı 1213 oluyor. 
       System.out.println("ek1:"+ s1+s2);
       //ek2 : aşağıda int e donüştüğünden toplama yapılabiliryor.
       System.out.println("ek2:" + (intDonusum1+intDonusum2));
       
       //String veri tipinin Doluble-Float veri tiplerine gönüştürülmesi
       float floatDonusum1 = Float.valueOf(s1);
       float floatDonusum2 = Float.parseFloat(s2);
       double doubleDonusum1 = Double.valueOf(s1);
       double doubleDonusum2 = Double.parseDouble(s2);
       
       System.out.println("floatDonusum1 =" + floatDonusum1);
       System.out.println("floatDonusum2 =" + floatDonusum2);
       System.out.println("doubleDonusum1 =" + doubleDonusum1);
       System.out.println("doubleDonusum2 =" + doubleDonusum2);
       
       
    }
