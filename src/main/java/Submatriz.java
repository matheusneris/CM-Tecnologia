public class Submatriz {
    public static void main(String[] args) {
        int[][] matrizA = {
                {1, 2, 3, 4, 2, 3},
                {5, 6, 7, 8, 10, 11},
                {9, 4, 9, 2, 3, 4},
                {5, 8, 8, 6, 7, 8}};

        int[][] submatrizB = {
                {2, 3},
                {6, 7}};
        int ocorrencias = encontrarSubmatrizes(matrizA, submatrizB);
        System.out.println("Número de ocorrências de B em A: " + ocorrencias);
    }

    public static int encontrarSubmatrizes(int[][] matrizA, int[][] submatrizB) {
        int ocorrencias = 0;
        int qtdLinhasA = matrizA.length;
        int qtdColunasA = matrizA[0].length;
        int qtdLinhasB = submatrizB.length;
        int qtdColunasB = submatrizB[0].length;

        for (int i = 0; i <= qtdLinhasA - qtdLinhasB; i++) {
            for (int j = 0; j <= qtdColunasA - qtdColunasB; j++) {
                if (matrizA[i][j] == submatrizB[0][0] && verificarSubmatriz(matrizA, submatrizB, i, j, qtdLinhasB, qtdColunasB)) {
                    ocorrencias++;
                }
            }
        }
        return ocorrencias;
    }

    private static boolean verificarSubmatriz(int[][] matrizA, int[][] submatrizB, int linhaInicialA, int colunaInicialB, int qtdLinhasB, int qtdColunasB) {
        for (int i = 0; i < qtdLinhasB; i++) {
            for (int j = 0; j < qtdColunasB; j++) {
                if (matrizA[linhaInicialA + i][colunaInicialB + j] != submatrizB[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}

