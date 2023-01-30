package org.estudos;

import java.util.Scanner;

public class ContaTerminal {
  public static void main(String[] args) {
    int numero; 
    String agencia;
    String nomeCliente;
    Double saldo;
    Scanner scanner = new Scanner(System.in);
    
    System.out.println("Por favor, digite o número da conta:");
    numero = scanner.nextInt();
    
    System.out.println("Por favor, digite o número da agência:");
    agencia = scanner.next();
    //Concatena o separador do dígito verificador da agencia
    agencia = agencia.substring(0, agencia.length()-1).concat("-").concat(agencia.substring(agencia.length()-1, agencia.length()));
    
    System.out.println("Por favor, digite o nome do cliente:");
    nomeCliente = scanner.next();
    
    System.out.println("Por favor, digite o valor do saldo:");
    saldo = scanner.nextDouble();
    
    System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");

    scanner.close();
  }

}
