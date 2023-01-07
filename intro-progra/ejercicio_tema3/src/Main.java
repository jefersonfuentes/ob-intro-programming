public class Main {
    public static void main(String[] args) {
        // Primera parte

        // Función suma
        suma(20, 40, 60);

        // Segunda parte

        Coche miCoche = new Coche(); // Instancia del objeto Coche

        // Se invoca el metodo sumar puertas cuatro veces por ende
        // numeroDePuertas = 0 + 4
        miCoche.agregarPuertas();
        miCoche.agregarPuertas();
        miCoche.agregarPuertas();
        miCoche.agregarPuertas();
        System.out.println("El numero de puertas es: " + miCoche.numPuertas);

    }

    // Función suma, recibe 3 paramateros de tipo entero
    public static void suma(int a, int b, int c){
        //La función no retorna un valor por eso es void y crea su proceso internamente
        int resultado;
        resultado = a + b + c;
        System.out.println(resultado);
    }
}

    // Declaración de la clase coche
class Coche {
    // Variable numerica tipo int para guardar en memoria la cantidad de puertas del coche
    public int numPuertas = 0;

    // Método para incrementar las puertas
    public void agregarPuertas(){
        // La palabra reservada this permite invocar la variable dentro de la función
        this.numPuertas++;
    }
}