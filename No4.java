package modultugas2;
public class No4 {
    public static void main(String[] args) {
        int[][] M = {
            {2,1,-5},
            {3,4,2}          
        };
        int[][] transpose = new int [5][5];
        for (int i=0; i<M.length; i++){
            for (int j=0; j<M[0].length; j++){
                transpose[j][i] = M[i][j];               
            }
            System.out.println();           
        }
        for (int i=0; i<M[0].length; i++){
            for (int j=0; j<M.length; j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
    }
       
}
