package lesson5;

public class pascalTriangle {
    public static final int strings = 6;

    public static void main(String[] args) {
        int[][] s = new int[strings][];
        for (int i = 0; i < strings; i++) {
            s[i] = new int[i + 1];
            s[i][0] = 1;
            for (int j = 1; j < i; j++)
                s[i][j] = s[i - 1][j - 1] + s[i - 1][j];
            s[i][i] = 1;
        }
        int maxNum = s[strings - 1][(strings - 1) / 2];
        int maxNumWidth = Integer.toString(maxNum).length();

        for (int i = 0; i < strings; i++) {
            int stringPad = (strings - 1 - i) * (maxNumWidth + 1) / 2;
            if (stringPad > 0)
                System.out.print(String.format("%" + stringPad + "s", ""));
            for (int j = 0; j <= i; j++) {
                String paddedNum = Integer.toString(s[i][j]);
                int totalPad = maxNumWidth - paddedNum.length();
                int rPad = totalPad / 2;
                if (rPad > 0)
                    paddedNum = String.format("%s%" + rPad + "s", paddedNum, "");
                int lPad = totalPad - rPad;
                if (lPad > 0)
                    paddedNum = String.format("%" + lPad + "s%s", "", paddedNum);
                System.out.print(paddedNum);
                if (j < i)
                    System.out.print(" ");
                else
                    System.out.println();
            }
        }
    }
}
