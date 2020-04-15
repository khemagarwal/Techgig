/* 
 * Enter your code here. Read input from STDIN. Print your output to STDOUT. 
 * Your class should be named CandidateCode.
*/

import java.io.*;
import java.util.*;
public class CandidateCode {
    public static void main(String args[] ) throws Exception {

    	//Write code here
        Scanner input = new Scanner (System.in);
  if (input.hasNextInt())
   System.out.print("This input is of type Integer.");
   
   else if (input.hasNextFloat())
  System.out.print("This input is of type Float.");
   
  else if (input.hasNextLine())
  System.out.print("This input is of type string."); 
        

else
System.out.print("This is something else.");

   }
}
