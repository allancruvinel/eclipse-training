package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

import entities.Product;

public class Main {

	public static void main(String[] args){
		Locale.setDefault(new Locale("pt", "BR"));
		String pathin = "C:\\in.csv";
		String pathout = "C:\\out";
		
		List<Product> list = new ArrayList<>();
		
		//in section
		try (BufferedReader br = new BufferedReader(new FileReader(pathin))) {
			
			String line = br.readLine();
			
			while(line != null) {
				
				String[] values = line.split(";");
				String name = values[0];
				double value = new Double(values[1]);
				int quantity = Integer.parseInt(values[2]);
				list.add(new Product(name,value,quantity));
				line = br.readLine();
				
			}	
		}catch(IOException e) {
			e.getMessage();
		}
		
		
		
		//out section
		Boolean Criado = new File(pathout).mkdir();
		
		System.out.println("arquivo de saida criado em "+pathout+" resultado "+Criado);
		
		try(BufferedWriter bw = new BufferedWriter(new FileWriter(pathout+"\\summary.csv")))
		{
			for(Product p : list) {
				bw.write(p.getName()+";"+p.getTotal());
				bw.newLine();
			}
			
		}
		catch(IOException e) {
			e.getMessage();
		}
		
	}

}
