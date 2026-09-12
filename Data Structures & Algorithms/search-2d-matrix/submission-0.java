class Solution {
    public boolean searchMatrix(int[][] matrix, int target){
        for (int[] arr : matrix) {
            if (target <= arr[arr.length - 1] && target >= arr[0]) {
                return isBinarySearch(arr, target);
            }
            else{
                continue;
            }
        }
        return false;
    }
    public boolean isBinarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        while (left <= right){
            int mid = left + (right - left) / 2;
            if (arr[mid] == target){
                return true;
            }
            else if (arr[mid] > target){
                right--;
            }
            else {
                left++;
            }
        }
        return false;
    }
}
