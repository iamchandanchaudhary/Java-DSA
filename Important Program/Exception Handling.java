class Handling {
    public static void main(String[ ] args) {
    
    System.out.println("Exception Handling:- \n");

      try {
        int[] myNumbers = {1, 2, 3};
        System.out.println(myNumbers[10]);
      } 
      catch (Exception e) {
        System.out.println("Something went wrong.");
      }
    }
  }