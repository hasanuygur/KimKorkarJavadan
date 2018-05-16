public static void main(String[] args) {
        int[][] tablo = new int [5][4];
        //iç içe for döngüsü ile dizinin satır ve sütunlarını oluşturalım
        for (int satir = 0; satir < tablo.length; satir++){
            for (int sutun = 0; sutun < tablo[satir].length; sutun++){
                //dzimize rasgele sayılar atamak için math sınıfının
                //random metodunu kullanıyoruz.
                
                tablo[satir][sutun] = (int)(Math.random()*100);
                //random metodu 0.0 ile 1.0 arasında dobule değerler aldığından
                //100 ile çarpıp yuvarlıyoruz ve integer tipine çiviriyoruz
                //bu şekilde yaptığımız düzenleme sayesinde
                //her hangi bir veri kaybı da yaşamamaktadır.
            }
        }
        for (int satir = 0; satir < tablo.length; satir++){
            for ( int sutun = 0; sutun < tablo[satir].length; sutun++){
                
                System.out.print(tablo[satir][sutun]+" ");
                //satir bitimine kadar alt satıra geçmemesi için
                //print kulandık.
            }
                System.out.println();
                //döngü bitince her satırdan çıkıldığında 
                //bir alt satıra geçilmesini sağlar
        }
        
    }
