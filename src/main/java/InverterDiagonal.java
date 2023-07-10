public class InverterDiagonal {
    public static void main(String[] args) {
        int matrizImpar[][] = {
                {1,2,3,4,5},
                {6,7,8,9,10},
                {11,12,13,14,15},
                {16,17,18,19,20},
                {21,22,23,24,25}};

        int matrizPar[][] = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};

        imprimirMatriz(matrizImpar);
        inverterDiagonaisMatrizQuadrada(matrizImpar);
        imprimirMatriz(matrizImpar);

        imprimirMatriz(matrizPar);
        inverterDiagonaisMatrizQuadrada(matrizPar);
        imprimirMatriz(matrizPar);
    }

    public static int[][] inverterDiagonaisMatrizQuadrada(int[][] matriz){
        int nLinhasMatriz = matriz.length-1;

        for (int i = 0; i <= Math.floor(nLinhasMatriz/2); i++) {
            //Fazendo a inversão da diagonal principal
            int diagonalPrincipalSuperior = matriz[i][i];
            int diagonalPrincipalInferior = matriz[nLinhasMatriz - i][nLinhasMatriz - i];
            matriz[i][i] = diagonalPrincipalInferior;
            matriz[nLinhasMatriz - i][nLinhasMatriz - i] = diagonalPrincipalSuperior;

            //Fazendo a inversão da diagonal secundária
            int diagonalSecundariaSuperior = matriz[i][nLinhasMatriz - i];
            int diagonalSecundariaInferior = matriz[nLinhasMatriz - i][i];
            matriz[i][nLinhasMatriz - i] = diagonalSecundariaInferior;
            matriz[nLinhasMatriz - i][i] = diagonalSecundariaSuperior;
        }
        return matriz;
    }

    public static void imprimirMatriz(int[][] matriz){
        for (int i = 0; i < matriz.length; i++) {
            System.out.print("|\t");
            for (int j = 0; j < matriz.length; j++) {
                System.out.print(matriz[i][j]+"\t");
            }
            System.out.println("|");
        }
        System.out.println();
    }
}
