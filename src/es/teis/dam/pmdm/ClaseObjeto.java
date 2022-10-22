package es.teis.dam.pmdm;

public class ClaseObjeto{
    private int a;
    private int b;

    public ClaseObjeto(int a, int b) {
        this.a = a;
        this.b = b;
    }
    
    /*
     Método que llama al metodoInterfaz de la InterfazPruebas
     y que imprime por pantalla su resultado.
     */
    void metodoObjeto(InterfazPruebas iP){
        System.out.println(iP.metodoInterfaz(this.a, this.b));
    };
}
