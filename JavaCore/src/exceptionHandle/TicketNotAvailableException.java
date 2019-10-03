package exceptionHandle;

//import java.lang.reflect.Executable;
 import static exceptionHandle.Tickets.temp;

public class TicketNotAvailableException extends Exception {
	@Override
	public String getMessage() {
		return "Tickets sold out "+"(For "+temp+" tickets )";
	}
}
