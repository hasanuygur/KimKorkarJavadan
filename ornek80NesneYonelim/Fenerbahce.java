package nesneyonelim;


public class Fenerbahce {
    
    public static void main (String[] args){
        Futbolcu kaleci = new Futbolcu();
        //futbolcu sınıfından new operatörü ile kaleci nesnesi oluşturuyoruz.
        
        kaleci.ismi = "volkan";
        kaleci.yasi = 29;
        
        
        //Futbolcu nesnesinin ismi ve yasi isimli değişkenlerine 
        //string ve int değerler atıyoruz.
        
        System.out.println("futbolcunun ismi :" + kaleci.ismi);
        System.out.println("futbolcunun yaşı :" + kaleci.yasi);
        
    }
}
