package br.uem.din.Controller;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.FileNotFoundException;


/**
 *
 * @author Mateus
 */
public class Controller_ {

 
  public static void main(String[] args){
    Scanner ler = new Scanner(System.in);
 
    System.out.printf("\nConteúdo do arquivo texto:\n");
    try {
      FileReader arq = new FileReader("C:\\TabelaDeEspecies.txt");
      BufferedReader lerArq = new BufferedReader(arq);
 
      String linha = lerArq.readLine(); // lê a primeira linha
      // a variável "linha" recebe o valor "null" quando o processomde repetição atingir o final do arquivo texto

      while (linha != null) {
        System.out.printf("%s\n", linha);
 
        linha = lerArq.readLine(); // lê da segunda até a última linha
      }
 
      arq.close();
    } catch (IOException e) {
        System.err.printf("Erro na abertura do arquivo: %s.\n",
          e.getMessage());
    }
 
    System.out.println();

  }
   /* private static class lerArquivo {

        public lerArquivo() throws FileNotFoundException {
            Scanner scanner = new Scanner(new FileReader("C:\TabelaDeEspecies")).useDelimiter("\\ \\n");
            while (scanner.hasNext()) {
              int id = scanner.nextInt();  
              String nome = scanner.next();
              String baseHp = scanner.next();
              String baseAtk = scanner.next();
              String baseDef = scanner.next();
              String baseSpe = scanner.next();
              String baseSpd = scanner.next();
              String atributoCalculado = scanner.next();
              System.out.println(nome);
            }
        }
    }*/
    
}
