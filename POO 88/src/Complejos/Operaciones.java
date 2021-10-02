package Complejos;

public class Operaciones {

    private double real;
    private double imaginario;
    private double x;

    public Operaciones() {

    }

    public Operaciones(Double real, Double imaginario) {
        this.real = real;
        this.imaginario = imaginario;
    }

    public double getReal() {
        return real;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public double getImaginario() {
        return imaginario;
    }

    public void setImaginario(double imaginario) {
        this.imaginario = imaginario;
    }

    public Operaciones Suma(Operaciones otroComplejo) {

        Operaciones calculadora = new Operaciones();

        double nuevoReal = this.real + otroComplejo.getReal();
        double nuevoImaginario = this.imaginario + otroComplejo.getImaginario();

        calculadora.setReal(nuevoReal);
        calculadora.setImaginario(nuevoImaginario);

        return calculadora;

    }

    public Operaciones Resta(Operaciones otroComplejo) {

        Operaciones calculadora = new Operaciones();

        double nuevoReal = this.real - otroComplejo.getReal();
        double nuevoImaginario = this.imaginario - otroComplejo.getImaginario();

        calculadora.setReal(nuevoReal);
        calculadora.setImaginario(nuevoImaginario);

        return calculadora;

    }

    public Operaciones Multiplicacion(Operaciones otroComplejo) {

        Operaciones calculadora = new Operaciones();

        double nuevoReal = this.real * otroComplejo.getReal() - this.getImaginario()* otroComplejo.getImaginario();
        double nuevoImaginario = this.real * otroComplejo.getImaginario() + this.imaginario * otroComplejo.getReal();

        calculadora.setReal(nuevoReal);
        calculadora.setImaginario(nuevoImaginario);

        return calculadora;

    }

    public Operaciones Division(Operaciones otroComplejo) {

        Operaciones calculadora = new Operaciones();

        double nuevoReal = (this.real * otroComplejo.getReal() + this.imaginario * otroComplejo.getImaginario()) / (otroComplejo.getReal() * otroComplejo.getReal() + otroComplejo.getImaginario() * otroComplejo.getImaginario());
        double nuevoImaginario = (this.imaginario * otroComplejo.getReal() - this.real * otroComplejo.getImaginario()) / (otroComplejo.getReal() * otroComplejo.getReal() + otroComplejo.getImaginario() * otroComplejo.getImaginario());

        calculadora.setReal(nuevoReal);
        calculadora.setImaginario(nuevoImaginario);

        return calculadora;

    }

    public double Norma() {

        x = (Math.sqrt(real * real + imaginario * imaginario));
        
        return x;

    }

    public Operaciones Conjugado() {

        Operaciones calculadora = new Operaciones();
        
        double nuevoReal = this.real;
        double nuevoImaginario = this.imaginario * -1;
        
        calculadora.setReal(nuevoReal);
        calculadora.setImaginario(nuevoImaginario);
        
        return calculadora;

    }

    public String toString() {
        return String.format("(%.2f, %.2fi)", real, imaginario);
    }
}
