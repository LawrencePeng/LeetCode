class Solution(object):
    def topKFrequent(self, nums, k):
        """
        :type nums: List[int]
        :type k: int
        :rtype: List[int]
        """
        li = []
        from collections import Counter
        for item in Counter(nums).most_common(k):
            li.append(item[0])
        return li;
