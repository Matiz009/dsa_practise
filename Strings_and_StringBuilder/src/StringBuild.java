import java.util.Arrays;

public class StringBuild{
    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();// it will modify the object
        for (int i = 0; i < 26; i++) {
            char ch = (char)('a'+i);
            builder.append(ch);
        }
        System.out.println(builder.toString());
        builder.deleteCharAt(2);
        System.out.println(builder);
        String name = "Mati ul Rehman";
        System.out.println(Arrays.toString(name.toCharArray()));
        System.out.println(name.toLowerCase());
    }
}
