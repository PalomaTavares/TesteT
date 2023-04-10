public class Fibonacci{


    public static int isFib(int n){
       int first = 0;
       int second = 1;
       int current = 0;
       while(current < n){
            current = first + second;
            first = second;
            second = current;
       }
       return (current == n)? 1: 0;
    }
    public static void main(String[] args){
        //n = 13
        if(Fibonacci.isFib(21) == 1){
            System.out.println("Pertence a Fibonacci");
        }else{
            System.out.println("Não pertence a Fibonacci");
        }
       
    }
}