import java.util.LinkedList;
import java.util.Scanner;

public class SuperStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try{
			Scanner sc = new Scanner(System.in);
			int length = (sc.nextInt())+1;
			String[] sArray = new String[length];
			for(int i=0;i<length;i++){
				sArray[i] = sc.nextLine();
			}
	
			stackImpl(sArray);
		} catch(NumberFormatException e) {
			System.out.println("please give push in format 'push 5' and inc in format 'inc 2 2'");
		}
	}
	
	static void stackImpl(String[] sa) throws NumberFormatException{
		LinkedList<Integer> ll = new LinkedList<Integer>();
		for(int i=1;i<sa.length;i++){
			if(sa[i].contains("push")){
				//System.out.println(sa[i]);
				String[] splitValue = sa[i].split(" ");
				ll.add(Integer.parseInt(splitValue[1]));
				System.out.println(splitValue[1]);
			}else if (sa[i].contains("pop")){
				ll.removeLast();
				System.out.println(ll.peekLast() == null ? "EMPTY":ll.peekLast());
			} else {
				String[] sValue = sa[i].split(" ");
				for(int j=0;j<Integer.parseInt(sValue[1]);j++) {
					ll.add(j, (ll.get(j) + Integer.parseInt(sValue[2])));
					ll.remove(j+1);
				}
				System.out.println(ll.peekLast());
			}
		}
	}

}
