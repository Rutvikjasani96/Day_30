public class Question_1 {
//    Given n distinct elements, check if array can be rearranged in strictly increasing order by 1.
    public static void main(String[] args) {
        int[] array = {10,12,11,14,13,15};
        System.out.println("ans : "+isStrictlyIncreasing(array));
    }
    static boolean isStrictlyIncreasing(int[] array){
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for(int i=0;i< array.length;i++){
            min = Math.min(min,array[i]);
            max = Math.max(max,array[i]);
        }
        if(array.length==(max-min+1)){
            return true;
        }
        return false;
    }
}
