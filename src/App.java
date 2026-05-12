public class App {
    public static void main(String[] args) throws Exception {
        Ejercicios ejercicios = new Ejercicios();
        System.out.println("----Ejercicio 1----");
        int rest1 = ejercicios. sumaConsecutivosPasos(5);
        System.out.println("Resultado final --> "+rest1);

    System.out.println("----------------------------------------");
        System.out.println("----Ejercicio 2----");
        int rest2 = ejercicios.getPotencia(2, 5);
        System.out.println("Resultado final --> "+rest2);
        System.out.println("----------------------------------------");
        System.out.println("----Ejercicio 3----");
        int rest3 = ejercicios.sumaDigitos(456);
        System.out.println("Resultado final --> "+rest3);
    }
}
