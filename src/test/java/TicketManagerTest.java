import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TicketManagerTest {

    @Test

    public void ticketSortTest() {
        TicketRepository repo = new TicketRepository();
        TicketManager manager = new TicketManager(repo);

        Ticket ticket1 = new Ticket(1, "MSK", "NN", 900, 400);
        Ticket ticket2 = new Ticket(2, "Samara", "SPB", 1000, 900);
        Ticket ticket3 = new Ticket(3, "MSK", "NN", 800, 420);
        Ticket ticket4 = new Ticket(4, "NN", "Kazan", 1500, 450);
        Ticket ticket5 = new Ticket(5, "Volgograd", "Rostov", 1200, 700);

        manager.add(ticket1);
        manager.add(ticket2);
        manager.add(ticket3);
        manager.add(ticket4);
        manager.add(ticket5);

        Ticket[] expected = {ticket3, ticket1};
        Ticket[] actual = manager.findAll("MSK", "NN");

        Assertions.assertArrayEquals(expected, actual);
    }

}
