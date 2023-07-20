public class Search_2D_Matrix {
    public static void main(String[] args) {
        int a[][] = {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 60}};
        int n = a.length; // no. of rows
        int m = a[0].length; // no. of columns
        int k = 3;
        for (int i = 0; i < n; i++)
            for (int j = 0; j < m; j++)
                if (a[i][j] == k) {
                    System.out.println("true");
                }
    }
}
