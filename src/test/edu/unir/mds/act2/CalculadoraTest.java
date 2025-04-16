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
        
    }
    
    public static void pruebaMultiplicacion() {
        
    }

    public static void pruebaDivision() {
        
    }
    
    public static void pruebaRaiz() {
        
    }

    public static void pruebaExponente() {
        
    }

}
