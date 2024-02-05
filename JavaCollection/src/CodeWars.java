public class CodeWars {

    public static void main(String[] args) {
        System.out.println(CodeWars.maskify("AAAAAAAAA"));
    }
    public static String maskify(String str) {
        StringBuilder builder = new StringBuilder();
        for(int i = 0; i < str.length(); i++) {
            if(i < str.length() - 4) {
                builder.append("#");
            } else {
                builder.append(str.charAt(i));
            }
        }
        return builder.toString();
    }
}
