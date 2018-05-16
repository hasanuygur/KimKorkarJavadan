public static void main(String[] args) {
        //java string ifadeden sonra felen ifadeyi otomatik olarak ne olduğuna bakmasızın stringe çevirir
        //çift tırnak ifadesi ise string bir ifadeye işaret etmektedir.
        String takim = "" + 1907;
        System.out.println("takim :" + takim);
        
        //valueOf metodu:
        float x = 1907;
        String takim1 = String.valueOf(x);
            System.out.println("takim1 :" + takim1);
            
        int y = 1907;
        String takim2 = Integer.toString(y);
        System.out.println("takim2 :" + takim2);
        

    }
