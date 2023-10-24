package examen;

import java.util.Iterator;

public class ArregloTipoCambio {

	/**
  	 .----.----.----.----.----.----.----.----.----.----.
 ==> |    |    |    |    |    |    |    |    |    |    |   
	 '----'----'----'----'----'----'----'----'----'----'
	   0    1    2    3    4    5    6    7    8    9
    indice
    */
	
    private double cambios[];
    private int indice;
   

    public ArregloTipoCambio() {
        cambios = new double[10];
        indice = 0;
    }

    public int tamaño() {
        return indice;
    }

    public double obtener(int p) {
        return cambios[p];
    }

    public void adicionar(double s) {
        if (indice == tamaño())
            ampliarArreglo();
        cambios[indice] = s;
        indice++;
    }

    private void ampliarArreglo() {
        double aux[] = cambios;
        cambios = new double[indice + 10];
        for (int i = 0; i < indice; i++)
            cambios[i] = aux[i];
    }
    
    public void eliminarTodo() {
        indice = 0;
    }

    public void eliminarFinal() {
        indice--;
    }
    
    public int posicionUltimoCambioMayorQue40() {
    	indice = -1;
    	for (int i = 0; i < cambios.length; i++) {
			if(cambios[i] > 4.0) {
				indice = i;
			}
		}
    	return indice;
    }
    public double promedioTipoDeCambio() {
    	double suma = 0;
    	for (double d : cambios) {
			suma += cambios;
		}
    	return suma / cambios.length;
    }
    public boolean reemplazarUltimoCambioMayorQue40() {
    	int reemplazo = posicionUltimoCambioMayorQue40();
    	if( reemplazo != -1) {
    		double promedio = promedioTipoDeCambio();
    		cambios[reemplazo] = promedio;
    		return true;
    	}
    	else {
    		return false;
    	}
    }
	
}
