import java.time.ZonedDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

// Define a class
public class Banana1 {

	// Main method - entry point of the program
	public static void main(String[] args) {

		// Print "Hello, World!" to the console
		System.out.println("Hello, World! 2");

		// Get the current date and time in UTC
		ZonedDateTime now = ZonedDateTime.now();

		// Convert to Eastern Time (EST or EDT, depending on daylight saving time)
		ZonedDateTime estTime = now.withZoneSameInstant(ZoneId.of("America/New_York"));

		// Format the date and time
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss z");
		String formattedDateTime = estTime.format(formatter);

		// Print the formatted date and time
		System.out.println("Current date and time in EST: " + formattedDateTime);

	}
}