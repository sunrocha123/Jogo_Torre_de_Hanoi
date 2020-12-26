import java.util.Scanner;

public class TorreDeHanoi {
    public static void main(String[] args) {
        cabecalho();
        while (true) {
            Scanner input = new Scanner(System.in);
            System.out.print("Digite um número de discos: ");
            int disco = input.nextInt();
            if (disco <= 0) {
                System.out.println("Oops! Digite um número inteiro maior que 0");
            } else {
                System.out.println();
                for(int i = 1; i <= disco; i++){
                    System.out.println(i + "   |     |  ");
                }
                System.out.println("--------------\n A  |  B  |  C  ");
                System.out.println();
                int aux = disco - 1;
                int [] movimento = {1};
                double totmovimento = Math.pow(2, disco) - 1;
                int [] posicao = new int[disco];
                int [] numDisco = new int[disco];
                for(int i = 0; i < posicao.length; i++){
                    posicao[i] = 1;
                }
                for(int k = 0; k < disco; k++){
                    numDisco[k] = k + 1;
                }
                Hanoi(disco, 1, 2, 3, posicao, numDisco, aux, movimento, totmovimento);
                break;
            }
        }
    }
    public static void cabecalho() {
        System.out.println("==================================");
        System.out.println("          TORRE DE HANOI          ");
        System.out.println("==================================");
        System.out.println();    
    }
    private static void Hanoi(int disco, int origem, int auxiliar, int destino, int [] posicao, int [] numDisco, int aux, int [] movimento, double totmovimento) {
        if (disco > 0) {
            Hanoi(disco - 1, origem, destino, auxiliar, posicao, numDisco, aux, movimento, totmovimento);
            for(int k = aux; k >= 0; k--){
                if (disco == numDisco[k]) {
                    posicao[k] = destino;
                }
            }
            if (movimento[0] <= totmovimento) {
                System.out.println("Movimento: " + movimento[0]);
                System.out.println();
                movimento[0] = movimento[0] + 1;
            }
            for(int j = 0; j < numDisco.length;j++){
                if (posicao[j] == 1){
                    System.out.println(numDisco[j]+"   |     |    ");
                } else if (posicao[j] == 2){
                    System.out.println("    |  " +  numDisco[j] +"  |   ");
                } else{
                    System.out.println("    |     | "+numDisco[j]);
                }
            }
            System.out.println("--------------\n A  |  B  |  C  ");
            System.out.println();
            Hanoi(disco - 1, auxiliar, origem, destino, posicao, numDisco, aux, movimento, totmovimento);
        }
    }
}