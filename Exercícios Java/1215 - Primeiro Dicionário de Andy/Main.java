import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        List<String> texto = new ArrayList<>();
        Set<String> ordemAlfabetica = new TreeSet<>();

        while(sc.hasNextLine()){
            texto.add(sc.nextLine());
        }

        for(String linha : texto){
            linha = linha.replaceAll("[.,;:!\"'()$#*]" , " ");
            String[] novasPalavras = linha.toLowerCase().split(" ");

            for(String palavra : novasPalavras){
                if(!palavra.trim().isEmpty()){
                    ordemAlfabetica.add(palavra);
                }
            }
        }

        for(String palavra : ordemAlfabetica){
            System.out.println(palavra);
        }

        sc.close();
    }
}
