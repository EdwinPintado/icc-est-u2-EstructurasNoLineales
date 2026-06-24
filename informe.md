# **Práctica: Estructura de Lógica con Estructuras no Lineales: Árboles**

## **Datos del Estudiante**

- **Nombre:** Edwin Patricio Pintado Reinoso
- **Curso:** Grupo 1
- **Fecha:** 24/06/2026

---

## **Descripcion del proyecto:**

**Descripción:** Desarrollo de diferentes ejercicios usando estructuras de datos no lineales, con el objetivo de mejorar y reforzar la lógica de programación, al implementar algoritmos en los que destacan problemas de: 

- Insersión de datos en arboles binarios.
- Impresion de arboles de diferentes manera, horizontal normal y horizontal invertido.
- Recorridos por niveles.
- Calculo de profundidad o altura del arbol.

---

## **Explicacion del ejercicio 01:** 

- Se basa en crear un árbol binario de numeros enteros con los datos que se le asignen en el app, es decir que a partir de la raiz los datos se iran insertando en su lugar correcto, organizandose a la izquierda si son menores al nodo y a la derecha si son mayores, y luego muestra el árbol completo representado de lado.

### **Método insert:**

```java
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
```

- En este fragmento de codigo recibe como parametro una lista de datos en el app, por ejemplo {5,3,7,2,4,6,8}, que despues se convertiran en un árbol binario.

- Esta linea de codigo `BinaryTree<Integer> tree = new BinaryTree<>();`, crea un arbol binario pero vacio con el nombre de tree, para que posteriormente podamos insertarle valores. 

- Este fragmento `for(int numero : numeros){` es el que inserta los valores dento del árbol, este "for each" recorre uno por uno los valores de la lista y lo coloca dentro de un nuevo nodo vacio del árbol en su posicion correcta.

- Por ultimo el `printTree(tree.getRoot());`, nos ayuda a ejecutar los siguientes metodos, como lo son el de la impresión del árbol y el `return tree.getRoot();` retorna el Nodo que establecimos que el metodo va a retornar. 

--- 

## **Explicacion del ejercicio 02:**

- En este ejercicio la primera parte es muy similar al anterior, ya que crea un árbol, le incerta valores y lo imprime representado de lado, la diferencia es que se incremento un metodo que permita mostrar el mismo arbol pero con sus ramas invertidas. 

### **Método invertTree:**

```java
    public Node invertTree(Node root){
        System.out.println("\nArbol Original: \n");
        printTreeRecursivo(root, 0);

        invertBinaryTree(root); 
        System.out.println("\nArbol Invertido: \n");
        printTreeRecursivo(root, 0);
        return root; 
    }

    // Esta directamente relacionado con el siguiente: 

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
```

- En este caso el `public Node invertTree(Node root){` es un metodo en el cual recibe una nodo que contiene un número, en este caso la raiz del árbol utilizado, para posteriormente ejecutar dos metodos recursivos. El primero `printTreeRecursivo(root, 0);`, que imprime el arbol de lado, con los valores menores hacia abajo y los mayores hacia arriva, y luego `printTreeRecursivo(root, 0);` que hace lo mismo pero invirtiendo el lado de sus ramas. 

- El metodo `public Node invertBinaryTree (Node actual){` es un metodo recursivo que se va a reprtir hasta que se cumpla el caso base, por ejemplo con nuestra lista de: {5,3,7,2,4,6,8}, al entrar en el metodo va a preguntar, existen datos, si esto se cumple ignora el caso base y continua el codigo, en el cual guarda en un auxiliar el valor del nodo izquierdo del nodo actual a verificar y lo coloca en el nodo izquierdo el valor que estaba en el nodo derecho, despues recupera del auxiliar el valor izquierdo y lo coloca en el nodo derecho.

- Luego este metodo se vuelve a llamar pero ya no con la raiz, sino con el nodo que se encuentra a su izquierda, y asi recursivamente hasta que nos quedemos sin nodos que evaluar, entonces el metodo vuelve al primer cambio, pero en vez de tomar el nodo izquierdo toma el nodo derecho y realiza los mismos procesos recursivos. 

---

## **Explicacion del ejercicio 03:**

