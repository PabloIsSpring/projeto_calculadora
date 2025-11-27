/**
 * <p><strong>Classe de Teste: TesteCalculadora</strong></p>
 *
 * <p>Esta classe contém o método <code>main</code> responsável por executar testes
 * simples utilizando a classe {@link Calculadora}. Ela demonstra o funcionamento
 * das operações básicas (soma, subtração, multiplicação e divisão) e também
 * testa o tratamento de exceções para divisão por zero e operador inválido.</p>
 *
 * <p>Este código serve como teste para:</p>
 * <ul>
 *     <li>Uso da classe Calculadora</li>
 *     <li>Tratamento de exceções com try/catch</li>
 *     <li>Validação de exceções</li>
 * </ul>
 * 
 * @author Pablo Emanuel de Melo Ferreira
 * @version 2.0
 */
public class TesteCalculadora {

    /**
     * <p>Método principal da aplicação. Executa chamadas para a classe
     * {@link Calculadora} utilizando diferentes operações matemáticas.</p>
     *
     * <p>Também demonstra o comportamento da aplicação em exceptions,
     * como tentativa de divisão por zero e uso de um operador inválido.</p>
     *
     * @param args argumentos da linha de comando (não utilizados)
     */
    public static void main(String[] args) {

        /** 
         * Cria uma instância da classe Calculadora
        */
        Calculadora calc = new Calculadora();

        /** 
         * Testa operações básicas sem tratamento de exceções passando os parâmetros:
         * 1º Parâmetro: Número inteiro 
         * 2º Parâmetro: Número inteiro
         * 3º Parâmetro: Variável String que recebe o tipo de operação matemática
        */
        System.out.println(calc.calcular(2, 3, "+"));
        System.out.println(calc.calcular(10, 4, "-"));
        System.out.println(calc.calcular(3, 5, "*"));
        System.out.println(calc.calcular(8, 2, "/"));

        /**
         * Testa operações que geram exceções
         */

        try {
            System.out.println(calc.calcular(8, 0, "/"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }

        try {
            System.out.println(calc.calcular(5, 5, "x"));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
