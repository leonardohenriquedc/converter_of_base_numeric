import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;

// A um bug em binarios que começam com 0
public class Conversor {
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);

    System.out.println("Informe a base do numero que deseja converter: ");
    Integer base = scan.nextInt();

    scan.nextLine();

    System.out.println("Informe o valor que deseja converter: ");
    String valor = scan.nextLine();

    Integer valorConvertido = conversor(base, valor);

    System.out.println(valorConvertido);
  }

  public static Integer conversor(Integer base, String valor) {
    List<Integer> resultadoDasPotencias = new ArrayList<>();

    List<Integer> valoresBase = new ArrayList<>();

    for (int num = 0; num < valor.length(); num++) {

      Integer valorDeValorString = Integer.parseInt(String.valueOf(valor.charAt(num)));

      valoresBase.add(valorDeValorString);
    }

    System.out.println(valor);

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
