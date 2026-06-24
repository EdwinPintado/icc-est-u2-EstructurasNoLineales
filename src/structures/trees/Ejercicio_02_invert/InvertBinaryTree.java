package structures.trees.Ejercicio_02_invert;

import structures.node.Node;
import structures.trees.BinaryTree;

public class InvertBinaryTree {

    public void insert (int[] numeros ){

        //CREAR EL ARBOL DE ENTEROS
        BinaryTree<Integer> tree = new BinaryTree<>();

        //INSERTAR CADA NUMERO
        for(int numero : numeros){
            tree.add(numero);
        }

        //IMPRIMIR EL ARBOL (PRUEBA)
        invertTree(tree.getRoot());
    }

    public void invertTree(Node<Integer> root){
        System.out.println("\nArbol Original: \n");
        printTreeRecursivo(root, 0);

        invertBinaryTree(root); 
        System.out.println("\nArbol Invertido: \n");
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

    public Node<Integer> invertBinaryTree (Node<Integer> actual){
        if(actual == null ){
            return null; 
        }

        Node<Integer> aux = actual.getLeft();
        actual.setLeft(actual.getRigth());
        actual.setRigth(aux);

        invertBinaryTree(actual.getLeft());
        invertBinaryTree(actual.getRigth());

        return actual; 
    }
}
