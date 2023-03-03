import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        String text = "Завтрак в 23:00";
        Pattern pattern = Pattern.compile("([01][0-9]|2[0-3]):[0-5][0-9]");
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()){
            System.out.println(text.substring(matcher.start(), matcher.end()));
        }
    }
}


