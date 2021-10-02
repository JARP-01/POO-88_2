package Reloj;

import java.util.Observable;
import java.util.logging.Level;
import java.util.logging.Logger;
 
public class Funcionamiento extends Observable implements Runnable {
 
    private int horas;
    private int minutos;
    private int segundos;
 
    public Funcionamiento(int horas, int minutos, int segundos) {
        this.horas = horas;
        this.minutos = minutos;
        this.segundos = segundos;
 
    }
    
    public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	public int getMinutos() {
		return minutos;
	}

	public void setMinutos(int minutos) {
		this.minutos = minutos;
	}

	public int getSegundos() {
		return segundos;
	}

	public void setSegundos(int segundos) {
		this.segundos = segundos;
	}
 
    @Override
    public void run() {
 
        String tiempo;
        try {
            while (true) {
 
                tiempo = "";
 
                if (horas < 10) {
                    tiempo += "0" + horas;
                } else {
                    tiempo += horas;
                }
 
                tiempo += ":";
 
                if (minutos < 10) {
                    tiempo += "0" + minutos;
                } else {
                    tiempo += minutos;
                }
 
                tiempo += ":";
 
                if (segundos < 10) {
                    tiempo += "0" + segundos;
                } else {
                    tiempo += segundos;
                }
 
                this.setChanged();
                this.notifyObservers(tiempo);
                this.clearChanged();
                Thread.sleep(1000);
 
                segundos++;
 
                if (segundos == 60) {
                    minutos++;
                    segundos = 0;
                    if (minutos == 60) {
                        minutos = 0;
                        horas++;
                        if (horas == 24) {
                            horas = 0;
                        }
                    }
                }
 
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(Funcionamiento.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
 
}
