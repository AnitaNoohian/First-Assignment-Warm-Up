public class Exercises1 {
    /*
    implement a function that returns factorial of given n
     */
    public long factorial(int n) {
        long result = 1;
        for (int i = 1; i <= n; i++){
            result *= i;
        }
        return result;
    }


    /*
    implement a function that return nth number of fibonacci series
    the series -> 1, 1, 2, 3, 5, 8, ...
    */
    public long fibonacci(int n) {
        long first = 1;
        long second = 1;
        long help = 0;
        for (int i = 0; i < n-2; i++){
            help = second + first;
            first = second;
            second = help;
        }
        return second;
    }


    /*
    implement a function that returns a triangle for example:
    row = 5

    *
    **
    ***
    ****
    *****

     */
    public char[][] generateTriangle(int rows){
        char[][] shape = new char[rows][];
        for (int i = 0; i < rows; i++){
            for (int j = 0; j < i+1; j++){
                shape[i][j] = '*';
            }
        }

        return shape;
    }


    public static void main(String[] args) {
        // test your code here!
    }

}