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


    public void insertItem(String bookName, String author) {

        root = insertIntoTree(root, bookName, author);

    }

    private Node insertIntoTree(Node root, String bookName, String author) {

        if (root == null) {
            if (!author.equals("")) {

                root = new Node(bookName, author);
            } else {
                root = new Node(bookName);
            }

            return root;
        } else if (itemExists(bookName)){
            System.out.println(bookName + " already exists in the collection.");

        } else {


            if (root.book.getName().toLowerCase().compareTo(bookName.toLowerCase()) > 0) {

                root.left = insertIntoTree(root.left, bookName, author);
            } else {

                root.right = insertIntoTree(root.right, bookName, author);
            }
        }
        return root;
    }

    private boolean itemExists(String bookName) {
       return searchTree(root, bookName);

    }

    private boolean searchTree(Node root, String bookName) {


        if (root!=null) {

            if (root.book.getName().toLowerCase().equals(bookName.toLowerCase())) {

                return true;
            } else if (root.left!=null && root.left.book.getName().toLowerCase().equals(bookName.toLowerCase())) {

                return true;
            } else if (root.right!=null && root.right.book.getName().toLowerCase().equals(bookName.toLowerCase())){
                return true;
            } else {

                boolean existsLeft, existsRight;
                if (root.left!=null) {

                    existsLeft = searchTree(root.left, bookName);
                } else {
                    existsLeft = false;
                }

                if (root.right!=null) {

                    existsRight = searchTree(root.right, bookName);
                } else {

                    existsRight = false;
                }

                return existsLeft || existsRight;

            }

        }
        return false;
// https://www.geeksforgeeks.org/binary-search-tree-set-1-search-and-insertion/
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

            if (root.book.getName().toLowerCase().equals(bookName.toLowerCase())) {

                return root.book.getAuthor();
            } else if (root.left!=null && root.left.book.getName().toLowerCase().equals(bookName.toLowerCase())) {

                return root.left.book.getAuthor();
            } else if (root.right!=null && root.right.book.getName().toLowerCase().equals(bookName.toLowerCase())){
                return root.right.book.getAuthor();
            } else {

                String leftAuthor, rightAuthor;
                if (root.left!=null) {

                    leftAuthor = searchAuthor(root.left, bookName);
                } else {
                    leftAuthor = "";
                }

                if (root.right!=null) {

                    rightAuthor = searchAuthor(root.right, bookName);
                } else {

                    rightAuthor = "";
                }

                if (leftAuthor.equals("")) {
                    if (rightAuthor.equals("")) {

                        return "";
                    } else {

                        return rightAuthor;
                    }
                } else {
                    return leftAuthor;
                }


            }

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
        if (root.book.getName().toLowerCase().compareTo(bookName.toLowerCase()) > 0)
            root.left = deleteRec(root.left, bookName);
        else if (root.book.getName().toLowerCase().compareTo(bookName.toLowerCase()) < 0)
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

                root = deleteRec(root, bookName);
                insertItem(newBookName, author);

            } else {

                System.out.println(newBookName + " already exists.");
            }

        } else {

            System.out.println("Book with the name " + bookName + " doesn't exist");
        }

    }

    public void changeAuthorName(String bookName) {

        if (this.itemExists(bookName)) {

            System.out.print("New author name: ");
            String authorName=scanner.nextLine();

            traverseChangeAuthor(root, authorName, bookName);
        } else {

            System.out.println(bookName + " not found.");
        }
    }



    private void traverseChangeAuthor(Node root, String authorName, String bookName) {
        if (root!=null) {

            traverseChangeAuthor(root.left, authorName, bookName);

            if (root.book.getName().toLowerCase().equals(bookName.toLowerCase())) {

                root.book.setAuthor(authorName);
            }

            traverseChangeAuthor(root.right, authorName, bookName);
        }

    }


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

        public Node (String bookName, String author) {

            this.book = new Book(bookName,author);
            this.left = null;
            this.right = null;

        }

    }


}
