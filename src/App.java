
import models.Persona;
import structures.trees.BinaryTree;
import structures.trees.Ejercicio1;
import structures.trees.IntTree;

public class App {

    public static void main(String[] args) throws Exception {

        //rutIntTree(); 
        // runBinaryTree(); 
        runEjercicios();
    }


    // CLASE 1:

    // private static void rutIntTree(){
    //     IntTree arbolNumero = new IntTree(); 
    //     Node<Integer> node1 = new Node(50);
    //     Node<Integer> node2 = new Node(10);
    //     Node<Integer> node3 = new Node(30);
    //     arbolNumero.setRoot(node1); 
    //     node1.setRigth(node2); 
    //     node1.setLeft(node1);
    //     System.out.println(arbolNumero.getRoot());
    //     System.out.println(arbolNumero.getRoot().getLeft().getRigth());
    //     System.out.println(arbolNumero.getRoot().getRigth());
    //     System.out.println(arbolNumero.getRoot().getLeft());
    // }

    // CLASE 2: 

    // private static void rutIntTree(){
    //         IntTree arbolNumero = new IntTree(); 
    //         arbolNumero.add(50); 
    //         arbolNumero.add(10); 
    //         arbolNumero.add(30); 
    //         arbolNumero.add(60); 
    //         arbolNumero.add(75); 
    //         arbolNumero.add(55);
    //         System.out.println("PreOrden: ");
    //         arbolNumero.preOrden();
    //         System.out.println("\nPosOrden: ");
    //         arbolNumero.posOrden();
    //         System.out.println("\nIntOrden: ");
    //         arbolNumero.inOrden();
    //         int altura = arbolNumero.getHeingth();
    //         System.out.println("\nAltura: " + altura + "\n");
    //         // int peso = arbolNumero.getWeight();
    //         System.out.println("Peso: " + arbolNumero.getPeso());
    // }


    // CLASE 3: 

    // private static void runBinaryTree(){
    //     BinaryTree<String> arbolStrings = new BinaryTree<>(); 
    //     BinaryTree<Persona> arbolPersonas = new  BinaryTree<>(); 
    //     arbolPersonas.add(new Persona("Pablo", 30));
    //     arbolPersonas.add(new Persona("Ana", 25));
    //     arbolPersonas.add(new Persona("Luiz", 35));
    //     arbolPersonas.add(new Persona("Maria", 28));
        
    //     System.out.println("ARBOL PERSONAS");
    //     arbolPersonas.preOrden();
    // }

    // CLASE 4: 

    private static void runEjercicios(){
        Ejercicio1 ejercicio1 = new Ejercicio1();
        int[] numeros = new int[ ]{5,3,7,2,4,6,8};
        ejercicio1.insert(numeros);
    }

}
