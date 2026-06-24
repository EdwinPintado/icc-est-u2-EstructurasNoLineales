package structures.trees.Ejercicio_01_insert;

import structures.node.Node;
import structures.trees.BinaryTree;

public class InsertBSTTest {

    public Node insert (int[] numeros ){

        //CREAR EL ARBOL DE ENTEROS
        BinaryTree<Integer> tree = new BinaryTree<>();

        //INSERTAR CADA NUMERO
        for(int numero : numeros){
            tree.add(numero);
        }

        //IMPRIMIR EL ARBOL 
        printTree(tree.getRoot());
        return tree.getRoot();
    }

    public void printTree(Node root){
        System.out.println("\nImprimiendo el arbol\n");
        printTreeRecursivo(root, 0);
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

}