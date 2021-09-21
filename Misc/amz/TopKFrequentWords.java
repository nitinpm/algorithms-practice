package Misc.amz;

/**
 * Given a non-empty list of words, return k most frequent elements.
 * Your answer should be sorted by frequency from highest to lowest.
 * If two words have same frequency, then the word with the lower alphabetical order comes first.
 *
 * Example 1:
 * Input: ["i", "love", "leetcode", "i", "love", "coding"], k = 2
 * Output: ["i", "love"]
 * Explanation: "i" and "love" are the two most frequent words.
 *     Note that "i" comes before "love" due to a lower alphabetical order.
 *
 * Example 2:
 * Input: ["the", "day", "is", "sunny", "the", "the", "the", "sunny", "is", "is"], k = 4
 * Output: ["the", "is", "sunny", "day"]
 * Explanation: "the", "is", "sunny" and "day" are the four most frequent words,
 *     with the number of occurrence being 4, 3, 2 and 1 respectively.
 *
 * Note:You may assume k is always valid, 1 ≤ k ≤ number of unique elements.
 * Input words contain only lowercase letters.
 * 
 * 
 * SOLUTION
 * public List topKFrequent(String[] words, int k) {
 *
 *     if (words == null || words.length == 0) {
 *         return Collections.emptyList();
 *     }
 *
 *     Map<String, Integer> wordMap = new HashMap<>();
 *
 *     for (String word : words) {
 *         int count =  wordMap.get(word) == null ? 0 : wordMap.get(word);
 *         wordMap.put(word, ++count);
 *     }
 *
 *     PriorityQueue<PElement> pq = new PriorityQueue<>(new PElementComparator());
 *
 *     for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
 *         PElement p = new PElement(entry.getKey(), entry.getValue());
 *         pq.add(p);
 *     }
 *
 *     List<String> result = new ArrayList<>(); 
 *     for (int i = 0; i < k; i++) {
 *         PElement element = pq.poll();
 *         result.add(element.word);
 *     }
 *
 *     return result;
 * }
 *
 * private static class PElement {
 *     String word;
 *     int count;
 *
 *     public PElement(String word, int count) {
 *         this.word = word;
 *         this.count = count;
 *     }
 *
 *     public String getWord() {
 *         return word;
 *     }
 *     public int getCount() {
 *         return count;
 *     }
 * }
 *
 * private static class PElementComparator implements Comparator<PElement> {
 *     public int compare(PElement p1, PElement p2) {
 *         if (p1 == p2) {
 *             return 0;
 *         }
 *         if (p1.getCount() > p2.getCount()) {
 *             return -1;
 *         }
 *         if (p2.getCount() > p1.getCount()) {
 *             return 1;
 *         }
 *         return p1.getWord().compareTo(p2.getWord()); 
 *     }
 * }
 */
public class TopKFrequentWords {

}
