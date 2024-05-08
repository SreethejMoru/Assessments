class HelloWorld {
    public static void main(String[] args)
    {
        System.out.println("tc1singlechar:" + tc1singlechar());
//        System.out.println(tc2negative());
        System.out.println("tc3charwithnum:" + tc3charwithnum());
        System.out.println("tc4emptystring:" +  tc4emptystring());
        System.out.println("tc5withonelowercase:" + tc5withonelowercase());
        System.out.println("tc6withoneuppercase:" + tc6withoneuppercase());
        System.out.println("tc7specialchar:" +  tc7specialchar());
        System.out.println("tc8spaces:" + tc8spaces());
        System.out.println("tc9spaces:" + tc9spaces());
        System.out.println("tc10unicodechar:" + tc10unicodechar());
        System.out.println("tc11numberip:" + tc11numberip());
        System.out.println("tc12spaceswithpattern:" + tc12spaceswithpattern());
        System.out.println("tc13numberwithcases:" + tc13numberwithcases());
        toUppercase("SreeThej");
        
    }

    public static String toUppercase(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isLetter(ch) && Character.isLowerCase(ch)) {
                result += Character.toUpperCase(ch);
            } else {
                result += ch;
            }
        }
        return result;
    }

    public static boolean tc1singlechar()
    {
        String expected = "A";
        String input = "a";
        String result = HelloWorld.toUppercase(input);
        if (result.equals(expected))
        {
            return true;
        } else
        {
            return false;
        }

    }
    public static boolean tc2negative() {
        String expected = null;
        String input = null;
        String result = toUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }

    }
    //Method3 for character with numbers.
    public static boolean tc3charwithnum() {
        String expected = "SREETHEJ@89";
        String input = "Sreethej@89";
        String result = toUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }
    //Method 4 for empty input
    public static boolean tc4emptystring() {
        String expected = "";
        String input = "";
        String result = toUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }
    //Method 5 for character with one lowercase
    public static boolean tc5withonelowercase(){
        String expected = "SREETHEJ@89";
        String input = "SrEETHEJ@89";
        String result = toUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }
    //Method 6 for character with one uppercase
    public static boolean tc6withoneuppercase(){
        String expected = "SREETHEJ@89";
        String input = "sreeThej@89";
        String result = toUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }
    //Method 7 for character with special charcters
    public static boolean tc7specialchar(){
        String expected = "@!";
        String input = "@!";
        String result = toUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }

    //Method 8 for character with spaces in between
    public static boolean tc8spaces(){
        String expected = "S R E E T H E J @ 8 9";
        String input = "S r e e t h e j @ 8 9";
        String result = toUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }
    //Method 9 for character with spaces at start and end
    public static boolean tc9spaces(){
        String expected = "  SREETHEJ@89  ";
        String input = "  sreethej@89  ";
        String result = toUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }
    //Method 10 for character with unicode charcters
    public static boolean tc10unicodechar(){
        String expected = "��";
        String input = "��";
        String result = toUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }
    //Method 11 for  with numbers as input
    public static boolean tc11numberip(){
        String expected = "123";
        String input = "123";
        String result = toUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }
    //Method 12 for character with spaces in between and pattern
    public static boolean tc12spaceswithpattern(){
        String expected = "  SAI@2002  ";
        String input = "  Sai@2002  ";
        String result = toUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }

    }
    //Method 13 for character with numbers and cases
    public static boolean tc13numberwithcases(){
        String expected = "SRE2002ETHEJ";
        String input = "sRE2002eTHEJ";
        String result = toUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }
    //Method 14 for character with numbers,cases and special charcters
    public static boolean tc14charnumspecial(){
        String expected = "SREETHEJ@/)^#$89";
        String input = "SREETHEJ@/)^#$89";
        String result = toUppercase(input);
        if (result.equals(expected)) {
            return true;
        } else {
            return false;
        }
    }

}

