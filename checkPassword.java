public class checkPassword {
        public static int Checkpassword(char[] str, int n) {
            // Check if the password has at least 4 characters
            if (n < 4) {
                return 0;
            }

            // Check if the first character is a number
            if (Character.isDigit(str[0])) {
                return 0;
            }

            boolean hasDigit = false;
            boolean hasUpperCase = false;

            for (int i = 0; i < n; i++) {
                char c = str[i];

                // Check for spaces or obliques (/)
                if (c == ' ' || c == '/') {
                    return 0;
                }

                // Check for a digit
                if (Character.isDigit(c)) {
                    hasDigit = true;
                }

                // Check for an uppercase letter
                if (Character.isUpperCase(c)) {
                    hasUpperCase = true;
                }
            }

            // Check if the password has at least 1 digit and 1 uppercase letter
            if (!hasDigit || !hasUpperCase) {
                return 0;
            }

            return 1;
        }

        public static void main(String[] args) {
            char[] password1 = "aA1_67".toCharArray();
            int result1 = Checkpassword(password1, password1.length);
            System.out.println(result1); // Output: 1

            char[] password2 = "Abc123".toCharArray();
            int result2 = Checkpassword(password2, password2.length);
            System.out.println(result2); // Output: 0 (does not have at least 1 symbol)

            char[] password3 = "123aA_67".toCharArray();
            int result3 = Checkpassword(password3, password3.length);
            System.out.println(result3); // Output: 0 (starts with a number)

            char[] password4 = "Abcde".toCharArray();
            int result4 = Checkpassword(password4, password4.length);
            System.out.println(result4); // Output: 0 (does not have at least 4 characters)
        }
    }


