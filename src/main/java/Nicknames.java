import java.util.HashMap;

/**
 * mooc practice with hashmaps.
 */
public class Nicknames {
    public static void main(String[] args) {
        HashMap<String, String> nicknames = new HashMap<>();
        nicknames.put("mathew", "matt");
        nicknames.put("michael", "mix");
        nicknames.put("arthur", "artie");

        System.out.println( nicknames.get("mathew"));

    }
}
