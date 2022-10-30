def maxProfit(self, prices: List[int]) -> int:
    current = prices[0]     # the current number starts at the index value of the first element in array need to keep track of the current price
    profit = 0              # and need to keep track of the current profit

    for i in range(1, len(prices)):

        if prices[i] < current:   # if the current element being iterated over is less than the prices current lowest value
            current = prices[i]   # replace with new current lowest value with the new price of the item

        if prices[i] - current > profit:    # if current price is - current (sold for) is greater than the current profit
            profit = prices[i] - current    # replace the new profit

    return profit                           # return profit