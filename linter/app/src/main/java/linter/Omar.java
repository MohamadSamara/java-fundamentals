package linter;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Omar {
    public static void main(String[] args) {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

//        Set<Integer> x =  allData(weeklyMonthTemperatures);
//        printAllInfo(weeklyMonthTemperatures);


        ArrayList<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        analyzeData(weeklyMonthTemperatures);
        tally(votes);
    }

    public static void analyzeData(int[][] arr) {
        Set<Integer> data = new HashSet<>();
        for (int[] e : arr) {
            for (int l : e) {
                data.add(l);
            }
        }
        int max = Collections.max(data);
        int min = Collections.min(data);
        int[] taken = new int[4];
        System.out.println("High: " + max);
        System.out.println("Low: " + min);
        for (int i = 0; i < 4; i++) {
            taken[i] = numberNotUsed(data, taken, min, max);
            System.out.println("Never saw temperature: " + taken[i]);
        }
    }

    public static int numberNotUsed(Set<Integer> set1, int[] arr, int min, int max) {
        Random rand = new Random();
        TreeSet<Integer> data = new TreeSet<>();
        data.addAll(set1);
        int int_random;
        int rando = 0;
        do {
            int_random = rand.nextInt(max - min + 1) + min;
        } while ((data.contains(int_random)) || Arrays.asList(arr).contains(int_random));
        return rando;
    }

    public static String tally(ArrayList<String> list) {
        HashMap<String, Integer> votes = new HashMap<>();
        for (String e : list) {
            votes.put(e, votes.getOrDefault(e, 0) + 1);
        }
        return maxValue(votes);
    }

    public static String maxValue(HashMap<String, Integer> map) {
        String maxKey = "";
        int maxValue = 0;
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxValue) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey;
    }

    public static void javaScriptLinter(String path) throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            int counter = 0;
            Pattern pattern1 = Pattern.compile("\\bif\\b", Pattern.CASE_INSENSITIVE);
            Pattern pattern2 = Pattern.compile("\\belse\\b", Pattern.CASE_INSENSITIVE);
            Pattern pattern3 = Pattern.compile("\\}", Pattern.CASE_INSENSITIVE);
            Pattern pattern4 = Pattern.compile("\\{", Pattern.CASE_INSENSITIVE);
            Pattern pattern5 = Pattern.compile(";$");

            while ((line = reader.readLine()) != null) {
                counter += 1;
                Matcher matcher1 = pattern1.matcher(line);
                Matcher matcher2 = pattern2.matcher(line);
                Matcher matcher3 = pattern3.matcher(line);
                Matcher matcher4 = pattern4.matcher(line);
                if (!(matcher1.find() || matcher2.find() || matcher3.find() || matcher4.find())) {
                    Matcher matcher5 = pattern5.matcher(line);
                    if (!(matcher5.find())) {
                        System.out.println("Line " + counter + ": Missing semicolon.");
                    }
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}