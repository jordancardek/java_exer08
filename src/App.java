import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {  
        Scanner scan = new Scanner(System.in);

        System.out.println("Quanto você ganha por hora?");
        double valor = scan.nextDouble();

        System.out.println("Quantas horas você trabalha no mês?");
        double horas = scan.nextDouble();

        scan.close();

        double salario = valor*horas;

        System.out.println("O seu salário do mês é: "+salario);
    }
}