

class Stringmethod
{
    public static void main(String[] args)
    {
        String s1 = "darshan univercity";
        String s2 = "Darshan University";

        // 1. length()
        System.out.println("Length = " + s1.length());

        // 2. charAt()
        System.out.println("Character at 0 = " + s1.charAt(0));

        // 3. toUpperCase()
        System.out.println("Uppercase = " + s1.toUpperCase());

        // 4. toLowerCase()
        System.out.println("Lowercase = " + s1.toLowerCase());

        // 5. equals()
        System.out.println("Equals = " + s1.equals(s2));

        // 6. equalsIgnoreCase()
        System.out.println("Equals Ignore Case = "
                        + s1.equalsIgnoreCase(s2));

        // 7. concat()
        System.out.println("Concat = " + s1.concat(" Student"));

        // 8. contains()
        System.out.println("Contains 'darshan' = "
                        + s1.contains("darshan"));

        // 9. startsWith()
        System.out.println("Starts With 'darshan' = "
                        + s1.startsWith("darshan"));

        // 10. endsWith()
        System.out.println("Ends With 'city' = "
                        + s1.endsWith("city"));

        // 11. indexOf()
        System.out.println("Index of 'a' = "
                        + s1.indexOf('a'));

        // 12. lastIndexOf()
        System.out.println("Last Index of 'a' = "
                        + s1.lastIndexOf('a'));

        // 13. substring()
        System.out.println("Substring = "
                        + s1.substring(0, 7));

        // 14. replace()
        System.out.println("Replace = "
                        + s1.replace('a', 'o'));

        // 15. trim()
        String s3 = "   darshan univercity   ";
        System.out.println("Trim = [" + s3.trim() + "]");

        // 16. isEmpty()
        System.out.println("Is Empty = " + s1.isEmpty());

        // 17. isBlank()
        System.out.println("Is Blank = " + s1.isBlank());
    }
}
