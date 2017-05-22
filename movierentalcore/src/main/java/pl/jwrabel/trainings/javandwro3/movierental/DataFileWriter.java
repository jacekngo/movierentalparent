package pl.jwrabel.trainings.javandwro3.movierental;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by jakubwrabel on 22/05/2017.
 */
public class DataFileWriter {
	public static void main(String[] args) {
		List<Customer> customers = new ArrayList<>();
		customers.add(new Customer("1234","Adam", "Miauczyński", "Wroclaw", new Date()));
		customers.add(new Customer("23245","Jan", "Nowak", "Wroclaw", new Date()));

		writeCustomersToFile("customers.csv", customers);
	}

	public static void writeCustomersToFile(String fileName, List<Customer> customers){

	}
}
