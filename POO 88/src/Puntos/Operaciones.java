package Puntos;

public class Operaciones {

    private double x;
    private double y;
    private double z;
    private double distancia;

    public Operaciones() {

    }

    public Operaciones(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double DistanciaPuntos(Operaciones otroPunto){
        
        distancia = Math.sqrt( Math.pow(otroPunto.getX() - this.x,2) + Math.pow(otroPunto.getY() - this.y,2) + Math.pow(otroPunto.getZ() - this.z,2));
        
        return distancia;
    }
}
