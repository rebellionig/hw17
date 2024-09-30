package banat1.tect_10__17.hw10_17.hw17;
import java.util.ArrayList;
import java.util.List;

public class BinarySearchTree<T extends Comparable<T>> implements SearchTree<T> {
    private TreeNode<T> root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(T element) {
        root = insertRec(root, element);
    }

    private TreeNode<T> insertRec(TreeNode<T> root, T element) {
        if (root == null) {
            return new TreeNode<>(element);
        }
        if (element.compareTo(root.data) < 0) {
            root.left = insertRec(root.left, element);
        } else if (element.compareTo(root.data) > 0) {
            root.right = insertRec(root.right, element);
        }
        return root;
    }

    @Override
    public T find(T element) {
        return findRec(root, element);
    }

    private T findRec(TreeNode<T> root, T element) {
        if (root == null) {
            return null; // Element not found
        }
        if (element.equals(root.data)) {
            return root.data; // Element found
        }
        if (element.compareTo(root.data) < 0) {
            return findRec(root.left, element);
        } else {
            return findRec(root.right, element);
        }
    }

    @Override
    public List<T> getSortedList() {
        List<T> sortedList = new ArrayList<>();
        inOrderTraversal(root, sortedList);
        return sortedList;
    }

    private void inOrderTraversal(TreeNode<T> node, List<T> list) {
        if (node != null) {
            inOrderTraversal(node.left, list);
            list.add(node.data);
            inOrderTraversal(node.right, list);
        }
    }
}