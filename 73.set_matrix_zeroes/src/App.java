public class App {
    public static void main(String[] args) throws Exception {
        int tester[][] = {{1,2,0,4},{5,6,7,8}};
        print2D(tester);
        setZeroes(tester);
        print2D(tester);
        
    }
    public static void setZeroes(int[][] matrix){
        int [][] clone = new int[matrix.length][];
        for(int i = 0; i < matrix.length; i++){
            clone[i] = matrix[i].clone();
        }
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                if(matrix[i][j] == 0){
                    rowZeros(clone, i);
                    columnZeros(clone, j);
                }
            }
        }
        //actually change the values in the passed in array to match the clone now that the zeros have been found and clone has been manipulated. 
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0; j < matrix[0].length; j++){
                matrix[i][j] = clone[i][j];
            }
        }
    }

    public static void print2D(int mat[][]){
        // Loop through all rows
        for (int i = 0; i < mat.length; i++){

            // Loop through all elements of current row
            for (int j = 0; j < mat[i].length; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void rowZeros(int mat[][],int row){
        for(int i = 0; i < mat[0].length; i++){//iterate through the length of the rows
            mat[row][i] = 0;
            }
    }

    public static void columnZeros(int mat[][], int column){
        for(int j = 0; j < mat.length; j++){
            mat[j][column] = 0;
        }
    }
}
