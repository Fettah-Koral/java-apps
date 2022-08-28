package Uygulamalar4;

class RecursiveFibonacci{

    static int fibonacci (int x){
        if(x<1) return x=0;
        else if (x==1) return 1;
        else 
        return fibonacci(x-1)+fibonacci(x-2);
    }
    public static void main(String[] args) {

       for (int i = 0; i < 10; i++) {
        System.out.print(" "+fibonacci(i));
       }
  
    }
}