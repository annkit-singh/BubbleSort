

/**
 *
 * @author Arl Kheem Rey Galario
 */
public class bubbleSORT {
  
 
//this is the optimized version of bubble sort
    public void bubbleSort(int array[]) {
        int count = 0;  // counts the number of comparisons in an array while traversing 
        for (int i = 0; i < array.length; i++) {
            count = 0;

            for (int j = 0; j < array.length - 1; j++) {
                step++;
                if (array[j] > array[j + 1]) {
                    count++;
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
                if (j == array.length - 2 && count == 0)  //if no comparisons found then we should return as array is sorted at that point
                    return;

            }

        }
    }
 
    
    public static void main(String [] args){
    
        int i, j , swap;
        
        int [] arr = {3,2,1,5,1,2,6,6,8,4,9,12 ,0 ,34, 34,6,1,100}; // array to be sorted
    
            for(i = 0; i < arr.length; i ++){
                
                for(j = 0; j < arr.length - 1  ;j++){
                    
                    if(arr[j] > arr[j+1]){
                        
                        swap = arr[j];        // place the bigger number to swap
                        arr[j] = arr[j+1];    // place the smaller number
                        arr[j+1] = swap;      
                    
                    
                    }
                }
            }
            
            //Display the sorted array
            for(int x = 0 ; x < arr.length ; x ++){
            System.out.print(arr[x] + ", ");
            
            }
    }
}
