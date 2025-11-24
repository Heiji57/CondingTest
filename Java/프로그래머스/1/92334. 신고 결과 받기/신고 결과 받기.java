import java.util.*;
class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        HashSet<String> hashSet = new HashSet<>(Arrays.asList(report));
        HashMap<String, Integer> reportedCountMap = new HashMap<>();
        int[] result = new int[id_list.length];

        for (String set : hashSet) {
            set = set.split(" ")[1];
            reportedCountMap.put(set, reportedCountMap.getOrDefault(set, 0) + 1);
        }

        HashSet<String> suspendedSet = new HashSet<>();

        for (String reportedUser : reportedCountMap.keySet()) {
            int count = reportedCountMap.get(reportedUser);
            if (count >= k) {
                suspendedSet.add(reportedUser);
            }
        }

        HashMap<String, Integer> idIndexMap = new HashMap<>();

        for (int i = 0; i < id_list.length; i++) {
            idIndexMap.put(id_list[i], i);
        }

        for (String reportUser : hashSet) {
            String[] parts = reportUser.split(" ");
            String reporter = parts[0];
            String reportedUser = parts[1];

            if (suspendedSet.contains(reportedUser)) {
                result[idIndexMap.get(reporter)]++;
            }
        }
        return result;
    }
}