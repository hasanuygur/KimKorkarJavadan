public static void main(String[] args) {
        
       Scanner girDizi = new Scanner(System.in);
       int N;
       int Toplam=0;
       //dizi benzeri ard arda gelen sayıları toplarken belleği boşallatmak 
       //gerekir.
       
       System.out.println("dizi boyutunu giriniz");
       N = girDizi.nextInt();
       
       //buraya kadar dizi boyutunu tanımladık.şimdi toplama işlemini ve
       //toplanacak elemanları tanımlayalım
       
       int[] T = new int[N];
       
       for(int x=0; x<N; x++){
           System.out.println("Dizinin " +x+ ".elemanı");
           T[x] = girDizi.nextInt();
           Toplam = Toplam+T[x];
       }
       System.out.println("Toplam =" + Toplam); 
    }
