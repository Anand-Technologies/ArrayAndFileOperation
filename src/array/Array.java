package array;

public class Array {
	public static void main(String[] args) {
		int a[] = new int[5];
			a[0] = 10;
			a[1] = 150;
			a[2] = 50;
			a[3] = 100;
			a[4] = 90;
		System.out.println(a[3]);
		
		//Length of array
		int le = a.length;
		System.out.println(le);
		
		//To print all values one by one by index
		for(int i=0;i<a.length;i++) {
			System.out.println("Iterate using Normal For loop :"+a[i]);
		}
			
		//To print all value one by one by values
			for (int x : a) {
				System.out.println("Iterate using Enhanced For loop :"+x);
			}
			
		int b[] = new int[5];
			b[0] = 100;
			b[3] = 200;
			b[2] = 300;
			b[3] = 500;
			b[4] = 400;
		for(int x : b) {
			System.out.println(x);
		}
	}

}
