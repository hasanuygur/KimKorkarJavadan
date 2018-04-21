public static void main(String[] args) {
        
        int a = 5, b = 4, c = 4;
        if(a==b && b==c){
            System.out.println("ücgenimiz eşkenar üçgendir.");
        }
        if(a==b || b==c){
            System.out.println("ücgenimiz ikizkenar ücgendir.");
        }
        if(a!=b && b==c){
            System.out.println("ücgenimiz ikizkenadır");
        }
    }
