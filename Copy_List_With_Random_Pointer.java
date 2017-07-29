/**
 * Definition for singly-linked list with a random pointer.
 * class RandomListNode {
 *     int label;
 *     RandomListNode next, random;
 *     RandomListNode(int x) { this.label = x; }
 * };
 */
public class Solution {
    public RandomListNode copyRandomList(RandomListNode head) {
        if (head == null) {
            return null;
        }

        List<RandomListNode> lst = new ArrayList<>();
        RandomListNode now = head;

        Map<RandomListNode, Integer> map = new HashMap<>();

        int index = -1;
        while(now != null) {
            index++;
            lst.add(new RandomListNode(now.label));

            if (index != 0) {
                lst.get(index - 1).next = lst.get(index);
            }

            map.put(now, index);
            now = now.next;
        }

        now = head;
        index = -1;
        while(now != null) {
            index++;
            Integer rnd = map.get(now.random);
            if (rnd != null) {
                lst.get(index).random = lst.get(rnd);
            }

            now = now.next;
        }

        return lst.get(0);
    }
}
