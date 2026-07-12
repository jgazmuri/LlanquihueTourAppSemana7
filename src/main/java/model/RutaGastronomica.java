package model;

public class RutaGastronomica extends ServicioTuristico {

    private int numeroDeParadas;

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    public RutaGastronomica(String nombre, String duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras);
        this.numeroDeParadas = numeroDeParadas;

    }

        @Override
        public void mostrarResumen(){
        System.out.println("\n---Ruta Gastronomica---\n");
        System.out.println("El nombre del servicio es: " + nombre);
        System.out.println("El numero de paradas es: " + numeroDeParadas);
        System.out.println("El duracion horas es: " + getDuracionHoras());

    }

    private void gastro(){
        System.out.printf(nombre +" "+ duracionHoras + "estas son las rutas");
    }

    @Override
    public String toString() {
        return "RutaGastronomica{" +
                "numeroDeParadas=" + numeroDeParadas +
                ", nombre='" + nombre + '\'' +
                ", duracionHoras='" + duracionHoras + '\'' +
                '}';
    }
}
