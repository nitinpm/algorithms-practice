package Misc.amz;

/**
 * https://www.geeksforgeeks.org/amazon-interview-experience-sde-2-10/
 * https://www.geeksforgeeks.org/amazon-interview-experience-for-sde-2-8/
 *
 * There was a online test followed by 4 rounds of online interviews.
 * Online Test : 2 Questions.
 *
 * 1. You are a in-flight movie service provider. You are given a list of movie lengths and the duration of the flight. Return a pair of (2) movies whose combined length is the highest and is less than or equal to flight duration.
 * If multiple such combinations are possible, return the pair which has the movie of longer longest duration.
 *
 * Ex :
 * MovieLengths : {27, 1,10, 39, 12, 52, 32, 67, 76}
 * Flight Duration : 77.
 * The 2 possible pairs are (1,76) and (10,67), The answer is (1,76) as per the last constraint.
 *
 *
 *  2. You are given a list of pairs of items(strings) where each pair is an association. Return the association group with the highest number of elements.
 *  If two groups have the same size, return the group that has the lexological smallest element between these 2. Also while returning the group, return it in a lexological sorted order.
 *
 * Sample Input : {{Item0,Item1}, {Item2, Item3}, {Item0, Item4}}
 *
 *
 * Round 1: Technical round and some Amazon Leadership Principle questions.
 * 1. Brief Introduction.
 * 2. https://www.geeksforgeeks.org/find-number-of-islands/
 * 3. Why Changing Company.
 * 4. Why amazon.
 * 5. Explain a situation where you have taken an initiative in the current role that helped the team/company in a quantitative way.
 * 6. Explain a situation where you solved a problem which had a lot of time constraint associated with it.
 *
 * Round 2: Technical Round – 1st Try
 * 1. https://www.geeksforgeeks.org/longest-increasing-subsequence-dp-3/
 * I had internet problems, so had to retake round 2.
 * Round 2 : Technical Round – 2nd Try
 * 1. Given a list of pairs of characters “Pairs Array” and a list of double numbers “Weights Array” resolve the weights of query array.
 * Sample Input :
 * Pairs Array : {{a,b}, {b,c}, {c,d}, …}
 * Weights Array {5.0, 7.0, 2.0,…}
 * Query Array {{a,c}}
 * Explanation : each object in Pairs array is associated with the equivalent element in the weights array as follows.
 * a/b = 5.0, b/c = 7.0, c/d = 2.0.
 * Query = {a,c} = a/c = a/b * b/c = 5.0 * 7.0 = 35.0
 *
 * So the answer is 35.0.
 * Do Note that the Weight Array can have Zeroes.
 *
 * 2. asked to write code, explain algorithm and space, time complexity.
 *
 *
 * Round 3 : Hiring Manager Round: (Design)
 * 1. Brief Introduction.
 * 2. Describe projects I had worked on.
 * 3. Some technical questions on the projects.
 * 4. Explain a situation where you had to go deep to resolve an issue.
 * 5. Design a file sharing system with Version control of files. (Dropbox)
 *
 * Round 4 : Bar Raiser:
 * 1. Give the result of  https://www.geeksforgeeks.org/previous-greater-element/ and https://www.geeksforgeeks.org/next-greater-element/ in a single pass over the input data.
 * 2. Explain a situation where you have taken an initiative in the current role that helped the team/company in a quantitative way.
 * 3. Explain few answers in the previous interviews that you would like to change now.
 * 4. Explain few design patterns that you have used till date.
 * 5. Elaborate on the software designs that you have created in you work.
 * 6. Design a Chess Game.
 */
public class AMZIntEg {
}
