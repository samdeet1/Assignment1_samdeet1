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
     * This function should reverse 'num' and return the resulting value. 
     * i.e. if num = 1234
     *      the function will return 4321
     * @param - description of passed in arguments go here
     * @return - description of return value goes here
     *****/
    public void templateFunction(int num) {
        double newNumber = 1;
        
        for (int i = 1; i <= num; i++) {
            newNumber = newNumber * i;
        }
        return newNumber;
   }
            
       
            
            
            
            
            
            
    }
}
