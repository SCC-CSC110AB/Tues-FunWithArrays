package tues.funwitharrays;

/**
 *
 * @author john
 */
public class TuesFunWithArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int[] myIntArray = {0, 1, 2, 3};
        
        System.out.println(myIntArray[0]);
        
        myIntArray[2] = 5;
        
        System.out.println(myIntArray[2]);
        
        int temp = myIntArray[0];
        
        myIntArray[0] = myIntArray[2];
        
        myIntArray[2] = temp;
        
        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println(myIntArray[i]);
        }
        
        System.out.println("-----");
        
        int[] myOtherArray = new int[5];
        
        for (int i = 0; i < myOtherArray.length; i++) {
            myOtherArray[i] = (int)(Math.random() * 100);
        }
        
        for (int i = 0; i < myOtherArray.length; i++) {
            System.out.println(myOtherArray[i]);
        }
    }
    
}
