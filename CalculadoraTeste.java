import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculadoraTeste {
    
    // ========== TESTES DE ADIÇÃO ==========
    
    @Test
    public void testSomarDoisPositivos() {
        double resultado = Calculadora.somar(10, 5);
        assertEquals(15, resultado, 0.001);
    }
    
    @Test
    public void testSomarDoisNegativos() {
        double resultado = Calculadora.somar(-10, -5);
        assertEquals(-15, resultado, 0.001);
    }
    
    @Test
    public void testSomarPositivoComNegativo() {
        double resultado = Calculadora.somar(10, -5);
        assertEquals(5, resultado, 0.001);
    }
    
    @Test
    public void testSomarComZero() {
        double resultado = Calculadora.somar(10, 0);
        assertEquals(10, resultado, 0.001);
    }
    
    @Test
    public void testSomarDoisZeros() {
        double resultado = Calculadora.somar(0, 0);
        assertEquals(0, resultado, 0.001);
    }
    
    // ========== TESTES DE SUBTRAÇÃO ==========
    
    @Test
    public void testSubtrairDoisPositivos() {
        double resultado = Calculadora.subtrair(10, 5);
        assertEquals(5, resultado, 0.001);
    }
    
    @Test
    public void testSubtrairDoisNegativos() {
        double resultado = Calculadora.subtrair(-10, -5);
        assertEquals(-5, resultado, 0.001);
    }
    
    @Test
    public void testSubtrairPositivoComNegativo() {
        double resultado = Calculadora.subtrair(10, -5);
        assertEquals(15, resultado, 0.001);
    }
    
    @Test
    public void testSubtrairComZero() {
        double resultado = Calculadora.subtrair(10, 0);
        assertEquals(10, resultado, 0.001);
    }
    
    @Test
    public void testSubtrairZeroMenosPositivo() {
        double resultado = Calculadora.subtrair(0, 10);
        assertEquals(-10, resultado, 0.001);
    }
    
    // ========== TESTES DE MULTIPLICAÇÃO ==========
    
    @Test
    public void testMultiplicarDoisPositivos() {
        double resultado = Calculadora.multiplicar(10, 5);
        assertEquals(50, resultado, 0.001);
    }
    
    @Test
    public void testMultiplicarDoisNegativos() {
        double resultado = Calculadora.multiplicar(-10, -5);
        assertEquals(50, resultado, 0.001);
    }
    
    @Test
    public void testMultiplicarPositivoComNegativo() {
        double resultado = Calculadora.multiplicar(10, -5);
        assertEquals(-50, resultado, 0.001);
    }
    
    @Test
    public void testMultiplicarComZero() {
        double resultado = Calculadora.multiplicar(10, 0);
        assertEquals(0, resultado, 0.001);
    }
    
    @Test
    public void testMultiplicarDoisZeros() {
        double resultado = Calculadora.multiplicar(0, 0);
        assertEquals(0, resultado, 0.001);
    }
    
    // ========== TESTES DE DIVISÃO ==========
    
    @Test
    public void testDividirDoisPositivos() {
        double resultado = Calculadora.dividir(10, 5);
        assertEquals(2, resultado, 0.001);
    }
    
    @Test
    public void testDividirDoisNegativos() {
        double resultado = Calculadora.dividir(-10, -5);
        assertEquals(2, resultado, 0.001);
    }
    
    @Test
    public void testDividirPositivoComNegativo() {
        double resultado = Calculadora.dividir(10, -5);
        assertEquals(-2, resultado, 0.001);
    }
    
    @Test
    public void testDividirZeroComNumero() {
        double resultado = Calculadora.dividir(0, 5);
        assertEquals(0, resultado, 0.001);
    }
    
    @Test
    public void testDividirComResultadoFracionario() {
        double resultado = Calculadora.dividir(10, 3);
        assertEquals(3.333, resultado, 0.01);
    }
    
    @Test
    public void testDividirPorZero() {
        assertThrows(ArithmeticException.class, () -> Calculadora.dividir(10, 0));
    }
    
    @Test
    public void testDividirZeroPorZero() {
        assertThrows(ArithmeticException.class, () -> Calculadora.dividir(0, 0));
    }
    
    @Test
    public void testDividirNegativoPorZero() {
        assertThrows(ArithmeticException.class, () -> Calculadora.dividir(-10, 0));
    }
}