- Este método como tal no imprime el árbol, o no lo representa de una manera grafica, sino que crea diferentes listas para leer el árbol y almacenar los datos, con el objetivo de posteriormente imprimir los valores de los nodos organizados por niveles, en este caso se tomó a la raiz como nivel 0.

### **Método listLevels:**

```java
    public List<List<Node>> listaLevels(Node actual){
        List<List<Node>> resultado = new ArrayList<>();
        if(actual == null ){
            return resultado; 
        }

        Queue<Node> colaLevel = new LinkedList<>();
        colaLevel.add(actual);

        while(!colaLevel.isEmpty()){
            int cant = colaLevel.size(); 
            List<Node> nivel = new ArrayList<>();

            for(int i = 0; i< cant; i++ ){
                Node nodoActual = colaLevel.remove();
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
```

- Al declarar el método `public List<List<Node>> listaLevels(Node actual){`, estamos diciendo que nosotros al ejecutarlo le daremos un nodo y el metodo despues de ciertos procesos, nos debe devolver siempre una lista.

- En la siguiente linea de codigo `List<List<Node>> resultado = new ArrayList<>();` se crea una lista, que va a almacenar listas de nodos, a esta lista se la llamara resultado.

- Aqui `if(actual == null ){` es nuestro caso base y el encargado de hacer que el codigo no funcione cuando encuentre nodos vacios, siendo ese el momento que nos retorna el resultado. 

- En este paso `Queue<Node> colaLevel = new LinkedList<>();` creamos como algo parecido a una lista de espera (Fila/Cola), y con este comando `colaLevel.add(actual);` le agregamos a esta fila el dato a evaluar.

- Por ultimo el `while(!colaLevel.isEmpty()){` lo que hace es preguntar si la fila tiene elementos, sino contiene nada retorna la lista resultado que tenga hasta el momento, si contiene elementos hace lo siguiente:  
        
- Cuenta cuantos nodos tiene la fila.
- Crea una lista para guardar los datos de este nivel, llamada nivel. 
- El `for(int i = 0; i< cant; i++ ){` lo que hace es extraer los valores de la fila para colocarlo en la nueva lista (nivel).
- Posteriormente los if llaman a la fila a los nodos hijos, tanto izquierdo como derecho a la fila/cola, para repetir el proceso.
- Al terminar todo siempre debe llegar al metodo base, que seria cuando ya no hay metodos a evaluar, retornandonos la lista de listas que se obtuvo hasta ese momento.
- Este metodo no imprime pero obtiene las listas para que otro lo haga, teniendo solo la funcion de leer y estructurar la información.

---

## **Explicacion del ejercicio 04:**

- Lo que hace este algoritmo es medir la altura o profundidad maxima con la que cuente un arbol, contando desde la raiz hasta la rama mas larga o con mas elementos,  es decir que cuenta cuantos nodos existen en el camino mas largo. 

### **Método maxDepth:**

```java
    private int maxDepth(Node actual){
        if (actual == null){
            return 0;
        }
        int heighLeft = maxDepth(actual.getLeft());
        int heighRight = maxDepth(actual.getRigth());

        int profundidad = Math.max(heighLeft, heighRight);
        return profundidad + 1; 
    }
```

- Este es un metodo recursivo en el cual al colocar `private int maxDepth(Node actual){`, declaramos que al ejecutarlo le daremos un nodo y este método tras algunos procesos nos debe devolver un entero.

- El `if (actual == null){` es caso base y el encargado de detener el metodo en cierto punto.

- Lo que hace `int heighLeft = maxDepth(actual.getLeft());` 
es que se llama recursivamente y va dejando procesos en pausa hasta que llega al caso base retornando 0 y `int heighRight = maxDepth(actual.getRigth());` hace lo mismo pero del otro lado. En cierto punto un nodo, el mas profundo tendra sus dos lados como nulo es decir 0 por isquierda y derecha, aqui se pasa a la siguiente parte.

- Las siguiente linea `int profundidad = Math.max(heighLeft, heighRight);` lo que hacen es comparar, aqui se toma este valor retornado del nodo derecho y nodo izquierdo, extrallendo el valor mayor y guardandolo con el nombre de profundidad.

- Cuando llega el nodo mas profundo va a retornar o por derecha y 0 por izquierda (0 y 0), se elige cualquiera 0.

