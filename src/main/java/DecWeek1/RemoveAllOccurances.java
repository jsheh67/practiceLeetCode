package DecWeek1;
//1910
public class RemoveAllOccurances {
    public static String removeOccurrences(String s, String part) {
        if (s.contains(part)) {
            String s1 = s.replaceFirst(part, "");
            return removeOccurrences(s1, part);
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(removeOccurrences("daabcbaabcbc", "abc"));
    }

}
