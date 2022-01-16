import Hashing.ChainingImpl;

public class HashingTest {

    private static int[] arr = new int[]{11,16,43,76,23,98,32,12,10,7,49,44,35};

    public static void main(String[] args) {
        ChainingImpl hash = new ChainingImpl(7);
        for(Integer ele:arr){
            hash.insert(ele);
        }


    }
}
