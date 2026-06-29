
// import java.util.Arrays;
import java.util.Set;
import collections.set.Sets;
// import models.Persona;
// // import structures.node.Node;
// // import structures.trees.BinaryTree;
// // import structures.trees.IntTree;
// import structures.trees.Ejercicio_01_insert.InsertBSTTest;
// import structures.trees.Ejercicio_02_invert.InvertBinaryTree;
// import structures.trees.Ejercicio_03_listLeves.ListLevels;
// import structures.trees.Ejercicio_04_depth.Depth;
import models.Contacto;

public class App {

    public static void main(String[] args) throws Exception {

        // rutIntTree(); 
        // rutIntTree2(); 
        // runBinaryTree(); 
        // runEjercicio1();
        // runEjercicio1_1();
        // runEjercicio1_2();
        // runEjercicio1_3();
        // runEjercicio2();
        // runEjercicio2_1();
        // runEjercicio2_2();
        // runEjercicio2_3();
        // runEjercicio3();
        // runEjercicio3_1();
        // runEjercicio3_2();
        // runEjercicio3_3();
        // runEjercicio4(); 
        // runEjercicio4_1();
        // runEjercicio4_2();
        // runEjercicio4_3();

        runSet(); 
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
    // private static void rutIntTree2(){
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
    //         int peso = arbolNumero.getWeight();
    //         System.out.println("Peso O(1): \n" + peso);
    //         System.out.println("Peso O(1): " + arbolNumero.getPeso());
    // }
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

    // CLASE 3: 

    // private static void runEjercicio1(){
    //     InsertBSTTest ejercicio1 = new InsertBSTTest();
    //     int[] numeros = new int[ ]{5,3,7,2,4,6,8};
    //     System.out.println("\nEjercicio 01: Insertar en BST (Lleno): ");
    //     System.out.print("\nIput: " + Arrays.toString(numeros));
    //     System.out.println();
    //     ejercicio1.insert(numeros);
    //     System.out.println("\n------------------------------------------------------------------------");
    // }
    // private static void runEjercicio1_1(){
    //     InsertBSTTest ejercicio1 = new InsertBSTTest();
    //     int[] numeros = new int[ ]{};
    //     System.out.println("\nEjercicio 01: Insertar en BST (Vacio): ");
    //     System.out.print("\nIput: " + Arrays.toString(numeros));
    //     System.out.println();
    //     ejercicio1.insert(numeros);
    //     System.out.println("\n------------------------------------------------------------------------");
    // }
    // private static void runEjercicio1_2(){
    //     InsertBSTTest ejercicio1 = new InsertBSTTest();
    //     int[] numeros = new int[ ]{5};
    //     System.out.println("\nEjercicio 01: Insertar en BST (Solo un nodo): ");
    //     System.out.print("\nIput: " + Arrays.toString(numeros));
    //     System.out.println();
    //     ejercicio1.insert(numeros);
    //     System.out.println("\n------------------------------------------------------------------------");
    // }
    // private static void runEjercicio1_3(){
    //     InsertBSTTest ejercicio1 = new InsertBSTTest();
    //     int[] numeros = new int[ ]{5,6,7,8,9,10};
    //     System.out.println("\nEjercicio 01: Insertar en BST (Solo un lado): ");
    //     System.out.print("\nIput: " + Arrays.toString(numeros));
    //     System.out.println();
    //     ejercicio1.insert(numeros);
    //     System.out.println();
    // }

    // private static void runEjercicio2(){
    //     InvertBinaryTree ejercicio2 = new InvertBinaryTree();
    //     int[] numeros = new int[ ]{5,3,7,2,4,6,8};
    //     System.out.println("\nEjercicio 02: Invertir árbol binario (Lleno): ");
    //     ejercicio2.insert(numeros);
    // }
    // private static void runEjercicio2_1(){
    //     InvertBinaryTree ejercicio2 = new InvertBinaryTree();
    //     int[] numeros = new int[ ]{};
    //     System.out.println("\nEjercicio 02: Invertir árbol binario (Vacio): ");
    //     ejercicio2.insert(numeros);
    //     System.out.println("\n------------------------------------------------------------------------");
    // }
    // private static void runEjercicio2_2(){
    //     InvertBinaryTree ejercicio2 = new InvertBinaryTree();
    //     int[] numeros = new int[ ]{5};
    //     System.out.println("\nEjercicio 02: Invertir árbol binario (Solo un nodo): ");
    //     ejercicio2.insert(numeros);
    //     System.out.println("\n------------------------------------------------------------------------");
    // }
    // private static void runEjercicio2_3(){
    //     InvertBinaryTree ejercicio2 = new InvertBinaryTree();
    //     int[] numeros = new int[ ]{5,6,7,8,9,10};
    //     System.out.println("\nEjercicio 02: Invertir árbol binario (Solo un lado): ");
    //     ejercicio2.insert(numeros);
    //     System.out.println();
    // }

    // private static void runEjercicio3(){
    //     ListLevels ejercicio3 = new ListLevels();
    //     int[] numeros = new int[ ]{5,3,7,2,4,6,8};
    //     System.out.println("\nEjercicio 03: Listar niveles (Lleno): \n");
    //     ejercicio3.insert(numeros);
    //     System.out.println("\n------------------------------------------------------------------------");
    // }
    // private static void runEjercicio3_1(){
    //     ListLevels ejercicio3 = new ListLevels();
    //     int[] numeros = new int[ ]{};
    //     System.out.println("\nEjercicio 03: Listar niveles (Vacio): ");
    //     ejercicio3.insert(numeros);
    //     System.out.println("\n------------------------------------------------------------------------");
    // }
    // private static void runEjercicio3_2(){
    //     ListLevels ejercicio3 = new ListLevels();
    //     int[] numeros = new int[ ]{5};
    //     System.out.println("\nEjercicio 03: Listar niveles (Solo un nodo): ");
    //     ejercicio3.insert(numeros);
    //     System.out.println("\n------------------------------------------------------------------------");
    // }
    // private static void runEjercicio3_3(){
    //     ListLevels ejercicio3 = new ListLevels();
    //     int[] numeros = new int[ ]{5,6,7,8,9,10};
    //     System.out.println("\nEjercicio 03: Listar niveles (Solo un lado): ");
    //     ejercicio3.insert(numeros);
    //     System.out.println();
    // }

    // private static void runEjercicio4(){
    //     Depth ejercicio4 = new Depth();
    //     int[] numeros = new int[ ]{5,3,7,2,4,6,8};
    //     System.out.println("\nEjercicio 04: Profundidad maxima (Lleno): ");
    //     ejercicio4.insert(numeros );
    //     System.out.println("\n------------------------------------------------------------------------");
    // }
    // private static void runEjercicio4_1(){
    //     Depth ejercicio4 = new Depth();
    //     int[] numeros = new int[ ]{};
    //     System.out.println("\nEjercicio 04: Profundidad maxima (Vacio): ");
    //     ejercicio4.insert(numeros);
    //     System.out.println("\n------------------------------------------------------------------------");
    // }
    // private static void runEjercicio4_2(){
    //     Depth ejercicio4 = new Depth();
    //     int[] numeros = new int[ ]{5};
    //     System.out.println("\nEjercicio 04: Profundidad maxima (Solo un nodo): ");
    //     ejercicio4.insert(numeros);
    //     System.out.println("\n------------------------------------------------------------------------");
    // }
    // private static void runEjercicio4_3(){
    //     Depth ejercicio4 = new Depth();
    //     int[] numeros = new int[ ]{5,6,7,8,9,10};
    //     System.out.println("\nEjercicio 04: Profundidad maxima (Solo un lado): ");
    //     ejercicio4.insert(numeros);
    //     System.out.println();
    // }

    private static void runSet (){
        Sets sets = new Sets(); 
        System.out.println("\n-----HashSet-----\n");
        System.out.print("# HashCode: ");
        Set<String> hashSet = sets.construirHashSet();
        System.err.println(hashSet);
        System.out.println("Size = "+ hashSet.size());
        System.out.println(hashSet.contains("F"));

        System.out.println("\n-----LinkedHashSet-----\n");
        System.out.print("# LinkedHashCode: ");
        Set<String> lSet = sets.construirLinkedHashSet();
        System.err.println(lSet);
        System.out.println("Size = "+ lSet.size());
        System.out.println(lSet.contains("F"));

        System.out.println("\n-----TreeSet-----\n");
        System.out.print("# TreeSetCode: ");
        Set<String> treeSet = sets.construirTreeSet();
        System.err.println(treeSet);
        System.out.println("Size = "+ treeSet.size());
        System.out.println(treeSet.contains("F"));
        System.out.println();

        System.out.println("\n-----HashSetContacto-----\n");
        System.out.print("# HashSetContacto: ");
        Set<Contacto> hCSet = sets.construirHashSetContacto();
        System.err.println(hCSet);
        System.out.println("Size = "+ hCSet.size());
        System.out.println();

        System.out.println("\n-----TreeSetContacto-----\n");
        System.out.print("# TreeSetContacto: ");
        Set<Contacto> tCSet = sets.construirTreeSetContacto();
        System.err.println(tCSet);
        System.out.println("Size = "+ tCSet.size());
        System.out.println();
    }
}
