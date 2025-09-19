class MathsFunction {
    public static void main(String args[]) {
        System.out.println("Maths Methods:- \n");

        // Give Maximum Value
        int maxValue = Math.max(14, 12);
        System.out.println("Maximum Value: " + maxValue);

        int a = 15;
        int b = 21;

        // Give Minimum Value
        int minValue = Math.min(a, b);
        System.out.println("\nMinimum Value: " + minValue);

        // Give Power
        double power = Math.pow(12, 3);
        System.out.println("\n3 to the Power of 12: " + power);

        // Give Square Root
        double squareRoot = Math.sqrt(b);
        System.out.println("\nSquare Root of b: " + squareRoot);

        // Give Positive Value
        double positive = Math.abs(-12.2);
        System.out.println("\nPositive Value: " + positive);

        // System.out.println(Math.abs(-4.7)); // 4.7
        // System.out.println(Math.abs(4.7)); // 4.7
        // System.out.println(Math.abs(3)); // 3

        // Give Random Value
        double randomValue = Math.random();
        System.out.println("\nRandom Value (Double form): " + randomValue);
        System.out.println("Random Value (Integer form): " + (int)(randomValue * 100));
        
    }
}