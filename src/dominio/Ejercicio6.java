package dominio;

public class Ejercicio6 {
    public static int suma(int[] lista, int n) {
        if (n == 0)
            return lista[0];
        else
            return lista[n] + suma(lista, n - 1);
    }

    public static int alcuadrado(int[] lista, int n) {
        if (n == 0)
            return lista[0] * lista[0];
        else
            return lista[n] * lista[n] + alcuadrado(lista, n - 1);
    }

    public static double desviaciontipica(int[] lista) {
        double alcuadrado = alcuadrado(lista, lista.length - 1);
        double media = suma(lista, lista.length - 1) / lista.length;
        double varianza = (alcuadrado / lista.length) - media * media;
        double desviaciontipica = Math.sqrt(varianza);
        return desviaciontipica;
    }
}
