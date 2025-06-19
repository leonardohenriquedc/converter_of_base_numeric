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

      valoresBase.add(valorDeValorString);
    }

    System.out.println(valorString);

    if (base == 2) {

      Integer expoente = 0;

      Integer valorFinal = 0;

      for (int num = valoresBase.size() - 1; num >= 0; num--) {
        Integer valorr = valoresBase.get(num);

        resultadoDasPotencias.add(valorr * pontenciador(base, expoente));

        expoente++;
      }

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

      return 1;
    }

    if (expoente == 1) {

      return base;
    }

    if (base == 0) {

      return 0;
    }

    if (base == 1) {

      return 1;
    }

    // O loop esta fazendo a mesma conta varias vezes isto provelmente e um erro;
    for (int num = 1; num <= expoente; num++) {

      valorFinal = valorFinal * base;

    }

    return valorFinal;
  }
}
