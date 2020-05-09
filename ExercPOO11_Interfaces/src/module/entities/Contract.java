package module.entities;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import module.services.ServiceFee;

public class Contract {
	private int number;
	private Date initialDate;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	private Double value;
	private int parcelas;
	private ServiceFee serviceFee;
	
	List<Installment> list = new ArrayList<>();
	
	public Contract() {
		
	}

	public Contract(int number, String initialDate, Double value, int parcelas,ServiceFee serviceFee) throws ParseException {
		this.number = number;	
		this.initialDate = sdf.parse(initialDate);
		this.value = value;
		this.parcelas = parcelas;
		this.serviceFee = serviceFee;
		generateInstallments();
	}
	
	public void generateInstallments() {
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(initialDate);
		
		for (int i=1; i<=this.parcelas;i++) {
			
			cal.add(Calendar.MONTH, 1);
			Date nd = cal.getTime();
			
			double newvalue = serviceFee.feeReturn(this.value/parcelas, i);
			Installment newMonth = new Installment(nd,newvalue);
			list.add(newMonth);
			
		}
	}
	
	public List<Installment> monthsPreview() {
		return list;
	}
	
	
	
	
}
