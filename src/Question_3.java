import static java.lang.Integer.parseInt;

public class Question_3 {
//    given 2 numbers x & y, find largest number by concentrating them in any order.
    public static void main(String[] args) {
        String x = "47";
        String y = "53";
        System.out.println("larger value : "+largerNum(x,y));
    }
    static int largerNum(String x, String y){
        if(parseInt(x+y)<parseInt(y+x)){
            return parseInt(y+x);
        }else{
            return parseInt(x+y);
        }
    }
}
