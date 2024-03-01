import java.util.HashSet;

public class Question_5 {
//    for a given number A, find whether its colorful number or not
//    if yes, return 1 else return 0.
//    Colorful number : one in the which product of every digit of a contiguous subsequence is different.
    public static void main(String[] args) {
        String s = "236";
        System.out.println("iscolorful : "+isColorful(s));
    }
    static boolean isColorful(String s){
        HashSet<Integer> hs = new HashSet<>();
        for(int i=0;i<s.length();i++){
            int product = 1;
            for(int j=i;j<s.length();j++){
                product = product * (s.charAt(j) - '0');
                if(hs.contains(product)){
                    return false;
                }
                hs.add(product);
            }
        }
        return true;
    }
}
