package structures.trees.Ejercicio_02_invert;

import structures.node.Node;
import structures.trees.BinaryTree;

public class InvertBinaryTree {

    public Node insert (int[] numeros ){

        //CREAR EL ARBOL DE ENTEROS
        BinaryTree<Integer> tree = new BinaryTree<>();

        //INSERTAR CADA NUMERO
        for(int numero : numeros){
            tree.add(numero);
        }

        //IMPRIMIR EL ARBOL (PRUEBA)
        invertTree(tree.getRoot());
        return tree.getRoot();
    }

    public Node invertTree(Node root){
        System.out.println("\nArbol Original: \n");
        printTreeRecursivo(root, 0);

        invertBinaryTree(root); 
        System.out.println("\nArbol Invertido: \n");
        printTreeRecursivo(root, 0);
        return root; 
    }

    private void printTreeRecursivo(Node actual, int nivel ){
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

    public Node invertBinaryTree (Node actual){
        if(actual == null ){
            return null; 
        }

        Node aux = actual.getLeft();
        actual.setLeft(actual.getRigth());
        actual.setRigth(aux);

        invertBinaryTree(actual.getLeft());
        invertBinaryTree(actual.getRigth());

        return actual; 
    }
}
