public class Homework2 {
    public static void main(String[] args) {
        // Write a program to find an occurrence in a string (containing all
        // the characters of another string).
        StringBuilder strb1 = new StringBuilder("AABCCAAADCBBAADBBC");
        StringBuilder strb2 = new StringBuilder("BB");
        int occurrence = strb1.indexOf(strb2.toString());
        if (occurrence != -1) {
            System.out.println("String2: " +
                    strb2.toString() +
                    " an occurrence in a string1: " +
                    strb1.toString() +
                    " in the index position: " +
                    occurrence);
        } else {
            System.out.println("String2: " +
                    strb2.toString() +
                    "does not appear in a string1 " +
                    strb1.toString());
        }

        // Write a program to check if two given strings are rotations of each
        // other (reverse occurrence).
        StringBuilder strb3 = new StringBuilder("CBBDAABBCDAAACCBAA");
        System.out.println("Is two given strings are rotations of each other: " +
                strb3.reverse().toString().equals(strb1.toString()));

        // 3*Write a program to flip a line using recursion.
        String revString = recStringReverse(strb1.toString());
        System.out.println("Original string: " + strb1.toString());
        System.out.println("Recursive reverse: " + revString);

        // If you give two numbers such as 3 and 56 you must make the following
        // strings:3 + 56 = 59 3 – 56 = -53 3 * 56 = 168
        // Use method StringBuilder.append().

        int first = 3;
        int second = 56;
        char[] operators = new char[] { '+', '-', '*' };

        printResults(first, second, operators);
    }

    public static int calc(int a, int b, char op) {
        int result = 0;

        if (op == '+') {
            result = a + b;
        } else if (op == '-') {
            result = a - b;

        } else {
            result = a * b;
        }

        return result;
    }

    public static void printResults(int first, int second, char[] operators) {
        for (int i = 0; i < operators.length; i++) {
            StringBuilder builder = new StringBuilder();
            int result = calc(first, second, operators[i]);

            builder.append(first).append(" ").append(operators[i]).append(" ");

            builder.append(second).append(" = ").append(result);

            System.out.println(builder);

            // Replace '=' with 'equals'. Use methods StringBuilder.insert()
            // StringBuilder.deleteCharAt().
            int pos = builder.indexOf("="); // 7
            builder.deleteCharAt(pos).insert(pos, "равно");

            System.out.println(builder);
        }
    }

    public static String recStringReverse(String s) {
        if (s.length() <= 1) {
            return s;
        }
        return recStringReverse(s.substring(1)) + s.charAt(0);
    }

}
