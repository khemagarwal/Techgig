/* Read input from STDIN. Print your output to STDOUT*/

import java.io.*;
import java.util.*;

public class CandidateCode {
   public static void main(String args[] ) throws Exception {

	//Write code here
   Scanner sc=new Scanner(System.in);
   double p=0;
   int i=0;
   int y=0;
   p=sc.nextDouble();
   i=sc.nextInt();
   y=sc.nextInt();

   double si=0;
   si=(p*i*y)/100;
   System.out.print(Math.round(si));

   }
}
