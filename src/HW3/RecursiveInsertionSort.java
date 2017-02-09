package HW3;

/**Tyler Atiburcio
 *CSCI 3101
 * HW-3; Recursive Insertion SOrt
 * @author Tyler Atiburcio
 * @DATE 2/8/14
 * @version 1
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
    /**Recursive method that sorts an array using InsertionSort Algorithm
     * PreCondition: Array index is not 0
     * PostCondition: Array is Sorted when index is 0
     * @param index Current index to sort to
     */
    public static void recursiveInsertion(int index)
    {
        if(index == 0) return;
        recursiveInsertion(index-1);
        
        //Begin debug statements to confirm that array is sorted recursively
        System.out.println("Step: " + index);
        for (int i = 0; i < TEST.length; i++) {
            System.out.println(TEST[i]);
        }
        System.out.println("");
        //End debug statements to confirm that array is sorted recursively
        
        int j;
        int key;
        int i;
        //Sort from 0 to index (sorted side of the array)
        for (j = 0; j <= index; j++) {
            key = TEST[j];
            for (i = j-1; (i >=0) && (TEST[i] > key); i--) {
                TEST[i+1] = TEST[i];
            }
            TEST[i+1] = key;
        }
    }
}
