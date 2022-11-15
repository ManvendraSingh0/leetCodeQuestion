public class binaryDepth {
  // Node root;
    static  class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;

        }
    }
    static  class Binarytree{
        //static int idx=-1;
        public static Node buildTree(int []nodes,int idx){
            
            Node newNode = null;
            if (idx< nodes.length) {
               // root = new Node(nodes[i]);
                 newNode=new Node(nodes[idx]);
                newNode.left=buildTree(nodes,2*idx+1);
                newNode.right=buildTree(nodes,2*idx+2);
            }
           
            return newNode;
        }

        public binaryDepth.Node root;
    }
    public  static  void perorder(Node root){
        if(root==null)
            return;
        System.out.print(root.data+" ");
        perorder(root.left);
        perorder(root.right);
    }
    public  static int maxDepth(Node root){
        if(root==null)
            return 0;
        if(root.left==null && root.right==null)
            return 1;
        int left=maxDepth(root.left);
        System.out.println(maxDepth(root.left));
        int right=maxDepth(root.right);
        System.out.println(maxDepth(root.right));
        System.out.println(1+Math.max(left,right));
        return 1+Math.max(left,right);

    }
    public static void inOrder(Node root)
    {
        if (root != null) {
            inOrder(root.left);
            System.out.print(root.data + " ");
            inOrder(root.right);
        }
    }
    public static void  main(String args[]) {
        int nodes[]={ 1, 2, 3, 4, 5, 6, 6, 6, 6 };
        Binarytree tree=new Binarytree();
        tree.root=tree.buildTree(nodes,0);
       /// perorder(tree.root);
        inOrder(tree.root);
       // maxDepth(tree.root);


        }
    }

