import java.util.Scanner;

public class PerguntaDois {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Digite um numero inteiro qualquer:");
        int numero=sc.nextInt();
        if(verificarFibonacci(numero)){
            System.out.println("o numero: "+numero+" pertnce a sequencia de fibonacci");
        }
        else{
            System.out.println("o numero: "+numero+" não pertence a sequancia de fibonacci");
        }
        sc.close();
    }
    
    public static boolean verificarFibonacci(int numero){
        int a=0,b=1;
        while(a<=numero){
            if(a==numero){
                return true;
            }
            int soma=a+b;
            a=b;
            b=soma;
        }
        return false;
    }
}
