public static void main(String[] args) {
        
        int x = 7, y = -6;
        double z = 35.6 , t = 0.4;
        
        System.out.println("ynin mutlak değeri :" + Math.abs(y));
        System.out.println("z sayisini yuvarlayalım :" + Math.round(z));
        System.out.println("t sayisini yuvarlayalım :" + Math.round(t));
        System.out.println("t sayisini üst tam sayiya tamamlayalim :" + Math.ceil(t));
        System.out.println("z sayisini alt tam sayiya tamamlayalim :" + Math.floor(z));
        System.out.println("x-y sayilaridan büyük olanini gösterelim :" + Math.max(x, y));
        System.out.println("z-t sayilaridan büyük olanini gösterelim :" + Math.min(x, t));
        System.out.println("t nin arcsinus ünü gösterelim :" + Math.asin(t));
        
        double aci = Math.toRadians(45);
        System.out.println("45 in cos değeri :" + Math.cos(45));
        System.out.println("45 in sin değeri :" + Math.sin(45));
        
        }
