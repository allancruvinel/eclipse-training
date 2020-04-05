import java.text.ParseException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws ParseException {
		
		List<Product> list = new ArrayList<>();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the number of products ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i=1; i<=n;i++) {
			System.out.println("Product "+i+" data: ");
			System.out.print("Common, used or imported (c/u/i)? ");
			char a = sc.nextLine().charAt(0);
			
			System.out.print("Name ");
			String name = sc.nextLine();
			System.out.print("Price ");
			Double price = sc.nextDouble();
			sc.nextLine();
			if(a=='c') {
				list.add(new Product(name,price));
			}
			else if(a=='u') {
				System.out.print("Manufacture date (DD/MM/YYYY) ");
				String date = sc.nextLine();
				list.add(new UsedProduct(name,price,date));
			}
			else if (a=='i') {
				System.out.print("Customs fee: ");
				double customsFee = sc.nextDouble();
				list.add(new ImportedProduct(name,price,customsFee));
				sc.nextLine();
			}
			
		}
		
		for(Product e : list) {
			System.out.println(e.priceTag());
		}
		
		sc.close();

	}

}
