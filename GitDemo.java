/*****
* Samdeet Khan
 ******/
public class GitDemo {
    
    private double previousNumber;
    
    public GitDemo() {
        previousNumber = 1;
    }
    
    /*****
     * This function adds the given number to the private "previousNumber"
     * stored in the GitDemo class. 
     * 
     * @param num - A number that should be added to GitDemo:previousNumber
     * @return the updated value of 'previousNumber'
    *****/
    public double addNumber(double num) {
        System.out.print("Add num to previousNumber");
        previousNumber += num;
        return previousNumber;
    }
    
  /*****
  * All the code that was in main goes into this function
  *
  * @param num - A number to serve as the size of the for loop
  * @return 'newNumber'
  *******/
  public double function1(int num) {
        for (int i = 1; i <= num; i++) {
            newNumber = newNumber * i;
        }
        return newNumber;
  }
  
  /**
  * all the code that was added in branch 2 goes in this function
  */
  
  public double function2(int num) {
         double factorialNumber = 0;
         while ( num != 0 ) {
           double temp = num %10;
           factorialNumber = factorialNumber * 10 + temp;
           num /= 10;
         }
    return factorialNumber;
  }
   
}
