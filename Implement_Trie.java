class TrieNode {
    char ch;
    boolean exist = false;
    TrieNode[] map = new TrieNode[26];

    public TrieNode() {
        ch = '0';
    }

    public TrieNode(char ch) {
        this.ch = ch;
    }

    boolean getExiset() {
        return exist;
    }

    public void setExist(boolean exist) {
        this.exist = exist;
    }
}

public class Trie {
    private TrieNode root;

    public Trie() {
        root = new TrieNode();
    }

    // Inserts a word into the trie.
    public void insert(String word) {
        char[] ca = word.toCharArray();
        int clen = ca.length;

        TrieNode[] map = root.map;
        TrieNode node = null;
        for (char ch : ca) {
            node = map[ch - 'a'];
            if (node == null) {
                node = new TrieNode(ch);
                map[ch - 'a'] = node;
            }
            map = node.map;
        }
        node.setExist(true);
    }

    // Returns if the word is in the trie.
    public boolean search(String word) {
        TrieNode node = root;
        for (char ch : word.toCharArray()) {
            TrieNode[] map = node.map;
            TrieNode trieNode = map[ch - 'a'];
            if (trieNode == null)
                return false;
            node = trieNode;
        }
        return node.getExiset();
    }

    // Returns if there is any word in the trie
    // that starts with the given prefix.
    public boolean startsWith(String prefix) {
        TrieNode node = root;
        for (char ch : prefix.toCharArray()) {
            TrieNode[] map = node.map;
            TrieNode trieNode = map[ch - 'a'];
            if (trieNode == null)
                return false;
            node = trieNode;
        }
        return node != null;
    }
}

// Your Trie object will be instantiated and called as such:
// Trie trie = new Trie();
// trie.insert("somestring");
// trie.search("key");
