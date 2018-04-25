public static void main(String[] args) {
        for (int x = 0; x < 50;x++){
            if (x == 9){
                break;
                //break komutu if koşulundaki x==9 olduğunda sonlanı.
            }
            System.out.println("x =" + x);
        }
        System.out.println("doğru sonlandirildi");
        

        //etiketli break deyimini inceleyelim. etiket kirilmeEtiketi olsun
        kirilmaEtiketi:
        for (int y = 0;y < 5;y++){
        //break deyimi ile bastan etiketlediğimizden üsteki kod çalışmadı
        //kod bloğunun henüz kapatılmadığına dikkat edelim
            for (int z = 0; z < 50; z++){
                if (z==7){
                    break kirilmaEtiketi;
                }
                    System.out.println("z =" + z);
            }
                //bu alan kırılan for göngüsünün bloğuna dahildir.
                System.out.println("dongu kirildiğindan ekrana birşey yazdirmaz");
                System.out.println("y =" + y);
        }
