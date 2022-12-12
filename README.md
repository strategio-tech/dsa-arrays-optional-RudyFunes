# DSA-Arrays-Optional

These problems have one thing in common: they use **linear data structures** in the form of arrays.

Accepting the GitHub Assignment will create a repo with a series of challenges at `/src/main/java/tech.strategio` and its corresponding unit tests at `/src/test/java/tech.strategio`. Clone the repo generated for you by GitHub Classroom and use your Java IDE of choice.

Each exercise contains a class with a method. Complete the methods in an IDE such that the unit tests pass. You should run your unit tests often, either through your Java IDE or through the command line (`gradle test`).

To submit the exercises, push a commit to GitHub. Automated tests will run, and you’ll see a green checkbox if ALL unit tests pass.


## Assignments

### E02 - **Valid Anagrams**

*Optional, Difficulty rating: 1*

Given two strings `s` and `t`, return `true` *if* `t` *is an anagram of* `s`*, and* `false` *otherwise*.

An **Anagram** is a word or phrase formed by rearranging the letters of a different word or phrase, typically using all the original letters exactly once.

**Example 1:**

```
Input: s = "anagram", t = "nagaram"
Output: true
```

**Example 2:**

```
Input: s = "rat", t = "car"
Output: false
```

**Constraints:**

- `1 <= s.length, t.length <= 5 * 104`
- `s` and `t` consist of lowercase English letters.

### E03 - The best times to buy and sell stocks

*Optional, Difficulty rating: 1*

You are given an array `prices` where `prices[i]` is the price of a given stock on the `ith` day.

You want to maximize your profit by choosing a **single day** to buy one stock and choosing a **different day to sell that stock in the future.**

Return *the maximum profit you can achieve from this transaction*. If you cannot achieve any profit, return `0`.

**Example 1:**

```
Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: 
Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.

Note: Buying on day 2 and selling on day 1 is not allowed because 
you must buy before you sell.
```

**Example 2:**

```
Input: prices = [7,6,4,3,1]
Output: 0
Explanation: In this case, no transactions are done, and the max profit = 0.
```

**Constraints:**

- `1 <= prices.length <= 105`
- `0 <= prices[i] <= 104`

### E04 - The array of products

*Optional, Difficulty rating: 2*

Given an integer array `nums`, return an array `answer` such that `answer[i]` is equal to the product of all the elements of `nums` except `nums[i]`.

You are not allowed to sum up all the numbers in the array and divide by the number; that’s too easy. Can you do it a different way?

The product of any prefix or suffix of `nums` is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time.

**Again: you aren't allowed to use the division operator!** (`/`)

Example 1:

```
Input: nums = [1,2,3,4] 
Output: [24,12,8,6]  
```

Example 2:

```
Input: nums = [-1,1,0,-3,3] 
Output: [0,0,9,0,0]  
```

Constraints:

```
2 <= nums.length <= 105 
-30 <= nums[i] <= 30 

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
```

## Hints

- All of these problems have corresponding LeetCode challenges. Google for it!
- Because there are corresponding LeetCode challenges, there is a lot of material on how to solve these problems. Give each problem a try first before Googling content!
