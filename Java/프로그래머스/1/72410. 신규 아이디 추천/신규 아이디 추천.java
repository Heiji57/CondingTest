class Solution {
    public String solution(String new_id) {
        String result = new_id;
        result = result.toLowerCase();
        result = result.replaceAll("[^a-z0-9-_.]", "");
        result = result.replaceAll("\\.+", ".");
        result = result.replaceAll("^\\.|\\.$", "");
        result = result.isEmpty() ? result = "a" : result;
        result = result.length() > 15 ? result.substring(0, 15) : result;
        result = result.replaceAll("\\.$", "");
        while(result.length()<3){
            result += result.charAt(result.length()-1);
        }
        return result;
    }
}