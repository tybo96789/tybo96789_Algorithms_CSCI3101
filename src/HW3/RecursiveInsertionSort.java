package HW3;

/**
 *
 * @author Tiny7
 */
public class RecursiveInsertionSort {
    
    
    private final static int[] TEST = {4,3,2,1};
    
    public static void main(String[] args) {
        for (int i = 0; i < TEST.length; i++) {
            System.out.println(TEST[i]);
        }
        System.out.println("Begin Sort");
        recursiveInsertion(TEST.length-1);
        System.out.println("End Sort");
        for (int i = 0; i < TEST.length; i++) {
            System.out.println(TEST[i]);
        }
    }
    
    public static void recursiveInsertion(int index)
    {
        if(index == 0) return;
        recursiveInsertion(index-1);
        int j;
        int key;
        int i;
        for (j = 0; j <= index; j++) {
            key = TEST[j];
            for (i = j-1; (i >=0) && (TEST[i] > key); i--) {
                TEST[i+1] = TEST[i];
            }
            TEST[i+1] = key;
        }
    }
}
