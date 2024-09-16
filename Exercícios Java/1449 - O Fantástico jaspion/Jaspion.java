import java.util.Scanner;

class Jaspion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int n = 0; n < t; n++) {
            int M = sc.nextInt();
            int N = sc.nextInt();
            sc.nextLine();

            String[] palavra = new String[M];
            String[] traducao_palavra = new String[M];

            for (int i = 0; i < M; i++) {
                palavra[i] = sc.nextLine();                    //  ex: i = 0; palavra[i] -> galaxy / traducao_palavra[i] -> cara tossiu
                traducao_palavra[i] = sc.nextLine();           //      i = 1; palavra[i] -> kagayaku / traducao_palavra[i] -> canalha do
            }

            for (int i = 0; i < N; i++) {
                String musica = sc.nextLine();
                String[] letra_musica = musica.split("\\s+");

                for (int j = 0; j < letra_musica.length; j++) {
                    for (int k = 0; k < M; k++) {
                        if (letra_musica[j].equals(palavra[k])) {
                            letra_musica[j] = traducao_palavra[k];
                        }
                    }
                }
                System.out.println(String.join(" ", letra_musica));
            }
            
            if (n < t - 1) {
                System.out.println();
            }
        }
        sc.close();
    }
}
