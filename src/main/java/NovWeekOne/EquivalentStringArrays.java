package NovWeekOne;

public class EquivalentStringArrays {
    public boolean arrayStringsAreEqual(String[] word1, String[] word2) {
        StringBuilder builder = new StringBuilder();
        for (String s : word1) {
            builder.append(s);
        }
        for (String s : word2) {
            builder.append(s);
        }
        int l = builder.length();

        if (l % 2 != 0) return false;

        return (builder.substring(0, l / 2).equals(builder.substring(l / 2)));
    }

    //one line return (String.join("",word1).equals(String.join("",word2)));
}
