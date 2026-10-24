class Solution {
    public int[] replaceElements(int[] arr) {
        int largest = 0;
        for (int i = 0;i<arr.length - 1;i++){
            for (int j = 0;j<arr.length - i;j++){
                if (arr[i] == largest){
                    largest = 0;
                }
                if (arr[j + i] > largest){
                    largest = arr[j+i];
                }
            } 

            arr[i] = largest;
        }
        arr[arr.length -1] = -1;   
        return arr;  
    }
}