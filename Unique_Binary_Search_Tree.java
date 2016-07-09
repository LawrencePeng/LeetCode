class Solution(object):
    def numTrees(self, n):
        lst = [1] #a_{0}=1
        for i in range(n):
            lst.append(sum(map(lambda x, y : x * y, lst, reversed(lst))));
        return lst[-1]
