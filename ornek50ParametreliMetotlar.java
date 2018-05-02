public static void main(String[] args) {
        
        
    }
    
    //metot ismi= farkiniAl, dönüş tipi=int, parametleri int tipindeki;x ve y
    public static int farkiniAl(int x, int y){
    //metotun gövde başlangıcı metottan beklenen işlevler
        int farkiniAl;
        if (x>y){
            farkiniAl = x-y;
        }
        else {
            farkiniAl = y-x;
        }
        return farkiniAl;
    }
