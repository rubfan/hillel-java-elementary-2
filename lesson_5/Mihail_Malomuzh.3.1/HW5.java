public class HW5 {
    
    public static void PrintArr(int[][] in){
        int h = in.length;
        int w = in[0].length;
        for (int i = 0; i < h; i++){
            for (int j = 0; j < w; j++)
                System.out.print(in[i][j] + "\t");
            System.out.println();
        }
    }
         
    public static void SpiralFill(int[][] in) {
        int h = in.length;
        int w = in[0].length;
        int count = 1;
        
        int n = Math.min(h, w) / 2;
        int m = 0;
        
        while (m < n){
            for (int i = m; i < w - m; i++) in[m][i] = count++; 
            for (int i = m + 1; i < h - m; i++) in[i][w - m - 1] = count++;
            for (int i = w - m - 2; i >= m; i--) in[h - m - 1][i] = count++;
            for (int i = h - m - 2; i >= m + 1; i--) in [i][m] = count++;
            m++;
        }
        
        if (((h % 2 == 1) && (w % 2 == 0)) |
            ((h % 2 == 1) && (w % 2 == 1) && (w >= h)))
            for (int i = n; i < w - n; i++) in[n][i] = count++;
        if (((w % 2 == 1) && (h % 2 == 0)) |
            ((h % 2 == 1) && (w % 2 == 1) && (w < h)))
            for (int i = n ; i < h - n; i++) in[i][w - n - 1] = count++;
        
    }
    
    public static void Pascal (int[][] in){
        int h = in.length;
                
        for (int i = 0; i< h; i++){
            in[i][0] = 1;
            in[i][i] = 1;
            for (int j = 1; j < i ; j++)
                in[i][j] = in[i-1][j]+in[i-1][j-1];
        }
        
    }
   
    public static void main(String[] args) {
        int[][] a = new int[4][9]; 
        SpiralFill(a);
        PrintArr(a);
        System.out.println();
        int[][] b = new int[9][9]; 
        Pascal(b); 
        PrintArr(b);
 
        }
        
}
    

