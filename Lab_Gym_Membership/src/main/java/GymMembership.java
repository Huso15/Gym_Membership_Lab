public class GymMembership {

    private String firstName;
    private String lastName;
    private String renewalDate;
    private boolean active;
    private double currentFee;

    public GymMembership(String firstName, String lastName, String renewalDate, boolean active, double currentFee) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.renewalDate = renewalDate;
        this.active = active;
        this.currentFee = currentFee;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRenewalDate() {
        return renewalDate;
    }

    public void setRenewalDate(String renewalDate) {
        this.renewalDate = renewalDate;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public double getCurrentFee() {
        return currentFee;
    }

    public void setCurrentFee(double currentFee) {
        this.currentFee = currentFee;
    }

    public double calculateRenewalFee(){
        this.currentFee = this.currentFee*1.1;
        return this.currentFee;
    }

    public void renewMembership(){
        this.calculateRenewalFee();
        this.active = true;


    }

//    public static void main(String[] args) {
//        GymMembership gymMembership = new GymMembership("Huso", "Isik", "03/02/2024", true, 20);
//        System.out.println(gymMembership.renewMembership());
//    }


}
