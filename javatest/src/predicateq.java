import java.util.function.Predicate;

public class predicateq {

    public static void main(String[] args) {

        String[] l1 = {"anu", "aki", "ajay"};
        
        Predicate<String> p = (s) -> s.charAt(0) == 'a';
        
        for (String l : l1) {
            if (p.test(l)) {
                System.out.println(l);
            }
        }
    }

}
