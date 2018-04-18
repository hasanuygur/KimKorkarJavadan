int donusum = 15;
       float donusumf = 15.5f;
       //ek1:yukarıdaki float ifadeki aşağıdaki gibi de yazılabilir
       //float donusumf = (float)15.5;
       double donusumd = 15.15;
       
       String stringDonusumInt = "" + donusum;
       String stringDonusumInt1 = String.valueOf(donusum);
       String stringDonusumInt2 = Integer.toString(donusum);
       
       String stringDonusumFloat = donusumf + "";
       String stringDonusumFloat1 = String.valueOf(donusumf);
       String stringDonusumFloat2 = Float.toString(donusumf);
       
       String stringDonusumDouble = donusumd + "";
       String stringDonusumDouble1 = String.valueOf(donusumd);
       String stringDonusumDouble2 = Double.toString(donusumd);
       
       System.out.println("stringDonusumInt =" + stringDonusumInt);
       System.out.println("stringDonusumInt1 =" + stringDonusumInt1);
       System.out.println("stringDonusumInt2 =" + stringDonusumInt2);
       
       System.out.println("stringDonusumFloat =" + stringDonusumFloat);
       System.out.println("stringDonusumFloat1 =" + stringDonusumFloat1);
       System.out.println("stringDonusumFloat2 =" + stringDonusumFloat2);
       
       System.out.println("stringDonusumDouble =" + stringDonusumDouble);
       System.out.println("stringDonusumDouble1 =" + stringDonusumDouble1);
       System.out.println("stringDonusumDouble2 =" + stringDonusumDouble2);
       
       //ek1: string dönüşüp dünüşmediği kontrol için;
       System.out.println("Toplam=stringDonusumInt+stringDonusumInt1 :" + (stringDonusumInt+stringDonusumInt1));
       System.out.println("Toplam=donusumf + donusumf :" + (donusumf+donusumf));
    }
