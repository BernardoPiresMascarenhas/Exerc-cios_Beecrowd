import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        sc.nextLine();
        String[] lingua = new String[N];
        String[] frase_natal_lingua = new String[N];

        for(int i = 0; i < N; i++){
            lingua[i] = sc.nextLine();                                    // ex: N = 2 
            frase_natal_lingua[i] = sc.nextLine();                        // i = 0 -> lingua[i] = frances  /  frase_natal_lingua[i] = Joyeux Noel
                                                                          // i = 1 -> lingua[i] = ingles  /   frase_natal_lingua[i] = Merry Christmas
        }
        int M = sc.nextInt();
        sc.nextLine();
        String[] nome = new String[M];
        String[] lingua_digitada = new String[M];

        for(int j = 0; j < M; j++){                                       // ex: M = 1
            nome[j] = sc.nextLine();                                      // j = 0 -> nome[j] = John Brolargo / opcao_lingua[j] = ingles
            lingua_digitada[j] = sc.nextLine(); 
        }
        
        etiqueta_natal(lingua, frase_natal_lingua, nome, lingua_digitada, N, M);
        sc.close();
    }

    public static void etiqueta_natal(String[] lingua, String[] frase_natal_lingua, String[] nome, String[] lingua_digitada, int N, int M){
        String frase_natal_etiquetada;
        for(int i = 0; i < M; i++){
            for(int j = 0; j < N; j++){
                if(lingua_digitada[i].equals(lingua[j].trim())){
                    frase_natal_etiquetada = frase_natal_lingua[j];
                    System.out.println(nome[i]);
                    System.out.println(frase_natal_etiquetada);
                    System.out.println();
                }
            }
        }
    }
}