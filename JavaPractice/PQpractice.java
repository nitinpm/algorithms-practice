package JavaPractice;
import java.util.*;

public class PQpractice {
    public static void main(String[] args) {
        Queue<String> q = new PriorityQueue<>((a,b) -> a.compareTo(b));

        q.add("A");
        q.add("B");
        q.add("G");
        q.add("C");
        q.add("Z");
        q.add("D");
        System.out.println(q);

//        System.out.println(q.poll());
//        System.out.println(q.poll());
//        System.out.println(q.poll());
//        System.out.println(q.poll());
//        System.out.println(q.poll());
//        System.out.println(q.poll());

        Map<String, Integer> stringCountMap = new HashMap<>();
        String test = "aaa ccc ccc aaa bbb ddd aaa bbb bbb ccc aaa bbb";
        for(String item: test.split(" ")){
            stringCountMap.put(item, stringCountMap.getOrDefault(item, 0)  + 1);
        }

        System.out.println(stringCountMap);

        /*Queue<String> mapToQueue = new PriorityQueue<>((a,b) -> stringCountMap.get(a) == stringCountMap.get(b) ? b.compareTo(a) : stringCountMap.get(b) - stringCountMap.get(a));
        System.out.println(stringCountMap.keySet());
        mapToQueue.addAll(stringCountMap.keySet());
        System.out.println(mapToQueue.poll());
        System.out.println(mapToQueue.poll());
        System.out.println(mapToQueue.poll());
        System.out.println(mapToQueue.poll());*/

        Queue<String> mapToQueueOld = new PriorityQueue<>(new QueueComparator());
        mapToQueueOld.addAll(stringCountMap.keySet());
        System.out.println(mapToQueueOld);
    }

    public static class QueueComparator implements Comparator<String>{
//        public int compare(String s1, String s2){
//            return s2.compareTo(s1);
//        }

        public int compare(String s1, String s2){
            return s2.compareTo(s1);
        }
    }
}
