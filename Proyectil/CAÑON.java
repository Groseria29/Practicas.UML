public class OrganizadorDePaseo {

    // Atributos privados de la clase
    private int sillasPorBus;
    private int estudiantesGordos;
    private int estudiantesFlacos;

    // Constructor para inicializar los valores
    public OrganizadorDePaseo(int sillasPorBus, int estudiantesGordos, int estudiantesFlacos) {
        this.sillasPorBus = sillasPorBus;
        this.estudiantesGordos = estudiantesGordos;
        this.estudiantesFlacos = estudiantesFlacos;
    }

    // Método para calcular el número de buses necesarios
    public int calcularNumeroDeBuses() {
        // Calcular el número total de sillas necesarias
        int sillasNecesarias = (estudiantesGordos * 2) + estudiantesFlacos;

        // Calcular el número de buses necesarios
        int busesNecesarios = (int) Math.ceil((double) sillasNecesarias / sillasPorBus);

        return busesNecesarios;
    }

    // Programa principal para usar la clase OrganizadorDePaseo
    public static void main(String[] args) {
        // Crear un objeto de la clase OrganizadorDePaseo
        OrganizadorDePaseo organizador = new OrganizadorDePaseo(50, 20, 30);

        // Calcular y mostrar el número de buses necesarios
        int busesNecesarios = organizador.calcularNumeroDeBuses();
        System.out.println("El número de buses necesarios es: " + busesNecesarios);
    }
}
