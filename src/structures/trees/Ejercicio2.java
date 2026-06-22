package structures.trees;

import structures.node.Node;

public class Ejercicio2 {

    public void insert (int[] numeros ){

        //CREAR EL ARBOL DE ENTEROS
        BinaryTree<Integer> tree = new BinaryTree<>();

        //INSERTAR CADA NUMERO
        for(int numero : numeros){
            tree.add(numero);
        }
    }

    public void invertTree(Node<Integer> root){
        System.out.println("Arbol Original");
        printTreeRecursivo(root, 0);
        System.out.println("Arbol Invertido");

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