-  Por ultimo en esta linea `return profundidad + 1;` lo que hace es que por cada nivel recorrido se valla sumando uno a la profundidad, no toma en cuenta las llamadas recursivas, sino el nivel.
cuando llega el nodo mas profundo su profundidad es 0, pero como ese es un nivel se le suma 1, asiendo que ese nivel tenga 1 de profundidad.

- Asi al retomar los procesos en pausa dese el ultimo nodo a la raiz, el nodo mas profundo ya viene con valores y se le va sumando uno por cada nivel que se recorre. 

---

## **Salidas de consola y código necesario**

### **Ejercicio 1: Insertar en BST**

### **Codigo necesario**

### **Clase**

```java
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
```

### **App**

```java
import java.util.Arrays;
import structures.trees.Ejercicio_01_insert.InsertBSTTest;
import structures.trees.Ejercicio_02_invert.InvertBinaryTree;
import structures.trees.Ejercicio_03_listLeves.ListLevels;
import structures.trees.Ejercicio_04_depth.Depth;

public class App {
    public static void main(String[] args) throws Exception {
        runEjercicio1();
        runEjercicio1_1();
        runEjercicio1_2();
        runEjercicio1_3();
    }
    private static void runEjercicio1(){
        InsertBSTTest ejercicio1 = new InsertBSTTest();
        int[] numeros = new int[ ]{5,3,7,2,4,6,8};
        System.out.println("\nEjercicio 01: Insertar en BST (Lleno): ");
        System.out.print("\nIput: " + Arrays.toString(numeros));
        System.out.println();
        ejercicio1.insert(numeros);
        System.out.println("\n------------------------------------------------------------------------");
    }
    private static void runEjercicio1_1(){
        InsertBSTTest ejercicio1 = new InsertBSTTest();
        int[] numeros = new int[ ]{};
        System.out.println("\nEjercicio 01: Insertar en BST (Vacio): ");
        System.out.print("\nIput: " + Arrays.toString(numeros));
        System.out.println();
        ejercicio1.insert(numeros);
        System.out.println("\n------------------------------------------------------------------------");
    }
    private static void runEjercicio1_2(){
        InsertBSTTest ejercicio1 = new InsertBSTTest();
        int[] numeros = new int[ ]{5};
        System.out.println("\nEjercicio 01: Insertar en BST (Solo un nodo): ");
        System.out.print("\nIput: " + Arrays.toString(numeros));
        System.out.println();
        ejercicio1.insert(numeros);
        System.out.println("\n------------------------------------------------------------------------");
    }
    private static void runEjercicio1_3(){
        InsertBSTTest ejercicio1 = new InsertBSTTest();
        int[] numeros = new int[ ]{5,6,7,8,9,10};
        System.out.println("\nEjercicio 01: Insertar en BST (Solo un lado): ");
        System.out.print("\nIput: " + Arrays.toString(numeros));
        System.out.println();
        ejercicio1.insert(numeros);
        System.out.println();
    }
}
```

### **Salida en consola**

```text

Ejercicio 01: Insertar en BST (Lleno): 

Iput: [5, 3, 7, 2, 4, 6, 8]

Imprimiendo el arbol

                8
        7
                6
5
                4
        3
                2

------------------------------------------------------------------------

Ejercicio 01: Insertar en BST (Vacio): 

Iput: []

Imprimiendo el arbol


------------------------------------------------------------------------

Ejercicio 01: Insertar en BST (Solo un nodo): 

Iput: [5]

Imprimiendo el arbol

5

------------------------------------------------------------------------

Ejercicio 01: Insertar en BST (Solo un lado): 

Iput: [5, 6, 7, 8, 9, 10]

Imprimiendo el arbol

                                        10
                                9
                        8
                7
        6
5

```

## **Ejercicio 2: Invertir árbol binario**

### **Codigo necesario**

### **Clase**

```java
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
```

### **App**

