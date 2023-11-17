import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;
        int[][] table = new int[n][n];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < n; j++) {
                table[i][j] = i*n + j + 1;
            }
        }
        table[n-1][n-1] = 0;

        for(int repeat = 0; repeat < 10000; repeat++) {
            int i1 = (int) (n * Math.random());
            int j1 = (int) (n * Math.random());
            int i2 = (int) (n * Math.random());
            int j2 = (int) (n * Math.random());
            if(i1 == n-1 && j1 == n-1) {
                continue;
            }
            if(i2 == n-1 && j2 == n-1) {
                continue;
            }
            int temp = table[i1][j1];
            table[i1][j1] = table[i2][j2];
            table[i2][j2] = temp;
        }


        int x0 = n-1, y0 = n-1;
        // table[x0][y0] <- 0

        while(true) {
            // print table
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < n; j++) {
                    System.out.print(table[i][j] + "\t");
                }
                System.out.println();
            }
            System.out.println("x0:" + x0 + ", y0:" + y0);
            // get input
            String action = sc.next();

            // do action
            if("u".equals(action)) {
                table[x0][y0] = table[x0-1][y0];
                table[x0-1][y0] = 0;
                x0 = x0-1;
            } else if("d".equals(action)) {
                table[x0][y0] = table[x0+1][y0];
                table[x0+1][y0] = 0;
                x0 = x0+1;
            } else if("l".equals(action)) {
                table[x0][y0] = table[x0][y0-1];
                table[x0][y0-1] = 0;
                y0 = y0-1;
            } else if("r".equals(action)) {
                table[x0][y0] = table[x0][y0+1];
                table[x0][y0+1] = 0;
                y0 = y0+1;
            }

            // check win
            boolean isWin = true;
            for(int i = 0; i < n; i++) {
                for(int j = 0; j < n; j++) {
                    if(i == n-1 && j == n-1) {
                        if(table[i][j] != 0) {
                            isWin = false;
                        }
                    }
                    else {
                        if(table[i][j] != i*n + j + 1) {
                            isWin = false;
                        }
                    }
                }
            }
            if(isWin) {
                System.out.println("Hooorraaaa!!!!");
                break;
            }
        }
    }
}
