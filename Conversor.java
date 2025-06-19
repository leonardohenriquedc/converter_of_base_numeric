import java.util.List;
import java.util.ArrayList;

public class Conversor {
  public static void main(String[] args) {
    Integer valor = conversor(2, 11001011);

    System.out.println(valor);
  }

  public static Integer conversor(Integer base, Integer valor) {
    List<Integer> resultadoDasPotencias = new ArrayList<>();

    List<Integer> valoresBase = new ArrayList<>();

    String valorString = valor.toString();

    for (int num = 0; num < valorString.length(); num++) {

      Integer valorDeValorString = Integer.parseInt(String.valueOf(valorString.charAt(num)));

      System.out.println("Digito de valorString " + valorDeValorString);

      valoresBase.add(Integer.valueOf(String.valueOf(valorString.charAt(num))));
    }

    System.out.println(valorString);

    if (base == 2) {

      Integer expoente = 0;

      Integer valorFinal = 0;

      for (int num = valoresBase.size() - 1; num >= 0; num--) {
        Integer valorr = valoresBase.get(num);

        System.out.println("Valor do valoresBase: " + valorr);

        resultadoDasPotencias.add(valorr * pontenciador(base, expoente));

        System.out.println("Resultado das pontencias: " + resultadoDasPotencias.toString());

        expoente++;
      }

      // for (int num = 0; num < resultadoDasPotencias.size(); num++) {
      // valorFinal += resultadoDasPotencias.get(num) * valoresBase.get(num);
      // }

      for (Integer resultP : resultadoDasPotencias) {
        valorFinal += resultP;
      }

      return valorFinal;
    }

    return 0;

  }

  public static Integer pontenciador(Integer base, Integer expoente) {

    Integer valorFinal = 1;

    if (expoente == 0) {
      System.out.println("expoente dentro do loop do pontenciador: " + expoente + " Valor da base: " + base);

      return 1;
    }

    if (expoente == 1) {
      System.out.println("expoente dentro do loop do pontenciador: " + expoente + " Valor da base: " + base);

      return base;
    }

    if (base == 0) {
      System.out.println("expoente dentro do loop do pontenciador: " + expoente + " Valor da base: " + base);

      return 0;
    }

    if (base == 1) {
      System.out.println("expoente dentro do loop do pontenciador: " + expoente + " Valor da base: " + base);

      return 1;
    }

    // O loop esta fazendo a mesma conta varias vezes isto provelmente e um erro;
    for (int num = 1; num <= expoente; num++) {
      System.out.println("Valor do num: " + num);
      System.out.println("expoente dentro do loop do pontenciador: " + expoente);

      valorFinal = valorFinal * base;

      System.out.println("valorFinal atual do num " + num + ": " + valorFinal);
    }

    System.out.println("Valor final: " + valorFinal);

    return valorFinal;
  }
}
