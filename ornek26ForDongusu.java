public static void main(String[] args) {
        
      for(int a = 5, b = 6; a*b < 50; a++, b+=3){
          System.out.println("a değişkeninin ilk değeri :" + a);
          System.out.println("b değişkeninin ilk değeri :" + b);
          System.out.println("a*b değişkeninin ilk değeri :" + a*b);
      }
      System.out.println();
      
      for (int c = 5, d = 6; c*d < 50; c++, d -= 3){
          System.out.println("c değişkeninin ilk değeri :" + c);
          System.out.println("d değişkeninin ilk değeri :" + d);
          System.out.println("c*d değişkeninin ilk değeri :" + c*d);
      }
      
    }
