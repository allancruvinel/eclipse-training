package utils;

import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Client {
	private String name;
	private String email;
	private Date birthDate;
	private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	
	public Client(String name, String email,String birthdate) throws ParseException {
		
		this.name=name;
		this.email=email;
		this.birthDate = sdf.parse(birthdate);
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getBirthDate() {
		return sdf.format(birthDate);
	}
	
	
}
