/**
 * IsUnique returns if String has unique characters
 * Created by nagen on 1/18/17.
 */
public class IsUnique {
    public static void main(String[] args) {
        String input = "INPUT";
        String input2 = "AAAAA";

        System.out.println(isUniqueSimple(input));
        System.out.println(isUniqueSimple(input2));
    }

    private static boolean isUniqueSimple(String input) {
        if(input.length() > 128)
            return false;

        boolean[] character_value = new boolean[128];
        for (int i = 0; i < input.length(); i++) {
            int val = input.charAt(i);
            if(character_value[val]) {
                return false;
            }
            character_value[val] = true;
        }
        return true;
    }
}
