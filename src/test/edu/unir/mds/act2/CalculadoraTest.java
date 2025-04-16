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
        assert CALC.suma(0.0, 0.0) == 0.0;
    }

    public static void pruebaResta() {
        assert CALC.resta(0.0, 0.0) == 0.0;
    }
    
    public static void pruebaMultiplicacion() {
        assert CALC.multiplicacion(0.0, 0.0) == 0.0;
    }

    public static void pruebaDivision() {
        assert CALC.division(0.0, 1.0) == 0.0;
    }
    
    public static void pruebaRaiz() {
        assert CALC.raiz(0.0) == 0.0;
    }

    public static void pruebaExponente() {
        assert CALC.exponente(0.0) == 1.0;
    }

}
