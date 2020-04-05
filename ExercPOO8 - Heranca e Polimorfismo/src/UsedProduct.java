import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class UsedProduct extends Product{
	private Date date;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public UsedProduct(){
		super();
	}
	
	public UsedProduct(String name, Double price, String date) throws ParseException {
		super(name, price);
		this.date = sdf.parse(date);
		// TODO Auto-generated constructor stub
	}

	public String getDate() {
		return sdf.format(date);
	}
	
	@Override
	public String priceTag() {
		return super.getName()+" (used) $ "+String.format("%.2f", super.getPrice())+" (Manufacture date: "+this.getDate()+")"; 
	}
	
	
}