```java
import java.util.Arrays;
import structures.trees.Ejercicio_01_insert.InsertBSTTest;
import structures.trees.Ejercicio_02_invert.InvertBinaryTree;
import structures.trees.Ejercicio_03_listLeves.ListLevels;
import structures.trees.Ejercicio_04_depth.Depth;

public class App {
    public static void main(String[] args) throws Exception {
        runEjercicio2();
        runEjercicio2_1();
        runEjercicio2_2();
        runEjercicio2_3();
    }
    private static void runEjercicio2(){
        InvertBinaryTree ejercicio2 = new InvertBinaryTree();
        int[] numeros = new int[ ]{5,3,7,2,4,6,8};
        System.out.println("\nEjercicio 02: Invertir árbol binario (Lleno): ");
        ejercicio2.insert(numeros);
    }
    private static void runEjercicio2_1(){
        InvertBinaryTree ejercicio2 = new InvertBinaryTree();
        int[] numeros = new int[ ]{};
        System.out.println("\nEjercicio 02: Invertir árbol binario (Vacio): ");
        ejercicio2.insert(numeros);
        System.out.println("\n------------------------------------------------------------------------");
    }
    private static void runEjercicio2_2(){
        InvertBinaryTree ejercicio2 = new InvertBinaryTree();
        int[] numeros = new int[ ]{5};
        System.out.println("\nEjercicio 02: Invertir árbol binario (Solo un nodo): ");
        ejercicio2.insert(numeros);
        System.out.println("\n------------------------------------------------------------------------");
    }
    private static void runEjercicio2_3(){
        InvertBinaryTree ejercicio2 = new InvertBinaryTree();
        int[] numeros = new int[ ]{5,6,7,8,9,10};
        System.out.println("\nEjercicio 02: Invertir árbol binario (Solo un lado): ");
        ejercicio2.insert(numeros);
        System.out.println();
    }
}
```

### **Salida en consola**

```text

Ejercicio 02: Invertir árbol binario (Lleno): 

Arbol Original: 

                8
        7
                6
5
                4
        3
                2

Arbol Invertido: 

                2
        3
                4
5
                6
        7
                8

Ejercicio 02: Invertir árbol binario (Vacio): 

Arbol Original: 


Arbol Invertido: 


------------------------------------------------------------------------

Ejercicio 02: Invertir árbol binario (Solo un nodo): 

Arbol Original: 

5

Arbol Invertido: 

5

------------------------------------------------------------------------

Ejercicio 02: Invertir árbol binario (Solo un lado): 

Arbol Original: 

                                        10
                                9
                        8
                7
        6
5

Arbol Invertido: 

5
        6
                7
                        8
                                9
                                        10

```


## **Ejercicio 3: Listar niveles**

### **Codigo necesario**

### **Clase**

```java
package structures.trees.Ejercicio_03_listLeves;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import structures.node.Node;
import structures.trees.BinaryTree;

public class ListLevels {
    public Node insert (int[] numeros ){
        //CREAR EL ARBOL DE ENTEROS
        BinaryTree<Integer> tree = new BinaryTree<>();
        //INSERTAR CADA NUMERO
        for(int numero : numeros){
            tree.add(numero);
        }
        //IMPRIMIR EL ARBOL
        printTree(listaLevels(tree.getRoot()));
        return tree.getRoot();
    }

    public void printTree(List<List<Node>> print){
        int level = 0; 
        for(List<Node> nivel : print){
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

    public List<List<Node>> listaLevels(Node actual){
        List<List<Node>> resultado = new ArrayList<>();
        if(actual == null ){
            return resultado; 
        }
        Queue<Node> colaLevel = new LinkedList<>();
        colaLevel.add(actual);

        while(!colaLevel.isEmpty()){
            int cant = colaLevel.size(); 
            List<Node> nivel = new ArrayList<>();

            for(int i = 0; i< cant; i++ ){
                Node nodoActual = colaLevel.remove();
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
```

## **App**

