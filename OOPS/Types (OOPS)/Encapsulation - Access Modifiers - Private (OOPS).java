//package bank;

class Account {
    String bankName;
    public String name;
    protected String email;
    private String passward;

    // getters & setters
    public String getPassward() {
        return this.passward;
    }
    public void setPassward(String pass) {
        this.passward = pass;
    }
}

class Bank {
    public static void main(String args[]) {

        System.out.println("Access Modifiers :- \n");

        Account p1 = new Account();
        p1.bankName = "SBI";
        p1.name = "MyProgram";
        p1.email = "myprogram@gmail.com";
        //p1.passward = "BuckLet";

        p1.setPassward("BuckLet");

        System.out.println("Name : " + p1.name);
        System.out.println("Passward : " + p1.getPassward());
    }
    
}