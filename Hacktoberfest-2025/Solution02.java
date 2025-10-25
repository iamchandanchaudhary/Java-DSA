class IntegerToRoman {
    public static String intToRoman(int num) {
        
        int[] values =    {1000, 900, 500, 400, 100, 90,  50, 40,  10, 9,   5, 4,  1};
        String[] symbols ={"M",  "CM", "D", "CD","C","XC","L","XL","X","IX","V","IV","I"};

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                roman.append(symbols[i]);
            }
        }
        return roman.toString();
    }

    public static void main(String[] args) {
        java.util.Scanner sc = new java.util.Scanner(System.in);
        System.out.print("Enter an integer: ");
        int number = sc.nextInt();

        if (number < 1 || number > 3999) {
            System.out.println("Please enter a number between 1 and 3999.");
        } else {
            String result = intToRoman(number);
            System.out.println("Roman numeral: " + result);
        }
    }
}
