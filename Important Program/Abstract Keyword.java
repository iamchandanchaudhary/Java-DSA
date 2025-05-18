abstract class Programming {
    public abstract void Developer();
}

class HTML extends Programming {
    
    // Override
    public void Developer() {
        System.out.println("Tim Berners Lee");
    }
}

class Java extends Programming {

    // Override
    public void Developer() {
        System.out.println("James Gosling");
    }
}

class Main {
    public static void main(String[] args) {

        // Programming h = new HTML();
        HTML h = new HTML();
        h.Developer();

        // Programming j = new Java();
        Java j = new Java();
        j.Developer();
    }
}