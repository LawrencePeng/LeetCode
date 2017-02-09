public int ladderLength(String beginWord, String endWord, Set<String> wordList) {
	Queue<String> queue = new LinkedList<String>();
	HashSet<String> visited = new HashSet<String>();// Visited words

	int length = 1;
	queue.offer(beginWord);
	visited.add(beginWord);
	while (!queue.isEmpty()) {
		int count = queue.size();// Level by level BFS

		for (int k = 0; k < count; k++) {
			char[] chs = queue.poll().toCharArray();

		    for (int i = 0 ; i < chs.length; i++) {// Outer loop should be string
		      for (char ch = 'a'; ch <= 'z'; ch++) {// Inner loop should be 'a' - 'z'
				char chOld = chs[i];
					if (chs[i] == ch)
						continue;

					chs[i] = ch;
					String cur = String.valueOf(chs);
					if (endWord.equals(cur))
						return length + 1;

					if (!visited.contains(cur) && wordList.contains(cur)) {
						queue.offer(cur);
						visited.add(cur);
					}
					chs[i] = chOld;
				}
			}
		}
		length++; // Next round of longer transformation sequence
	}
	return 0;
}
