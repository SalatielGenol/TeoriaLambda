package es.teis.dam.pmdm;

public class Main {
    public static void main(String[] args) {
        // Instancia de objeto tipo ClaseObjeto
        ClaseObjeto test = new ClaseObjeto(4, 10);
        
        /*
        Almacenamiento de un comportamiento
        en una variable tipo InterfazPruebas
        */
        InterfazPruebas nomInt = (n1, n2) -> (n1 - n2);
        
        /*
        Llamada al metodoObjeto del objeto instanciado test
        pasándole como argumento el comportamiento almacenado
        en la variable anterior
        */
        test.metodoObjeto(nomInt);
        
        /*
        Llamada al metodoObjeto del objeto instanciado test,
        pasándole un comportamiento mediante una lambda
        */
        test.metodoObjeto((n1, n2) -> (n1 + n2));
        
        /*
        Aquí no se usa el objeto instanciado, sino que se utiliza una
        clase anónima a la que se le pasa como argumento una lambda
        */
        new ClaseObjeto(5,5).metodoObjeto((num1, num2) -> (num1 * num2));
    }
}
