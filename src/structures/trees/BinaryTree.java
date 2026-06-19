package structures.trees;

import structures.node.Node;

public class BinaryTree<T extends Comparable <T>> {
    private Node<T> root;  
    private int weight; 

    // CONSTRUCTOR
    public BinaryTree(Node<T> root, int peso) {
        this.root = root;
        this.weight = peso;
    }

    public Node<T> getRoot() {
        return root;
    }

    public void setRoot(Node<T> root) {
        this.root = root;
    }

    // public void serRoot (T value){
    //     Node<T> node = new Node<T> (value);
    //     this.root = node; 
    // }

    public void add(T value){
        Node<T> node = new Node<T> (value);
        root = addRecursivo(root, node);
        weight ++;  
    }

    private Node<T> addRecursivo(Node<T> actual, Node<T> nodeInsertar){
        if (actual == null){
            return nodeInsertar;
        }

        if(actual.getValue().compareTo(nodeInsertar.getValue()) >0 ){
            // IZQUIERDA
            actual.setLeft(addRecursivo(actual.getLeft(), nodeInsertar)); 
        }else{
            // DERECHA
            actual.setRigth(addRecursivo(actual.getRigth(), nodeInsertar));
        }
        return actual;
    }

    public void preOrden(){
        preOrdenRecursivo(root);
    }

    private void preOrdenRecursivo(Node<T> actual){

        // RAIZ - IZQUIERDA - DERECHA
        if(actual == null ){
            return; 
        }
        System.out.println(actual + ",");

        preOrdenRecursivo(actual.getLeft()); 
        preOrdenRecursivo(actual.getRigth()); 
    }

    public void posOrden(){
        posOrdenRecursivo(root);
    }

    private void posOrdenRecursivo(Node<T> actual){

        // IZQUIERDA - DERECHA - RAIZ
        if(actual == null ){
            return; 
        }

        posOrdenRecursivo(actual.getLeft()); 
        posOrdenRecursivo(actual.getRigth()); 

        System.out.println(actual + ",");
    }

    public void inOrden(){
        inOrdenRecursivo(root);
    }

    private void inOrdenRecursivo(Node<T> actual){

        // IZQUIERDA - RAIZ - DERECHA
        if(actual == null ){
            return; 
        }

        inOrdenRecursivo(actual.getLeft()); 
        System.out.println(actual + ",");
        inOrdenRecursivo(actual.getRigth()); 
    }

    public int getHeingth(){
        return getHeingthRecursivo(root);
    }

    private int getHeingthRecursivo(Node<T> actual){
        if (actual == null){
            return 0;
        }
        int heighLeft = getHeingthRecursivo(actual.getLeft());
        int heighRight = getHeingthRecursivo(actual.getRigth());

        int masAlto = Math.max(heighLeft, heighRight);
        return masAlto + 1; 
    }

    public int getWeight(){
        return getWeightRecursivo(root);
    }

    private int getWeightRecursivo(Node<T> actual){
        if (actual == null){
            return 0;
        }
        int heighLeft = getWeightRecursivo(actual.getLeft());
        int heighRight = getWeightRecursivo(actual.getRigth());

        int peso = heighLeft + heighRight;
        return peso +1; 
    }
    
    public int getPeso(){
        return weight; 
    }

    public void setWeight(int weight){
        this.weight = weight; 
    }
}
