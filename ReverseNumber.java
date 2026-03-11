public class ReverseNumber {
    public static void main(String[] args) {
        if (args.length < 1) {
            System.out.println("Please provide a number as an argument.");
            return;
        }

        int number = Integer.parseInt(args[0]);
        int reversed = 0;
        while (number != 0) {
            reversed = reversed * 10 + number % 10;
            number /= 10;
        }
        System.out.println("Reversed number: " + reversed);
    }
}
