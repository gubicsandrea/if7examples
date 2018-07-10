package stringtransform;

import java.util.ArrayList;
import java.util.List;

public class Accumul {

    public static String accum(String str) {
        //Szedjük betűkre
        String[] chars = str.toLowerCase().split("");

        //eredmény szavainak listáját előállítjuk
        List<String> words = listWords(chars);

        //fűzzük össze "-"-lel
        return osszefuz(words);
    }

    private static List<String> listWords(String[] chars) {
        List<String> words = new ArrayList<>();
        for(int i = 0; i < chars.length; i++) {
            words.add(makeWord(chars[i], i));
        }
        return words;
    }

    private static String osszefuz(List<String> words) {
        StringBuilder sb = new StringBuilder();
        for(String s: words) {
            sb.append(s).append("-");
        }
        return sb.substring(0, sb.length() - 1);
    }

    private static String makeWord(String oneChar, int count) {
        StringBuilder sb = new StringBuilder(oneChar.toUpperCase());
        for(int i = 0; i < count; i++) {
            sb.append(oneChar);
        }
        return sb.toString();
    }
}
