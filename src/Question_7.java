public class Question_7 {
//    given an array of words A of Size N written in alien language,
//    and the order of the alphabet denoted by string B of size 26.
//    return 1 if and only if given words are sorted lexicographically
//    in this alien language else return 0.
    public static void main(String[] args) {
        String[] words = {"hello","scaler","interviewbit"};
        String B = "adhbcfegskjlpomnirqtxwuvzy";
        System.out.println("ans : "+solution(words,B));
    }
    static boolean solution(String[] words,String B){
        for(int i=0;i<words.length-1;i++){
            int ithInd=0,jthInd=0;
            for(int j=0;j<B.length();j++) {
                if(words[i].charAt(0) == B.charAt(j)) {
                    ithInd = j;
                }else if(words[i+1].charAt(0) == B.charAt(j)){
                    jthInd = j;
                }
            }
            if (ithInd > jthInd){
                return false;
            }
        }
        return true;
    }
}
