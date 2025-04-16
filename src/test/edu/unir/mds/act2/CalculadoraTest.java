package edu.unir.mds.act2;

public class CalculadoraTest {
    
    private static final Calculadora CALC = new Calculadora();
    
    public static void main(String[] argsv) {
        pruebaSuma();
        pruebaResta();
        pruebaMultiplicacion();
        pruebaDivision();
        pruebaRaiz();
        pruebaExponente();
    }

    public static void pruebaSuma() {
        assert CALC.suma(0.0, 0.0) == 0.0 : "Prueba de suma fallida :(";
        System.out.println("Pruebas de suma finalizadas con exito :)");
    }

    public static void pruebaResta() {
        assert CALC.resta(0.0, 0.0) == 0.0;
        System.out.println("Pruebas de resta finalizadas con exito :)");
    }
    
    public static void pruebaMultiplicacion() {
        assert CALC.multiplicacion(0.0, 0.0) == 0.0;
        System.out.println("Pruebas de multiplicacion finalizadas con exito :)");
    }

    public static void pruebaDivision() {
        assert CALC.division(0.0, 1.0) == 0.0;
        System.out.println("Pruebas de division finalizadas con exito :)");
    }
    
    public static void pruebaRaiz() {
        assert CALC.raiz(0.0) == 0.0;
        System.out.println("Pruebas de raiz finalizadas con exito :)");
    }

    public static void pruebaExponente() {
        assert CALC.exponente(0.0) == 1.0 : "Prueba de exponente fallida";
        System.out.println("Pruebas de exponente finalizadas con exito :)");
    }

}
