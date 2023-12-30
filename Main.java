import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        Box box=new  Box(
            Arrays.asList(new Box(Collections.emptyList(),
            Arrays.asList(new Object(),new Object()))),
            Arrays.asList(new Box(Collections.emptyList(),
            Arrays.asList(new Object(),new Object()))
        );
    }
}