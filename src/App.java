import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {
    public static void main(String[] args) {
        final String string = "https://sitenoticas.com.br/negocios/investimentos/2022/04/01/fim-de-semana-com-muita-chuva.html";
        
        String regex = "^(https://sitenoticas.com.br/)([a-zA-Z]+/){1}([a-zA-Z]+/){1}(([0-9]{4}/[0-9]{2}/[0-9]{2}/)([a-zA-Z0-9-_]+)\\.html)$";
        final Pattern pattern = Pattern.compile(regex, Pattern.MULTILINE);
        final Matcher matcher = pattern.matcher(string);
        
        while (matcher.find()) {
            System.out.println("Full match: " + matcher.group(0));
            
            for (int i = 1; i <= matcher.groupCount(); i++) {
                System.out.println("Group " + i + ": " + matcher.group(i));
            }
        }
    }
}
