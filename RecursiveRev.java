# ArrayREvrecurv

	import java.util.ArrayList;
	import java.util.List;
	import java.util.Scanner;

	public class RecursiveRev {
	List<Integer> empty =new ArrayList<>();	
	static int a;
	public List<Integer> ReverseList(List list){
		a=list.size();
		if(a==0){
		return empty;
			}
		else
		{
			a--;
			empty.add((Integer) list.get(a));
			list.remove(a);
			return ReverseList(list);
			}
}
public static void main(String[] args) {
			List<Integer> list=new  ArrayList<>();
			Scanner sr=new Scanner(System.in);
			int number;
			System.out.println("Enter no of elements");
			number=sr.nextInt();
			System.out.println("Enter Values");
			for(int i=0;i<number;i++){
				list.add(sr.nextInt());
			}
			RecursiveRev rr=new RecursiveRev();
	        System.out.println(rr.ReverseList(list));
	        }
}


