package tech.strategio;

import java.security.Key;
import java.util.*;

public class E03 {
    /**
     * Given an array of prices, try to find the max profit.
     * See README.md
     *
     * @param prices, an array of numbers
     * @return the maximum value someone can buy and sell
     */
    public static int maxProfit(int[] prices) {

        int bestTimeToBuy = prices[0];
        int besTimeToSell = 0;



        for (int i = 1; i < prices.length ; i++ )
        {

            if (bestTimeToBuy > prices[i]){ bestTimeToBuy = prices[i]; }  // check for the lowest prince in the week

            if ( (prices[i] - bestTimeToBuy) > besTimeToSell){ besTimeToSell = prices[i] -bestTimeToBuy; } // check the best time to sell

        }
        return  besTimeToSell;
    }


}
