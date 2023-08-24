package arraybasico;

import persona.Persona;
import vehiculo.Vehiculo;

public class Array {

    private final String [] diasDeSemana; //Declarar mi arreglo
    protected static final int [] numeros = {1,2,3,4,5,6,7,8,9,10};
    public final Persona [] personas;
    static final Object [] elementos1 = {new Persona("juan", 12),
            new Vehiculo("Carro","Gasolina"),
            "hola mundo", 12,
            true, false, 's',20.1};

    private  final Object [] elementos;

    private  final int [][] matriz = new int[4][4];
    private static final  int [][] matriz2 = {
            {4, 1, 1 ,1, 0},
            {3, 1, 1 ,1, 1},
            {4, 1, 1 ,1, 2},
            {5, 1, 1 ,1, 4},
            {6, 1, 1 ,1, 5},
            {2, 1, 1 ,1, 6},
            {8, 1, 1 ,1, 7},
            {9, 1, 1 ,1, 8},
    };

    private int contador;

    public Array(int sizeArray){
        this.contador = 0;
        this.diasDeSemana = new String[sizeArray];
        this.personas = new Persona[sizeArray];
        this.elementos = new Object[sizeArray];
    }

    public void addDia(String dia){
        if(contador < diasDeSemana.length){
            diasDeSemana[contador] = dia;
            contador ++;
        }
    }

    public String[] getDiasDeSemana() {
        return diasDeSemana;
    }

    public void addPersona(Persona persona){
        if (contador < personas.length){
            personas[contador] = persona;
            contador++;
        }
    }

    public Persona[] getPersonas() {
        return personas;
    }


    public void addElemento(Object object){
        if (contador < elementos.length){
            elementos[contador] = object;
            contador++;
        }
    }

    public Object[] getElementos() {
        return elementos;
    }

    public static void iterar(){
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Número en la posición: " + i +" "+ numeros[i]);
        }
    }

    public static void iterarElemento(){
        for (int i = 0; i < elementos1.length; i++) {
            System.out.println("Elemento en la posición: " + i +" "+ elementos1[i]);
        }
    }

    public static void iterarMatriz(){
        for (int i = 0; i < matriz2.length; i++) {
            for (int j = 0; j < matriz2[0].length ; j++) {
                System.out.println("Elemento en posición: "+i+" " +j+" = "+matriz2[i][j]);
            }
        }
    }

}




