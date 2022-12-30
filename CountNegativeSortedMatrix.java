//leetcode.com/problems/count-negative-numbers-in-a-sorted-matrix/
public class CountNegativeSortedMatrix {
    public static void main(String[] args) {
        int arr[][] = {
                { 4, 3, 2, -1 },
                { 3, 2, 1, -1 },
                { 1, 1, -1, -2 },
                { -1, -1, -2, -3 }
        };
        int ans = findnegitive(arr);
        System.out.println(ans);
    }

    private static int findnegitive(int[][] arr) {
        // int row = 0;
        // int column = arr[row].length - 1;
        int count = 0;
        for ( int i = 0; i < arr.length; i++) {
            for (int j = arr[i].length-1; j >=0; j--) {
                if(arr[i][j]<0){
                    count++;
                }
            }
        }
        return count;
    }
}
