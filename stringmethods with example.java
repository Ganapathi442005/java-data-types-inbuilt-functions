public class StringMethodsExample {
    public static void main(String[] args) {
        // 1. substring(int beginIndex)
        String str = "Hello, World!";
        System.out.println("substring(7): " + str.substring(7)); // Output: "World!"

        // 2. substring(int beginIndex, int endIndex)
        System.out.println("substring(7, 12): " + str.substring(7, 12)); // Output: "World"

        // 3. isEmpty()
        String emptyStr = "";
        System.out.println("isEmpty(): " + emptyStr.isEmpty()); // Output: true
        System.out.println("isEmpty(): " + str.isEmpty()); // Output: false

        // 4. concat(String str)
        String concatStr = str.concat(" Welcome!");
        System.out.println("concat(): " + concatStr); // Output: "Hello, World! Welcome!"

        // 5. replace(char old, char new)
        System.out.println("replace('o', 'a'): " + str.replace('o', 'a')); // Output: "Hella, Warld!"

        // 6. replace(CharSequence old, CharSequence new)
        System.out.println("replace(\"World\", \"Java\"): " + str.replace("World", "Java")); // Output: "Hello, Java!"

        // 7. split(String regex)
        String csv = "apple,banana,grape";
        String[] fruits = csv.split(",");
        System.out.println("split(\",\"): ");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // 8. split(String regex, int limit)
        String[] limitedFruits = csv.split(",", 2);
        System.out.println("split(\",\", 2): ");
        for (String fruit : limitedFruits) {
            System.out.println(fruit);
        }

        // 9. indexOf(int ch)
        System.out.println("indexOf('o'): " + str.indexOf('o')); // Output: 4

        // 10. indexOf(int ch, int fromIndex)
        System.out.println("indexOf('o', 5): " + str.indexOf('o', 5)); // Output: 8

        // 11. indexOf(String substring)
        System.out.println("indexOf(\"World\"): " + str.indexOf("World")); // Output: 7

        // 12. indexOf(String substring, int fromIndex)
        System.out.println("indexOf(\"o\", 5): " + str.indexOf("o", 5)); // Output: 8

        // 13. trim()
        String spacedStr = "   Hello, Java!   ";
        System.out.println("trim(): " + "\"" + spacedStr.trim() + "\""); // Output: "Hello, Java!"

        // 14. static String valueOf(int value)
        int number = 123;
        String numberStr = String.valueOf(number);
        System.out.println("valueOf(123): " + numberStr); // Output: "123"

        // Using valueOf for other types
        char ch = 'A';
        double pi = 3.14159;
        System.out.println("valueOf('A'): " + String.valueOf(ch)); // Output: "A"
        System.out.println("valueOf(3.14159): " + String.valueOf(pi)); // Output: "3.14159"
    }
}
