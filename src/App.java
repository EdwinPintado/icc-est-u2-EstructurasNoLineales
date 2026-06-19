
import structures.trees.IntTree;

public class App {

    public static void main(String[] args) throws Exception {

        rutIntTree(); 

    }

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

    private static void rutIntTree(){
            IntTree arbolNumero = new IntTree(); 
            arbolNumero.add(50); 
            arbolNumero.add(10); 
            arbolNumero.add(30); 
            arbolNumero.add(60); 
            arbolNumero.add(75); 
            arbolNumero.add(55);
 
            System.out.println("PreOrden: ");
            arbolNumero.preOrden();
            System.out.println("\nPosOrden: ");
            arbolNumero.posOrden();
            System.out.println("\nIntOrden: ");
            arbolNumero.inOrden();

            int altura = arbolNumero.getHeingth();
            System.out.println("\nAltura: " + altura + "\n");

            int peso = arbolNumero.getWeight();
            System.out.println("Peso: " + peso + "\n");
    }

    


}
