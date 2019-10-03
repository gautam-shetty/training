package exceptionHandle;

public class MainException {


	public static void main(String[] args) {

		Tickets ticket = new Tickets();
		int ticNum=0;
		try {
			ticNum=3;
			ticket.bookTicket(ticNum);
			System.out.println(ticNum+" TICKETS BOOKED");
		} catch (TicketNotAvailableException e) {
			System.out.println(e.getMessage());
		}

		try {
			ticNum=2;
			ticket.bookTicket(ticNum);
			System.out.println(ticNum+" TICKETS BOOKED");
		} catch (TicketNotAvailableException e) {
			System.out.println(e.getMessage());
		}

		try {
			ticNum=3;
			ticket.bookTicket(ticNum);
			System.out.println(ticNum+" TICKETS BOOKED");
		} catch (TicketNotAvailableException e) {
			System.out.println(e.getMessage());
		}
		try {
			ticNum=3;
			ticket.cancleTicket(ticNum);
			System.out.println(ticNum+" TICKETS CANCLED");
		} catch (TicketNotAvailableException e) {
			System.out.println(e.getMessage());
		}
		try {
			ticNum=2;
			ticket.bookTicket(ticNum);
			System.out.println(ticNum+" TICKETS BOOKED");
		} catch (TicketNotAvailableException e) {
			System.out.println(e.getMessage());
		}
		try {
			ticNum=1;
			ticket.bookTicket(ticNum);
			System.out.println(ticNum+" TICKETS BOOKED");
		} catch (TicketNotAvailableException e) {
			System.out.println(e.getMessage());
		}
		try {
			ticNum=1;
			ticket.bookTicket(ticNum);
			System.out.println(ticNum+" TICKETS BOOKED");
		} catch (TicketNotAvailableException e) {
			System.out.println(e.getMessage());
		}

	}

}