import java.util.*;

class Product{
	private int cost, num;
	static int sum = 0;
	
	Product(int cost, int num){
		this.cost = cost;
		this.num = num;
		productSum();
	}
	
	private void productSum() {
		sum += cost * num;
	}
}

class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int n = sc.nextInt();
		
		Product[] p = new Product[n];
		
		for(int i = 0; i < n; i++)
			p[i] = new Product(sc.nextInt(), sc.nextInt());
		
		String result = (x == Product.sum) ? "Yes" : "No";
		System.out.println(result);
		sc.close();
	}
}