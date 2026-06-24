package structures.trees.Ejercicio_04_depth;

import structures.node.Node;
import structures.trees.BinaryTree;

public class Depth {
    public Node insert (int[] numeros ){

        //CREAR EL ARBOL DE ENTEROS
        BinaryTree<Integer> tree = new BinaryTree<>();

        //INSERTAR CADA NUMERO
        for(int numero : numeros){
            tree.add(numero);
        }

        //IMPRIMIR EL ARBOL
        printTree(tree.getRoot());
        System.out.println();
        System.out.println("Profundidad maxima: " + maxDepth(tree.getRoot()));
        return tree.getRoot();
    }

    private int maxDepth(Node actual){
        if (actual == null){
            return 0;
        }
        int heighLeft = maxDepth(actual.getLeft());
        int heighRight = maxDepth(actual.getRigth());

        int profundidad = Math.max(heighLeft, heighRight);
        return profundidad + 1; 
    }

    // Mostrar arbol

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
