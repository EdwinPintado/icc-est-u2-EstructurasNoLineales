package structures.trees.Ejercicio_03_listLeves;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import structures.node.Node;
import structures.trees.BinaryTree;

public class ListLevels {
    
    public void insert (int[] numeros ){

        //CREAR EL ARBOL DE ENTEROS
        BinaryTree<Integer> tree = new BinaryTree<>();

        //INSERTAR CADA NUMERO
        for(int numero : numeros){
            tree.add(numero);
        }

        //IMPRIMIR EL ARBOL
        printTree(listaLevels(tree.getRoot()));
    }

    public void printTree(List<List<Node<Integer>>> print){
        int level = 0; 
        for(List<Node<Integer>> nivel : print){
            System.out.print("Nivel " + level + ": ");
            for(int i = 0; i<nivel.size(); i++){
                if(i == nivel.size()-1 || nivel.size()== 1 ){
                    System.out.println(nivel.get(i));
                }else{
                    System.out.print(nivel.get(i) + " --> ");
                } 
            }
            level++;
        }
    }

    public List<List<Node<Integer>>> listaLevels(Node<Integer> actual){
        List<List<Node<Integer>>> resultado = new ArrayList<>();
        if(actual == null ){
            return resultado; 
        }

        Queue<Node<Integer>> colaLevel = new LinkedList<>();
        colaLevel.add(actual);

        while(!colaLevel.isEmpty()){
            int cant = colaLevel.size(); 
            List<Node<Integer>> nivel = new ArrayList<>();

            for(int i = 0; i< cant; i++ ){
                Node<Integer> nodoActual = colaLevel.remove();
                nivel.add(nodoActual);

                if(nodoActual.getLeft() != null)
                    colaLevel.add(nodoActual.getLeft());
                if(nodoActual.getRigth() != null)
                    colaLevel.add(nodoActual.getRigth());
            }
            resultado.add(nivel);
        }
        return resultado; 
    }
}
