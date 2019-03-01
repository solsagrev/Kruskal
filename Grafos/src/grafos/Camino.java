/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package grafos;

/**
 *
 * @author Marco
 */
public class Camino {
    
    int []visitado;
    char []origen;
    int []peso;
    int []iteracion;
    
    Camino(int num)
    {
        visitado = new int[num];
        origen = new char [num];
        peso = new int [num];
        iteracion = new int [num];
        for(int i=0; i<num; i++)
        {
            visitado[i]=0;
            peso[i]=Integer.MAX_VALUE;
            iteracion[i]=Integer.MAX_VALUE;
        }
    }

    protected void setVisitado(int pos, int valor)
    {
        this.visitado[pos]=valor;
    }
    
    protected void setOrigen(int pos, char valor)
    {
        this.origen[pos]=valor;
    }
    
    protected void setPeso(int pos, int valor)
    {
        this.peso[pos]=valor;
    }
    
    protected void setIteracion(int pos, int valor)
    {
        this.iteracion[pos]=valor;
    }
    
    protected int getVisitado(int pos)
    {
        return this.iteracion[pos];
    }
    
    protected char getOrigen(int pos)
    {
        return this.origen[pos];
    }
    
    protected int getPeso(int pos)
    {
        return this.peso[pos];
    }
    
    protected int getIteracion(int pos)
    {
        return this.iteracion[pos];
    }
}
