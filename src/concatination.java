public class concatenation {
    public static String conCat(String st1, String st2)
    {
        if (st1.length() != 0 && st2.length() != 0
                && st1.charAt(st1.length() - 1) == st2.charAt(0))
            return st1 + st2.substring(1);
        return st1 + st2;
    }

    public static void main (String[] args)
    {
        String str1="mark";
        String str2="kate";

        System.out.println("The given strings are: "+str1+"  and  "+str2);
        System.out.println("The string after concatenation are: "+conCat(str1,str2));
    }
}
© 2021 GitHub, Inc.