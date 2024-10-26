class Bank {
    //System.out.println("Bank Account Information ");
}
class Account {
    public String bank;
    String name;
    protected String email;
    private String passward;

    // public void accountInfo() {
    //     System.out.println("Account Info : \n");
    // }

    // Using getters & setters to Access Private Data

    public String getPassward() {
        return this.passward;
    }

    public void setPassward(String pass) {
        this.passward = pass;
    }

}
class OOPS {
    public static void main(String args[]) {
        
        Account a1 = new Account();

        a1.setPassward("XinG");
        
        System.out.println("Passward : " + a1.getPassward());
    }
}