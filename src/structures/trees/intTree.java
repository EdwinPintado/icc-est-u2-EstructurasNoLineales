package structures.trees;

import structures.node.Node;

public class IntTree {
    
    private Node<Integer> root; 

    // CONSTRUCTOR
    public IntTree(){
        this.root = null; 
    }

    public Node<Integer> getRoot() {
        return root;
    }

    public void setRoot(Node<Integer> root) {
        this.root = root;
    }

    public void serRoot (Integer value){
        Node<Integer> node = new Node<Integer> (value);
        this.root = node; 
    }

    public void add(int value){
        Node<Integer> node = new Node<Integer> (value);
        root = addRecursivo(root, node); 
    }

    private Node<Integer> addRecursivo(Node<Integer> actual, Node<Integer> nodeInsertar){
        if (actual == null){
            return nodeInsertar;
        }

        if(actual.getValue() > nodeInsertar.getValue()){
            // IZQUIERDA
            actual.setLeft(addRecursivo(actual.getLeft(), nodeInsertar)); 
        }else{
            // DERECHA
            actual.setRigth(addRecursivo(actual.getRigth(), nodeInsertar));
        }
        return actual;
    }
}
