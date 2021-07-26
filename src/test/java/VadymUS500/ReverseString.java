package VadymUS500;

public class ReverseString {
    public static void main(String[] args) {
        // shortest way to reverse string.
        // String class does not have reverse() method
        // we need to convert the input string to StringBuffer
        String str = "ydobyrevE pu s'tahW";

        StringBuffer sbr = new StringBuffer(str);
        sbr.reverse();
        System.out.println(sbr);
    }
}
