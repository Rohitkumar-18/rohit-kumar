class AVLNode {
    int key;
    AVLNode left, right;
    int height;

    public AVLNode(int key) {
        this.key = key;
        this.height = 1; // New node is initially at height 1
    }
}
