package structures.trees;

import structures.node.Node;

public class Ejercicio1 {

    public void insert (int[] numeros ){

        //CREAR EL ARBOL DE ENTEROS
        BinaryTree<Integer> tree = new BinaryTree<>();

        //INSERTAR CADA NUMERO
        for(int numero : numeros){
            tree.add(numero);
        }

        //IMPRIMIR EL ARBOL
        tree.inOrden();
        printTree(tree.getRoot());
    }

    public void printTree(Node<Integer> root){
        System.out.println("Imprimiendo el arbol");
        printTreeRecursivo(root, 0);
    }

    private void printTreeRecursivo(Node<Integer> actual, int nivel ){
        if(actual == null ){
            return; 
        }

        printTreeRecursivo(actual.getRigth(), nivel+1);

        for(int i = 0;  i < nivel; i++){
            System.out.print("\t");
        }
        System.out.println(actual.getValue());

        printTreeRecursivo(actual.getLeft(),nivel +1); 
    }

}