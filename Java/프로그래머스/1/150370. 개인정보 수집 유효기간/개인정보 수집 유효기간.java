import java.util.*;
import java.time.LocalDate;
class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {
        ArrayList<Integer> res = new ArrayList<>();

        today = today.replaceAll("\\.", "-");
        LocalDate todayDate = LocalDate.parse(today);

        for (String term : terms) {
            int i = 0;
            for (String privacy : privacies) {
                if (term.split(" ")[0].contains(privacy.split(" ")[1])) {
                    privacy = privacy.replaceAll("\\.", "-");
                    LocalDate date = LocalDate.parse(privacy.split(" ")[0]);
                    date = date.plusMonths(Long.parseLong(term.split(" ")[1]));
                    if (date.isBefore(todayDate) || date.isEqual(todayDate)) {
                        res.add(i+1);
                    }
                }
                i++;
            }
        }
        res.sort(Comparator.comparing(Integer::intValue));
        int[] result = res.stream().mapToInt(i -> i).toArray();
        return result;
    }
}