package Leetcode.amzTop50;

import java.util.*;

public class AnalyzeUserWebsitePattern {
    public static List<String> mostVisitedPattern(String[] username, int[] timestamp, String[] website) {
        Map<String, ArrayList<String>> userWebMap = new HashMap<>();

        for(int i = 0; i < username.length; i++){
            String user = username[i];
            String web = website[i];

            if(userWebMap.get(user) == null){
                userWebMap.put(user, new ArrayList<>(Arrays.asList(web)));
            } else{
                userWebMap.get(user).add(web);
            }
        }

        System.out.println(userWebMap);

        Map<List<String>, Integer> patternCountMap = new HashMap<>();

        for(ArrayList<String> item: userWebMap.values()){
            if(item.size() >= 3){
                for(int i = 0; i < item.size() - 2; i++){
                    ArrayList<String> pattern = new ArrayList<>(Arrays.asList(item.get(i), item.get(i+1), item.get(i+2)));
                    patternCountMap.put(pattern, patternCountMap.getOrDefault(pattern, 0) + 1);
                }
            }
        }

        System.out.println(patternCountMap);

        int maxCount = 0;
        List<String> result = null;
        for(Map.Entry<List<String>, Integer> entry: patternCountMap.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                result = entry.getKey();
            } else if(entry.getValue() == maxCount && result != null){
                result = result.toString().compareTo(entry.getValue().toString()) < 0 ? result : entry.getKey();
            }
        }

        return result;
    }

    public static void main(String[] args) {
        String[] users = {"zkiikgv","zkiikgv","zkiikgv","zkiikgv"};//{"joe","joe","joe","james","james","james","james","mary","mary","mary"};
        int[] timestamp = {436363475,710406388,386655081,797150921};//{1,2,3,4,5,6,7,8,9,10};
        String[] websites = {"wnaaxbfhxp","mryxsjc","oz","wlarkzzqht"};//{"home","about","career","home","cart","maps","home","home","about","career"};
        System.out.println(mostVisitedPattern2(users, timestamp, websites));
    }

    public static List<String> mostVisitedPattern2(String[] username, int[] timestamp, String[] website) {

        Map<String, ArrayList<String>> userWebMap = new HashMap<>();
        UserData[] userDataList = new UserData[username.length];

        for(int i = 0; i < username.length; i++){
            userDataList[i] = new UserData(username[i], timestamp[i], website[i]);
        }

        Arrays.sort(userDataList, Comparator.comparing(UserData::getTimestamp));

        System.out.println(Arrays.toString(userDataList));

        for(int i = 0; i < userDataList.length; i++){
            String user = userDataList[i].getUsername();
            String web = userDataList[i].getWebsite();

            if(userWebMap.get(user) == null){
                userWebMap.put(user, new ArrayList<>(Arrays.asList(web)));
            } else{
                userWebMap.get(user).add(web);
            }
        }

        System.out.println(userWebMap);

        Map<List<String>, Integer> patternCountMap = new HashMap<>();

        for(ArrayList<String> item: userWebMap.values()){
            if(item.size() >= 3){
                for(int i = 0; i < item.size() - 2; i++){
                    ArrayList<String> pattern = new ArrayList<>(Arrays.asList(item.get(i), item.get(i+1), item.get(i+2)));
                    patternCountMap.put(pattern, patternCountMap.getOrDefault(pattern, 0) + 1);
                }
            }
        }

        System.out.println(patternCountMap);

        int maxCount = 0;
        List<String> result = null;
        for(Map.Entry<List<String>, Integer> entry: patternCountMap.entrySet()){
            if(entry.getValue() > maxCount){
                maxCount = entry.getValue();
                result = entry.getKey();
            } else if(entry.getValue() == maxCount && result != null){
                result = result.toString().compareTo(entry.getValue().toString()) < 0 ? result : entry.getKey();
            }
        }
        Collections.sort(result);
        return result;    }

    private static class UserData {
        private String username;
        private int timestamp;

        public String getUsername() {
            return username;
        }

        public void setUsername(String username) {
            this.username = username;
        }

        public int getTimestamp() {
            return timestamp;
        }

        public void setTimestamp(int timestamp) {
            this.timestamp = timestamp;
        }

        public String getWebsite() {
            return website;
        }

        public void setWebsite(String website) {
            this.website = website;
        }

        private String website;

        public UserData(String username, int timestamp, String website){
            this.username = username;
            this.timestamp = timestamp;
            this.website = website;
        }

        @Override
        public String toString() {
            return "UserData{" +
                    "username='" + username + '\'' +
                    ", timestamp=" + timestamp +
                    ", website='" + website + '\'' +
                    '}';
        }
    }
}
