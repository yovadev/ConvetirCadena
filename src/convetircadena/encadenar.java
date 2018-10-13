package convetircadena;

public class encadenar {
    
    private int dia, mes, anio;
    
    public encadenar(int d, int m, int a){
    dia = d;
    mes = m;
    anio = a;
    System.out.printf("el constructor es: %s\n", this);
    }
    
    public String toString(){
    return String.format("%d/%d/%d", mes, dia, anio);
    }
    
}
