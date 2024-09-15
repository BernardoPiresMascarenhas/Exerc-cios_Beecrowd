import java.util.Scanner;

class Jaspion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < t; i++) {
            int m = sc.nextInt();
            int n = sc.nextInt();
            sc.nextLine();

            String[] palavra = new String[m];
            String[] traducao = new String[m];

            for (int j = 0; j < m; j++) {
                palavra[j] = sc.nextLine();
                traducao[j] = sc.nextLine();
            }

            for (int k = 0; k < n; k++) {
                String musica = sc.nextLine();
                String[] palavra2 = musica.split("\\s+");
                int tam = palavra2.length;

                for (int b = 0; b < tam; b++) {
                    for (int c = 0; c < m; c++) {
                        if (palavra2[b].equals(palavra[c])) {
                            palavra2[b] = traducao[c];
                        }
                    }
                    System.out.printf("%s ", palavra2[b]);
                }
                System.out.println();
            }
        }
        sc.close();
    }
}
