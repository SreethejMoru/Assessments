class HelloWorld {
    public static void main(String[] args) {
        toUppercase("SreeThej");
    }
     public static void toUppercase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch) && Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch;
            }
        }
        System.out.println(result);
    }
}