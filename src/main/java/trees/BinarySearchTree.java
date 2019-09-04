package trees;

public class BinarySearchTree {

    class Node{
        Integer key;
        Node left;
        Node right;

        public Node(Integer key){
            this.key = key;
            this.left = null;
            this.right = null;
        }
    }
    Node root;

    public BinarySearchTree(){
        root = null;
    }

    public void insertNode(Integer key){
        root = insert(root,key);
    }

    public Node insert(Node curr,Integer key){
        if (curr==null){
            //tree is empty
            curr = new Node(key);
            return curr;
        }
        if (key<curr.key){
            curr.left = insert(curr.left,key);
        }else if (key>curr.key){
            curr.right = insert(curr.right,key);
        }
        return curr;
    }

    public void delete(Integer key){
        root = delete(root,key);
    }
    public Node delete(Node current,Integer key){

        Node parentofCurrent=null;
        while(current!=null){

            if (key<current.key){
                parentofCurrent=current;
                current = current.left;

            }else if (key>current.key){
                parentofCurrent=current;
                current = current.right;
            }else{

                if (current.left!=null && current.right!=null){
                    Node minOfRightSubTree=current.right;
                    Node parentofMin = null;
                    while(minOfRightSubTree.left!=null){

                        parentofMin=minOfRightSubTree;
                        minOfRightSubTree=minOfRightSubTree.left;

                    }
                    current.key=minOfRightSubTree.key;
                    parentofMin.left=null;
                }else if (current.left==null && current.right==null){
                    if (parentofCurrent.left.key==current.key){
                        parentofCurrent.left=null;
                        break;
                    }else if (parentofCurrent.right.key==current.key){
                        parentofCurrent.right=null;
                        break;
                    }
                }else if (current.right==null ){
                    current.key = current.left.key;
                    current.left=null;
                    break;
                }else if (current.left==null){
                    current.key = current.right.key;
                    current.right=null;
                    break;
                }

            }

        }
        return root;
    }
    public void traverseTree(){
        this.traversePreorder(root);
    }
    public void traverseInorder(Node root){

        if (root!=null){
            traverseInorder(root.left);
            System.out.println(root.key);
            traverseInorder(root.right);
        }
    }

    public void traversePreorder(Node root){

        if (root!=null){
            System.out.println(root.key);
            traversePreorder(root.left);

            traversePreorder(root.right);
        }
    }
    public static void main(String[] args){
        BinarySearchTree tree = new BinarySearchTree();
        tree.insertNode(6);
        tree.insertNode(2);
        tree.insertNode(1);
        tree.insertNode(4);
        tree.insertNode(3);

        tree.insertNode(9);
        tree.insertNode(8);
        tree.insertNode(7);
        tree.insertNode(13);
        tree.insertNode(11);

        tree.traverseTree();

        tree.delete(2);
        System.out.println("**********");
        tree.traverseTree();


    }
}
