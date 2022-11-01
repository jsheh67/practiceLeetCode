public class GoalParser {
    public static String interpret(String command) {
        StringBuilder builder=new StringBuilder();
        for(int i=0; i<command.length(); i++) {
            if (command.charAt(i) == 'G') {
                builder.append('G');
                continue;
            }
            String substring = command.substring(i, i + 2);
            switch (substring) {
                case "()":
                    builder.append("o");
                    i++;
                    break;
                case "(a":
                    builder.append("al");
                    i += 3;
                    break;
            }
        }
        return builder.toString();
//
    }

    public static void main(String[] args) {
        System.out.print(interpret("G()(al)"));
        System.out.print(interpret("(al)G(al)()()G"));
    }

}
