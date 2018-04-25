public static void main(String[] args) {
        
        Scanner tara = new Scanner(System.in);
        int x,y,z,ucgen;
        
        System.out.println("x kenarını giriniz");
        x = tara.nextInt();
        
        System.out.println("y kenarını giriniz");
        y = tara.nextInt();
        
        System.out.println("z kenarını giriniz");
        z = tara.nextInt();
        
        if (x==y && y==z){
            System.out.println("ücgenimiz eşkenardir");
        }
        else if( x!=y && y!=z && x!=z){
            System.out.println("ücgenimiz çeşitkenardir");
        }
        else 
            System.out.println("ücgenimiz ikizkenardir");
        
        }
