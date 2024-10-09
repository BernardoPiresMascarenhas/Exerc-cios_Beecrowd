import java.util.Scanner;

class Main {
   public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        int ultrapassagens = 0;
        int[] arrayUltrapassagem = new int[3];
        int k = 0;
        
         while(sc.hasNextLine()){
            
            n = sc.nextInt();
            sc.nextLine();

            String entrada = sc.nextLine();
            String[] ordem_entrada = entrada.trim().split(" ");

            String saida = sc.nextLine();
            String[] ordem_saida = saida.trim().split(" ");

            ultrapassagens = 0;

            for(int i = 0; i < n; i++){
               String tmp = ordem_entrada[i];
               for(int j = 0; j < n; j++){
                  if(ordem_saida[j].equals(tmp) && i - j > 0){
                     ultrapassagens += i - j;
                  }
                  else if(ordem_saida[j].equals(tmp) && i - j == 0 && j != (ordem_entrada.length - 1) && i != 0 && ordem_saida[j + 1].equals(ordem_entrada[i - 1])){
                     ultrapassagens += 1;
                  }
               }
            }
            arrayUltrapassagem[k] = ultrapassagens;
            k++;
         }

         for(int numero : arrayUltrapassagem){
            System.out.println(numero);
         }
            
         sc.close();
   }
}