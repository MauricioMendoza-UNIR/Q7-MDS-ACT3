package edu.unir.mds.act2;

public class CalculadoraTest {
    
    public static void main(String[] argsv) {
        pruebaSuma();
        pruebaResta();
        pruebaMultiplicacion();
        pruebaDivision();
        pruebaRaiz();
        pruebaExponente();
    }

    public static void pruebaSuma() {
        assert Calculadora.suma(0.0, 0.0) == 0.0;
        assert Calculadora.suma(1.0, 0.1) == 1.1;
        assert Calculadora.suma(2.0, 0.0001) == 2.0001;
//      assert Calculadora.suma(-3.0001, -4.001) == -7.0011;
//      Resultado: -7.001100000000001
        assert (Calculadora.suma(-3.0001, -4.001) - -7.0011) < Calculadora.precision;
        
        System.out.println("Pruebas de suma finalizadas con exito :)");
    }

    public static void pruebaResta() {
        assert Calculadora.resta(0.0, 0.0) == 0.0;
        assert Calculadora.resta(1.0, 1.0) == 0.0;
        assert Calculadora.resta(2.0, 0.0001) == 1.9999;
//        assert Calculadora.resta(3.0001, 4.01) == 0.0;
        // -1.0098999999999996
        assert (Calculadora.resta(3.0001, 4.01) - 1.0099) < Calculadora.precision;
        
        System.out.println("Pruebas de resta finalizadas con exito :)");
    }
    
    public static void pruebaMultiplicacion() {
        assert Calculadora.multiplicacion(0.0, 0.0) == 0.0;
        assert Calculadora.multiplicacion(0.0, 1.0) == 0.0;
        assert Calculadora.multiplicacion(2.2, 3.3) == 7.26;
        assert Calculadora.multiplicacion(4.01, 5.001) == 20.05401;
        
        System.out.println("Pruebas de multiplicacion finalizadas con exito :)");
    }

    public static void pruebaDivision() {
        assert Calculadora.division(0.0, 1.0) == 0.0;
        assert Calculadora.division(1.0, 1.0) == 1.0;
        assert Calculadora.division(2.2, 1.1) == 2.0;
//        assert Calculadora.division(3.3, 4.44) == 2.0;
        assert (Calculadora.division(3.3, 4.44) - 0.74324324) < Calculadora.precision;
        assert Calculadora.division(3.0, 0) == Double.POSITIVE_INFINITY;
        
        System.out.println("Pruebas de division finalizadas con exito :)");
    }
    
    public static void pruebaRaiz() {
        assert Calculadora.raiz(0.0) == 0.0;
//        assert Calculadora.raiz(1.0) == 1.0;
        assert (Calculadora.raiz(1.0) - 1.0) < Calculadora.precision;
        assert (Calculadora.raiz(2.0) - 1.4142) < Calculadora.precision;
//        assert Calculadora.raiz(-3.0) == Double.NaN;
        assert Double.isNaN(Calculadora.raiz(-3.0));
        
        System.out.println("Pruebas de raiz finalizadas con exito :)");
    }

    public static void pruebaExponente() {
        assert Calculadora.exponente(0.0) == 1.0;
        assert Calculadora.exponente(1.0) == Calculadora.e;
        assert (Calculadora.exponente(2.0) - 7.3890) < Calculadora.precision;
        
        System.out.println("Pruebas de exponente finalizadas con exito :)");
    }

}



