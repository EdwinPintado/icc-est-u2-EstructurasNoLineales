package structures.trees;

import structures.node.Node;

public class IntTree {
    
    private Node<Integer> root; 
    private int weight; 

    // CONSTRUCTOR
    public IntTree(){
        this.root = null;
        this.weight = 0;  
    }

    public Node<Integer> getRoot() {
        return root;
    }

    public void setRoot(Node<Integer> root) {
        this.root = root;
    }

    // public void serRoot (Integer value){
    //     Node<Integer> node = new Node<Integer> (value);
    //     this.root = node; 
    // }

    public void add(int value){
        Node<Integer> node = new Node<Integer> (value);
        root = addRecursivo(root, node); 
        weight ++; 
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

    public void preOrden(){
        preOrdenRecursivo(root);
    }

    private void preOrdenRecursivo(Node<Integer> actual){

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

    private void posOrdenRecursivo(Node<Integer> actual){

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

    private void inOrdenRecursivo(Node<Integer> actual){

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

    private int getHeingthRecursivo(Node<Integer> actual){
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

    private int getWeightRecursivo(Node<Integer> actual){
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
