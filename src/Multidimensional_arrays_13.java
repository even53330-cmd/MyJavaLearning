public class Multidimensional_arrays_13 {
    public static void main(String [] args){
        int[] number = {1,2,3};

        int[][] matrice = {{1,2,3},{4,5},{7,8,9}};
        System.out.println(matrice[1][0]);
        System.out.println(matrice[1][1]);

        String [][] strings = new String[2][3];
        strings[0][1] = "Hello";
        System.out.println(strings[0][1]);
        System.out.println();

        int[][] x = {{1,2,3,},
                     {4,5,6},
                     {7,8,9,}};
        for(int i = 0;i< x.length;i++){
            for(int j = 0;j<x[i].length;j++){
                System.out.print(x[i][j]+" ");
            }
            System.out.println();
        }
    }
}

