/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */ 

package javaapplication30;
  import java.util.Scanner;

/**
 *
 * @author vip
 */
public class JavaApplication30 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
	  Scanner sc= new Scanner(System.in); 
     System.out.println("Enter first number- ");  
	  float x = sc.nextFloat();
     System.out.print("Enter second number- ");  
	  float y= sc.nextFloat();
	 System.out.println("please choose the operation * % / - + ");  
         char z = sc.next().charAt(0);
   
	    float s = 0;
	  switch(z){
		  case '+':
			  s=sum(x,y);
			  break;
		  case '-':  
			  s=sub(x,y);
			  break;
		  case '*':  
			  s=mul(x,y);
			  break;
		  case '/':  
                     
                         s=div(x,y);
                    
     
                    
			  
			  break;
		  case '%':  
			  s=mod(x,y);
			break;
                    default:  s=0;
			  
	  }
	     System.out.print("The result is : "+s); 
   
  } 
	static float sum(float x,float y){
		return x+y;
	}
	
	static float sub(float x,float y){
		return x-y;
	}

	static float div(float x,float y){
             float z = 0;
            try{
               
                z=x/y;
            }
             catch(ArithmeticException e)
                     {System.out.println(e);}  
             
            
		return z;
	}
	
	 static float mul(float x,float y){
		return x*y;
	}
         static float  mod(float x,float y){
		return x%y;
	}
	
}
    
    

