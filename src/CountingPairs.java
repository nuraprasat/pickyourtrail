import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class CountingPairs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
	    int total=sc.nextInt();
	    int array[]=new int[total];
	    for(int i=0;i<(total);i++){
	    	array[i]=sc.nextInt();
	    }
	    int k = sc.nextInt();
	    //System.out.println(Math.abs(2-3));
	    countPair(array,k);
	}
	
	static void countPair(int[] a, int k){
		Arrays.sort(a);
		
		HashMap<Integer, Integer> hm = new HashMap<Integer, Integer>();
		for(int i=0;i<a.length;i++){
			for(int j=i+1;j<a.length;j++){
				if(Math.abs(a[i]-a[j]) == k || Math.abs(a[j] - a[i]) == k){
					hm.put(a[i], a[j]);
				}
			}
		}
		System.out.println(hm.size());
	}

}
