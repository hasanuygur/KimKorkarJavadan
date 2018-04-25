public static void main(String[] args) {
        
        String ifade;
        //string metin ifade isimli değişkeni tanımlıyoruz.
        
        //ek1:lütfen isminizi giriniz ifadesini yazalım
        System.out.println("Lütfen isminizi giriniz");
        Scanner tara = new Scanner(System.in);
        /* ek1: yukarıdaki ifadeyi yazınca hata verir.
        sağ tıklayıp fix imports yaparsak yukarıdaki import java.until.scanner
        otomatik ekler.
        */
        ifade = tara.nextLine();
        //nextLine() yöntemi klavyeden girilen tüm karakteri ifade isimli değişkene aktarılır.
        
        System.out.println("isim ve soyiminiz :" + ifade);
    }
