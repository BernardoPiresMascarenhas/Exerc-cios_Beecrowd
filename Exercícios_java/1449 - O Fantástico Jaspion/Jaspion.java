import java.util.Scanner;

class Jaspion{
    public static void main(String[] args){
        Scanner sc = new Scanner(Syste,.in);
        int t = sc.nextInt(); // numero de instâncias
        int m; // número de palavras no dicionário 
        int n; // número de linhas na letra da música
        String[] palavra = new String[1000];
        String[] traducao = new String[1000];

        for(int i = 0; i < t; i++){
            m = sc.nextInt();
            n = sc.nextInt();
            
            
            if (M <= 1000000 && M >= 1 && N >= 1 && N <= 1000){

                for(int j = 0; j < m; j++){
                    palavra[j] = sc.nextLine();
                    traducao[j] = sc.nextLine();
                }

                String musica;

                for(int k = 0; k < n; k++){
                    musica = sc.nextLine();
                    String[] palavra2 = musica.split("\\s+");
                    int tam = palavra2.length;
                }

                for(int b = 0; b < tam; b++){
                    for(int c = 0; c < m; c++){
                        if(palavra2[b].equals(palavra[c])){
                            palavra2[b] = traducao[c];
                        }
                    }
                    System.out.printf("%s ", palavra2[c]);
                }
                System.out.println();
            }
        }
        sc.close();
    }
}