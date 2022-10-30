from typing import List


class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        """

        :param nums:
        :param target:
        :return:
        :rtype: object
        """
        prevmap = {}   #this is every element and indici before the current one

        for i, n in enumerate(nums):   #iterate through all the numbers in the list and their indecies (enumerate)

            diff = target - n    # target value minus the n found in the list = difference   target = 4 n = 2 diff = 4-2  = 2 diff = 2
            if diff in prevmap:  #if the diff   is already in the hashmap return the index or the first and the sencond numbers indexes
                return [prevmap[diff], i]   #return the index or the first and the sencond numbers indexes
            prevmap[n] = i #the new index is the next iteam in the hash map becuase it was not the previous other wise make n the next value in the list d otherwise this updating the hash map
            
        return

    print(twoSum([1,2,3], 5))


