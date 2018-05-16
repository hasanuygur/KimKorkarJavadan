public static void main(String[] args) {
        ArrayList <String> dizi = new ArrayList <String>();
        dizi.add("alp");
        dizi.add("alper");
        dizi.add("akalın");
        dizi.add(2,"alperen");
        //2.indise yani araya alperen değerini atıyoruz.
        System.out.println("dizimizin boyutu =" + dizi.size());
            for(int x=0; x<dizi.size(); x++){
            System.out.println("indis " + x + " : " + dizi.get(x));
            }
            dizi.remove(3);
            System.out.println("3 indisli eleman siilindikten sonraki dizi boyutu =" + dizi.size());
                for(int x=0; x<dizi.size(); x++){
                    System.out.println("indis " + x + " : " + dizi.get(x));
                }
        
        
    }
