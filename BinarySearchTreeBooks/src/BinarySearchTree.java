import java.util.Scanner;

public class BinarySearchTree {

    Node root;
    private static int counter = 1;
    String name;
    private static Scanner scanner = new Scanner(System.in);

    public BinarySearchTree(String name) {
        this.name = name;
        this.root = null;
    }

    public void insertItem(String bookName) {

        root = insertIntoTree(root, bookName);

    }

    private Node insertIntoTree(Node root, String bookName) {

        if (root == null) {

            root = new Node(bookName);
            return root;
        } else if (itemExists(bookName)){
            System.out.println(bookName + " already exists in the collection.");

        } else {


            if (root.book.getName().compareTo(bookName) > 0) {

                root.left = insertIntoTree(root.left, bookName);
            } else {

                root.right = insertIntoTree(root.right, bookName);
            }
        }
        return root;
    }

    private boolean itemExists(String bookName) {
       return searchTree(root, bookName);

    }

    private boolean searchTree(Node root, String bookName) {


        if (root!=null) {

            searchTree(root.left, bookName);

            if (root.book.getName().equals(bookName)) {


                return  true;
            }

            searchTree(root.right, bookName);
        }

        return false;

    }

    public String getName() {

        return name;
    }

    public void goThroughTree() {

        traverseTree(root);
        counter = 1;
    }

    private void traverseTree(Node root) {
        if (root!=null) {

            traverseTree(root.left);

            System.out.println(counter + ". " + root.book.toString());
            counter++;

            traverseTree(root.right);
        }

    }

    private String findAuthor(String bookName) {

        return searchAuthor(root, bookName);
    }

    private String searchAuthor(Node root, String bookName) {

        if (root!=null) {

            searchAuthor(root.left, bookName);

                if (root.book.getAuthor().equals(bookName)) {

                    return root.book.getAuthor();
                }

            searchAuthor(root.right, bookName);
        }
        return "";
    }



    public void deleteBook(String bookName) {
        root = deleteRec(root, bookName);
    }

    /* A recursive function to
      delete an existing key in BST
     */
    private Node deleteRec(Node root, String bookName) {
        /* Base Case: If the tree is empty */
        if (root == null)
            return root;

        /* Otherwise, recur down the tree */
        if (root.book.getName().compareTo(bookName) > 0)
            root.left = deleteRec(root.left, bookName);
        else if (root.book.getName().compareTo(bookName) < 0)
            root.right = deleteRec(root.right, bookName);

            // if key is same as root's
            // key, then This is the
            // node to be deleted
        else {
            // node with only one child or no child
            if (root.left == null)
                return root.right;
            else if (root.right == null)
                return root.left;

            // node with two children: Get the inorder
            // successor (smallest in the right subtree)
            root.book = minValue(root.right);

            // Delete the inorder successor
            root.right = deleteRec(root.right, root.book.getName());
        }

        return root;
    }

    private Book minValue(Node root) {
        Book minv = root.book;
        while (root.left != null)
        {
            minv = root.left.book;
            root = root.left;
        }
        return minv;
    }

    public void replaceBook(String bookName) {

        String newBookName;
        String author;
        if (itemExists(bookName)) {
            System.out.print("Write the name of the new book: ");
            newBookName = scanner.nextLine();
            author = findAuthor(bookName);
            if (!itemExists(newBookName)){

                root = deleteRec(root, author);
            } else {

                System.out.println(newBookName + " + already exists.");
            }

        } else {

            System.out.println("Book with the name " + bookName + " doesn't exist");
        }

    }

    // TODO: 16.11.2020 г. change author name 


    private class Node {

        Node left, right;
        Book book;

        public Node (String bookName) {
            System.out.print("Write the name of the author: ");
            String bookAuthor = scanner.nextLine();
            this.book = new Book(bookName,bookAuthor);
            this.left = null;
            this.right = null;

        }

    }


}
