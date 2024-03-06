import java.util.Scanner;

public class perguntaCinco {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("escreva uma palavra:");
        String normal=sc.nextLine();
        String invertida=inverterString(normal);

        System.out.println(invertida);
        sc.close();
    }
    public static String inverterString(String inv){
        
        char[] charLista=inv.toCharArray();
        
        int tamanho=inv.length();
        for(int i=0;i<tamanho/2;i++){
            char temporaria=charLista[i];
            charLista[i]=charLista[tamanho-1-i];
            charLista[tamanho-1-i]=temporaria;
        }

        return new String(charLista);
    }
}
