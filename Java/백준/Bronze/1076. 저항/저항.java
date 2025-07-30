import java.awt.*;
import java.time.LocalDateTime;
import java.util.*;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Map<String, Integer> colorMap = new HashMap<>();
        colorMap.put("black", 0);
        colorMap.put("brown", 1);
        colorMap.put("red", 2);
        colorMap.put("orange", 3);
        colorMap.put("yellow", 4);
        colorMap.put("green", 5);
        colorMap.put("blue", 6);
        colorMap.put("violet", 7);
        colorMap.put("grey", 8);
        colorMap.put("white", 9);

        String firstColor = in.nextLine();
        String secondColor = in.nextLine();
        String thirdColor = in.nextLine();

        int firstDigit = colorMap.get(firstColor);
        int secondDigit = colorMap.get(secondColor);
        int thirdDigit = colorMap.get(thirdColor);

        long result = (firstDigit * 10L + secondDigit) * (long)Math.pow(10, thirdDigit);

        System.out.println(result);
    }
}