```java
import java.util.Arrays;
import structures.trees.Ejercicio_01_insert.InsertBSTTest;
import structures.trees.Ejercicio_02_invert.InvertBinaryTree;
import structures.trees.Ejercicio_03_listLeves.ListLevels;
import structures.trees.Ejercicio_04_depth.Depth;

public class App {
    public static void main(String[] args) throws Exception {
        runEjercicio3();
        runEjercicio3_1();
        runEjercicio3_2();
        runEjercicio3_3();
    }
    private static void runEjercicio3(){
        ListLevels ejercicio3 = new ListLevels();
        int[] numeros = new int[ ]{5,3,7,2,4,6,8};
        System.out.println("\nEjercicio 03: Listar niveles (Lleno): \n");
        ejercicio3.insert(numeros);
        System.out.println("\n------------------------------------------------------------------------");
    }
    private static void runEjercicio3_1(){
        ListLevels ejercicio3 = new ListLevels();
        int[] numeros = new int[ ]{};
        System.out.println("\nEjercicio 03: Listar niveles (Vacio): ");
        ejercicio3.insert(numeros);
        System.out.println("\n------------------------------------------------------------------------");
    }
    private static void runEjercicio3_2(){
        ListLevels ejercicio3 = new ListLevels();
        int[] numeros = new int[ ]{5};
        System.out.println("\nEjercicio 03: Listar niveles (Solo un nodo): ");
        ejercicio3.insert(numeros);
        System.out.println("\n------------------------------------------------------------------------");
    }
    private static void runEjercicio3_3(){
        ListLevels ejercicio3 = new ListLevels();
        int[] numeros = new int[ ]{5,6,7,8,9,10};
        System.out.println("\nEjercicio 03: Listar niveles (Solo un lado): ");
        ejercicio3.insert(numeros);
        System.out.println();
    }
}
```

### **Salida en consola**

```text

Ejercicio 03: Listar niveles (Lleno): 

Nivel 0: 5
Nivel 1: 3 --> 7
Nivel 2: 2 --> 4 --> 6 --> 8

------------------------------------------------------------------------

Ejercicio 03: Listar niveles (Vacio): 

------------------------------------------------------------------------

Ejercicio 03: Listar niveles (Solo un nodo): 
Nivel 0: 5

------------------------------------------------------------------------

Ejercicio 03: Listar niveles (Solo un lado): 
Nivel 0: 5
Nivel 1: 6
Nivel 2: 7
Nivel 3: 8
Nivel 4: 9
Nivel 5: 10

```

### **Ejercicio 4: Profundidad maxima**

## **Codigo necesario**

## Clase 

```java
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
```

## App

```java
import java.util.Arrays;
import structures.trees.Ejercicio_01_insert.InsertBSTTest;
import structures.trees.Ejercicio_02_invert.InvertBinaryTree;
import structures.trees.Ejercicio_03_listLeves.ListLevels;
import structures.trees.Ejercicio_04_depth.Depth;

public class App {
    public static void main(String[] args) throws Exception {
        runEjercicio4(); 
        runEjercicio4_1();
        runEjercicio4_2();
        runEjercicio4_3();
    }
    private static void runEjercicio4(){
        Depth ejercicio4 = new Depth();
        int[] numeros = new int[ ]{5,3,7,2,4,6,8};
        System.out.println("\nEjercicio 04: Profundidad maxima (Lleno): ");
        ejercicio4.insert(numeros );
        System.out.println("\n------------------------------------------------------------------------");
    }
    private static void runEjercicio4_1(){
        Depth ejercicio4 = new Depth();
        int[] numeros = new int[ ]{};
        System.out.println("\nEjercicio 04: Profundidad maxima (Vacio): ");
        ejercicio4.insert(numeros);
        System.out.println("\n------------------------------------------------------------------------");
    }
    private static void runEjercicio4_2(){
        Depth ejercicio4 = new Depth();
        int[] numeros = new int[ ]{5};
        System.out.println("\nEjercicio 04: Profundidad maxima (Solo un nodo): ");
        ejercicio4.insert(numeros);
        System.out.println("\n------------------------------------------------------------------------");
    }
    private static void runEjercicio4_3(){
        Depth ejercicio4 = new Depth();
        int[] numeros = new int[ ]{5,6,7,8,9,10};
        System.out.println("\nEjercicio 04: Profundidad maxima (Solo un lado): ");
        ejercicio4.insert(numeros);
        System.out.println();
    }
}
```

### **Salida en consola**

```text

Ejercicio 04: Profundidad maxima (Lleno): 

Imprimiendo el arbol

                8
        7
                6
5
                4
        3
                2

Profundidad maxima: 3

------------------------------------------------------------------------

Ejercicio 04: Profundidad maxima (Vacio): 

Imprimiendo el arbol


Profundidad maxima: 0

------------------------------------------------------------------------

Ejercicio 04: Profundidad maxima (Solo un nodo): 

Imprimiendo el arbol

5

Profundidad maxima: 1

------------------------------------------------------------------------

Ejercicio 04: Profundidad maxima (Solo un lado): 

Imprimiendo el arbol

                                        10
                                9
                        8
                7
        6
5

Profundidad maxima: 6

```