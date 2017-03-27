class Solution(object):
    def reconstructQueue(self, people):
        people.sort(key=lambda (h, k): (-h, k))
        queue = []
        for p in people:
            queue.insert(p[1], p)
        return queue
