import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;

public class GymMembershipTest {

    GymMembership gymMembership;

    @BeforeEach
    public void setUp(){
        gymMembership = new GymMembership("Huso", "Isik", "03/02/2024", false, 20 );
    }

    @Test
    public void testGetFirstName(){
        assertThat(gymMembership.getFirstName()).isEqualTo("Huso");
    }

    @Test
    public void testSetFirstName(){
        gymMembership.setFirstName("Huso");
        assertThat(gymMembership.getFirstName()).isEqualTo("Huso");
    }

    @Test
    public void testGetLastname(){
        assertThat(gymMembership.getLastName()).isEqualTo("Isik");
    }

    @Test
    public void testSetLastName(){
        gymMembership.setLastName("Isik");
        assertThat(gymMembership.getLastName()).isEqualTo("Isik");
    }

    @Test
    public void testGetRenewalDate(){
        assertThat(gymMembership.getRenewalDate()).isEqualTo("03/02/2024");
    }

    @Test
    public void testSetRenewalDate(){
        gymMembership.setRenewalDate("03/02/2024");
        assertThat(gymMembership.getRenewalDate()).isEqualTo("03/02/2024");
    }

    @Test
    public void testGetActive(){
        assertThat(gymMembership.getActive()).isEqualTo(false);
    }

    @Test
    public void testSetActive(){
        gymMembership.setActive(false);
        assertThat(gymMembership.getActive()).isEqualTo(false);
    }

    @Test
    public void testGetCurrentFee(){
        assertThat(gymMembership.getCurrentFee()).isEqualTo(20);
    }

    @Test
    public void testSetCurrentFee(){
        gymMembership.setCurrentFee(20);
        assertThat(gymMembership.getCurrentFee()).isEqualTo(20);
    }

    @Test
    public void testCalculateRenewalFee(){
        assertThat(gymMembership.calculateRenewalFee()).isEqualTo(22.0);
    }

    @Test
    public void testRenewMembership() {
        gymMembership.renewMembership();
        assertThat(gymMembership.getCurrentFee()).isEqualTo(22);
        assertThat(gymMembership.getActive()).isEqualTo(true);
    }

}
