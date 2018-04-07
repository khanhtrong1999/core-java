package dt;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class Bai29 {
	public static void main(String[] args) {
		   String string = "April 5, 2018";
		   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MMMM d, yyyy", Locale.ENGLISH);
		   LocalDate date = LocalDate.parse(string, formatter);
		   System.out.println(date);
		  }
}