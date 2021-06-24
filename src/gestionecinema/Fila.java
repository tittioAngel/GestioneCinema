
package gestionecinema;


public enum Fila {
    A,
    B,
    C,
    D,
    E,
    F,
    G,
    H,
    I,
    J;
    public Fila getNext(){
        Fila[] f= Fila.values();
        int i =0;
        for(;f[i]!=this;i++)
            ;
        i++;
        i%=f.length;
        return f[i];
    }
    
}
