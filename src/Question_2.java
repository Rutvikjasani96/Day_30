public class Question_2 {
//    given an array of distinct integers, find length of the longest subarray which continuous numbers
//    that can be rearranged in continuous sequence.
    public static void main(String[] args) {
        int[] array = {10,12,11,15};
        System.out.println("length : "+maxContinuousSubarrayLen(array));
    }
    static int maxContinuousSubarrayLen(int[] array){
        int ans = 1;
        for(int i=0;i<array.length;i++){
            int max = array[i];
            int min = array[i];
            for(int j=i;j<array.length;j++){
                min = Math.min(array[j],min);
                max = Math.max(array[j],max);
                if(max-min+1==j-i+1){
                    ans = Math.max(ans,j-i+1);
                }
            }
        }
        return ans;
    }
}
