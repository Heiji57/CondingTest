class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] res = new String[n];

        for(int i=0;i<n;i++){
            String binary = Integer.toBinaryString(arr1[i] | arr2[i]);
            if(binary.length()!=n){
                binary = " ".repeat(n - binary.length()) + binary;
            }
            binary = binary.replaceAll("1", "#");
            binary = binary.replaceAll("0", " ");
            res[i] = binary;
        }
        return res;
    }
}