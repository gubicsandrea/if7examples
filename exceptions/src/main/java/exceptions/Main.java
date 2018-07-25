package exceptions;

import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.logging.Logger;

public class Main {


    public String readfile(List<String> words, String part) throws MissingElementException{
        for(String str: words) {
            if(str.contains(part)) {
                return str;
            }
        }
        throw new MissingElementException("Nincs ilyen elem.");
    }

    public void cs() {
        try {
            String result = readfile(Arrays.asList("alma", "körte", "barack"), "r");
        }catch (MissingElementException e) {
            throw new IllegalStateException("Nincs eredmény.", e);
        }
    }
}
