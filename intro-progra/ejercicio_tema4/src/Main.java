public class Main {
    public static void main(String[] args) {
        // Práctica estructuras de control

        // If
        int numeroIf = 7;
        if (numeroIf > 0){
            System.out.println("El número " + numeroIf + " es positivo");
            System.out.println("");
        } else if (numeroIf < 0) {
            System.out.printf("El número " + numeroIf + " es negativo");
            System.out.println("");
        } else {
            System.out.printf("El número es " + numeroIf);
            System.out.println("");
        }

        // While
        int numeroWhile = 0;
        while(numeroWhile < 3){
            System.out.println("La variable numeroWhile ahora vale: " + numeroWhile);
            numeroWhile++;

        }

        System.out.println("");

        // Do while
        int numeroDoWhile = 3;
        do{
            numeroDoWhile++;
            System.out.println("La variable numeroDoWhile ahora vale: " + numeroDoWhile);
        }while(numeroDoWhile < 3); // Al no cumplirse la condición, solo entra en el bucle una vez

        System.out.println("");

        // For
        for (int numeroFor = 0; numeroFor <= 3; numeroFor++){
            System.out.println(numeroFor);
        }

        System.out.println("");

        // Switch

        var Estacion = "Invierno";

        switch (Estacion){
            case "Verano":
                System.out.println("Es verano");
                break;
            case "Primavera":
                System.out.println("Es primavera");
                break;
            case "Otoño":
                System.out.println("Es otoño");
                break;
            case "Invierno":
                System.out.println("Es invierno");
                break;
            default:
                System.out.println("El valor de la variable no es una estación");
        }
    }
}