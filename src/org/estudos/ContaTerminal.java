package org.estudos;

import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    int numero; 
    String agencia;
    String nomeCliente;
    Double saldo;
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Por favor, digite o n�mero da conta:");
    numero = scanner.nextInt();
    
    System.out.println("Por favor, digite o n�mero da ag�ncia:");
    agencia = scanner.next();
    //Concatena o separador do d�gito verificador da agencia
    agencia = agencia.substring(0, agencia.length()-1).concat("-").concat(agencia.substring(agencia.length()-1, agencia.length()));
    
    System.out.println("Por favor, digite o nome do cliente:");
    nomeCliente = scanner.next();
    
    System.out.println("Por favor, digite o valor do saldo:");
    saldo = scanner.nextDouble();
    
    System.out.println("Ol� " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua ag�ncia � " + agencia + ", conta " + numero + " e seu saldo " + saldo + " j� est� dispon�vel para saque.");

    scanner.close();
  }

}
