
package matrices;


public class EjemploMatricesPrueba {
    public static void main(String[] args) {
        //declara matris tipo int de 2 dimensiones
        int edades[][];
        //2 instanciamos la matriz de int 
        //contenera 3 renglones con dos columnas
        edades = new int[3][2];
        //3. instanciar los valores de la matriz 
        edades[0][0]=30;
        edades[0][1]=15;
        edades[1][0]=20;
        edades[1][1]=45;
        edades[2][0]=5;
        edades[2][1]=38;
        //4.imprimir los valores
        System.out.println("matriz de enteros indice 0,0 "+ edades[0][0]);
        
        for (int i = 0; i < edades.length; i++) {
            for (int j = 0; j < edades[i].length; j++) {
                System.out.println("indice" + i + "-"+ j +"-" + edades[i][j]);
            }
        }
        
        //1.declara instanciar matriz de objetos de tipos personas (clase persona)
        Persona personas[][] = new  Persona[1][2];
        //2.inicializamos valores 
        personas[0][0] = new Persona("juan");
        personas[0][1] = new Persona("karla");
        //3.imprimir 
        System.out.println("matriz persona en el indice 0-0 " + personas[0][0]);
        System.out.println("matriz persona en el indice 0-0 " + personas[0][1]);
        
        //para controlar los renglones
        for (int renglon = 0; renglon < personas.length; renglon++) {
            //para controlar las columnas
            for (int columna = 0; columna < personas[renglon].length; columna++) {
                System.out.println("indice " + renglon + " - " + columna + " - " + personas[renglon][columna]);
                
            }
            
        }
    }
}
