package BinaryTreeSearch;

// Создаем узел
public class BinarySearchTree {
    class Node {
        int key;
        Node left, right;
        public Node(int item) {
            key = item;
            left = right = null;
        }
    }

    Node root;

    BinarySearchTree() {
        root = null;
    }

    void insert(int key) {
        root = insertKey(root, key);
    }

    // Вставляем в дерево элемент
    Node insertKey(Node root, int key) {
// Возвращаем новый узел, если дерево пустое
        if (root == null) {
            root = new Node(key);
            return root;
        }

// Идем в нужное место и вставляем узел
        if (key < root.key)
            root.left = insertKey(root.left, key);
        else if (key > root.key)
            root.right = insertKey(root.right, key);

        return root;
    }
    void inorder() {
        inorderRec(root);
    }

    // Отсортированный (inorder) обход
    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.key + " -> ");
            inorderRec(root.right);
        }
    }


    // Тестим функции
    public static void main(String[] args) {
        BinarySearchTree tree = new BinarySearchTree();
        tree.insert(8);
        tree.insert(3);
        tree.insert(1);
        tree.insert(6);
        tree.insert(7);
        tree.insert(10);
        tree.insert(14);
        tree.insert(4);

        System.out.print("Отсортированный обход: ");
        tree.inorder();

    }
}