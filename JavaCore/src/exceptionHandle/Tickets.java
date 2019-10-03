package exceptionHandle;


public class Tickets {
	static int booktick = 0, temp =0;
	
	void bookTicket(int noOfTickets) throws TicketNotAvailableException {
		//System.out.println(noOfTickets+" "+booktick);
		booktick+=noOfTickets; temp=noOfTickets;
		if (booktick > 5) {
			booktick-=noOfTickets;
			throw new TicketNotAvailableException();
		}

	}
	void cancleTicket(int noOfTickets) throws TicketNotAvailableException {
		//System.out.println(noOfTickets+" "+booktick);
		booktick-=noOfTickets;
		if (booktick > 5)
			throw new TicketNotAvailableException();
	}
}
