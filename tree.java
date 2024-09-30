package banat1.tect_10__17.hw10_17.hw17;

import java.util.List;

public class tree {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<>();

        // Insert elements
        bst.insert(10);
        bst.insert(5);
        bst.insert(15);
        bst.insert(3);
        bst.insert(7);

        // Search for an element
        Integer found = bst.find(7);
        System.out.println("Found: " + (found != null ? found : "null"));

        // Get sorted list
        List<Integer> sortedList = bst.getSortedList();
        System.out.println("Sorted List: " + sortedList);
    }
}
