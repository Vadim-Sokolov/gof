package sandbox;

import java.util.Map;

public class Runner {

    private static final Map<Character, Integer> LETTER_IS_KEY_MAP = Map.of(
            'a', 1, 'b', 2, 'c', 3, 'd', 4,	'e', 5,	'f', 6,	'g', 7,	'h', 8);

    public static void main(String[] args) {

        System.out.println(LETTER_IS_KEY_MAP.get('a'));

    }


}
