//class Bank {

class Account {
    private String passward;

    // getters & setters
    public String getPassward() {
        return this.passward;
    }
    public void setPassward(String pass) {
        this.passward = pass;
    }

}
//}
class OPPS {
    public static void main(String args[]) {

        System.out.println("Account Information :- \n");

        Account acc1 = new Account();
        //acc1.passward = "Compiler";

        //System.out.println("Passward : " + acc1.passward);
        acc1.setPassward("Compiler");

        System.out.println(acc1.getPassward());
    }
}