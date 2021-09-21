package Misc.amz;

import java.util.List;

/**
 * https://leetcode.com/discuss/interview-question/846585/Amazon-Online-Assessment-Question-1
 *
 * Input
 * The input to the function/method consists of five arguments - numCompetitors, an integer representing the number of competitors for the Echo device;
 * topNCompetitors, is an integer representing the maximum number of competitors that Amazon wants to identify;
 * competitors, a list of strings representing the competitors;
 * numReviews, an integer representing the number of reviews from different websites that are identified by the automated webcrawler;
 * reviews, a list of string where each element is a string that consists of space-separated words representing user reviews.
 *
 * Output
 * Return a list of strings representing Amazon's top N competitors in order of most frequently mentioned to least frequent.
 *
 * Note
 * The comparison of strings is case-insensitive. If the value of topNCompetitors is more than the number of competitors discussed in the reviews then output the names of only the competitors mention.
 * If competitors have the same count (e.g. newshop=2, shopnow=2, mymarket=4), sort alphabetically. topNCompetitors=2, Output=[mymarket, newshop]
 *
 * Example
 * Input:
 * numCompetitors=6
 * topNCompetitors = 2
 * competitors = [newshop, shopnow, afashion, fashionbeats, mymarket, tcellular]
 * numReviews = 6
 * reviews = [
 * "newshop is providing good services in the city; everyone should use newshop",
 * "best services by newshop",
 * "fashionbeats has great services in the city",
 * "I am proud to have fashionbeats",
 * "mymarket has awesome services",
 * "Thanks Newshop for the quick delivery"]
 *
 * Output
 * ["newshop", "fashionbeats"]
 *
 * Explanation
 * "newshop" is occurring in 3 different reviews. "fashionbeats" is occuring in 2 different user reviews and "mymarket" is occurring in only 1 review.
 */
public class TopNCompetitors {
    public List<String> TopNumCompetitors(int numCompetitors,
                                          int topNCompetitors,
                                          List<String> competitors,
                                          int numReviews, List<String> reviews)
    {
        // Your code here
        return null;
    }
}
