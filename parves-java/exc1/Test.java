package exc1;

import java.util.Scanner;
import java.util.Arrays;

public class Test{

public static void main(String[] args) {

	System.out.println("Store 1 to 100 in Array");
	      int[] intArray = new int[100];
	      for(int i=1; i<100; i++) {
	         intArray[i] = i;
}
	      System.out.println(Arrays.toString(intArray));
	      
	      
	System.out.println("Numbers from 1 to 100 are:");
	for(int j=1;j<=100;j++){
System.out.println(j+" ");
}
	
	System.out.println("Numbers from 1 to 100 in reverse are:");
	for(int k=100;k>=1;k--){
System.out.println(k+" ");
}
	
	System.out.println("Odd numbers from 1 to 100 are:");
	for(int l=1;l<=100;l++){
		if(l%2!=0)
System.out.println(l+" ");
}
	
	System.out.println("Even numbers from 1 to 100 are:");
	for(int m=1;m<=100;m++){
		if(m%2==0)
System.out.println(m+" ");
}
	
	System.out.println("Odd numbers between the given input:");
	Scanner s1 = new Scanner(System.in);
			System.out.println("Input the First Number: ");
			int a = s1.nextInt();
			System.out.println("Input the Second Number: ");
			int b = s1.nextInt();
			for (int n=a; n<=b; n++) {
				if(n%2!=0)
			System.out.println(n);
}
			
	System.out.println("Even numbers between the given input:");
	Scanner s2 = new Scanner(System.in);
			System.out.println("Input the First Number: ");
			int c = s2.nextInt();
			System.out.println("Input the Second Number: ");
			int d = s2.nextInt();
			for (int o=a; o<=b; o++) {
				if(o%2==0)
			System.out.println(o);
}
	
	System.out.print("The table for given number: ");
	System.out.print("\n");
	Scanner sc = new Scanner(System.in);  
    System.out.print("Enter number: ");       
    int num=sc.nextInt();    
  for(int i=1; i <= 10; i++)  
  {      
  System.out.println(num+" * "+i+" = "+num*i);  
  }  
			
	 System.out.print("Print 1, 12");
	    for(int i=0;i<=4;i++){
	    	for(int j=1;j<=i;j++){
	    		System.out.print(j);
	    	}
	    	System.out.print("\n");
}
	    	
	 System.out.print("Print 1, 22");
		for(int i=0;i<=4;i++){
		    for(int j=1;j<=i;j++){
		    	System.out.print(i);
		    }
		    System.out.print("\n");
}
		    	
	 System.out.print("Print *");
			for(int i=0;i<=4;i++){
			    for(int j=1;j<=i;j++){
			    	System.out.print("*");
			    }
			    System.out.print("\n");
}
			    	
	 System.out.print("\n");
				for(int i=4;i>=0;i--){
				    for(int j=1;j<=i;j++){
				    	System.out.print("*");
				}
				System.out.print("\n");
}
				
	 System.out.print("\n");
			    for(int i=1;i<=4;i++){
			    	for(int j=1;j<=i;j++){
			    		System.out.print("*");
			    	}
			    	System.out.print("\n");
			    }
			    for(int i=3;i>=1;i--){
			    	for(int j=1;j<=i;j++){
			    		System.out.print("*");
			    	}
			    	System.out.print("\n");
}
			    
			    
	 System.out.print("\n");
			    for(int i=1;i<=4;i++){
			    	for(int j=1;j<=4-i;j++){
			    		System.out.print(" ");
			    	}
			    	for(int k=0;k<2*i-1;k++){
			    		System.out.print("*");
			    	}
			    	System.out.print("\n");
}
			    
	 System.out.print("\n");
			    for(int i=4;i>=1;i--){
			    	for(int j=1;j<=4-i;j++){
			    		System.out.print(" ");
			    	}
			    	for(int k=0;k<2*i-1;k++){
			    		System.out.print("*");
			    	}
			    	System.out.print("\n");
}
			    
	 System.out.print("\n");
			    for(int i=1;i<=4;i++){
			    	for(int j=1;j<=4-i;j++){
			    		System.out.print(" ");
			    	}
			    	for(int k=0;k<2*i-1;k++){
			    		System.out.print("*");
			    	}
			    	System.out.print("\n");
			    }
			    for(int i=3;i>=1;i--){
			    	for(int j=1;j<=4-i;j++){
			    		System.out.print(" ");
			    	}
			    	for(int k=0;k<2*i-1;k++){
			    		System.out.print("*");
			    	}
			    	System.out.print("\n");
				
}
}
}