package pl.jwrabel.trainings.javandwro3.movierental;

import java.text.ParseException;
import java.util.List;

/**
 * Created by jakubwrabel on 22/05/2017.
 */
public class DataFileReader {
	public static List<Customer> readCustomersFromFile(String fileName) {

		// TODO FIX!!!
		try {
			String line = "0,1234,Adam,Miauczyński,Wroclaw,2017-05-22";
			Customer customer = new Customer(line);
		} catch (ParseException e) {
			e.printStackTrace();
		}

		return null;
	}
}
