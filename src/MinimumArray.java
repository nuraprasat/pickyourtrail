import java.util.Arrays;
import java.util.Scanner;

public class MinimumArray {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
	    int total=sc.nextInt();
	    int array[]=new int[total];
	    int sum =0;
	    for(int i=0;i<total;i++){
	    	array[i]=sc.nextInt();
	    }
	    
	    Arrays.sort(array);
	    
	    for(int i=0;i<total;i++){
	    	if((i+1)<total){
	    	if(array[i] == array[i+1]){
	    		array[i+1] = array[i+1]+1;
	    	}
	    	}
	    	sum+=array[i];
	    }

	    System.out.println(sum);
	}

}
