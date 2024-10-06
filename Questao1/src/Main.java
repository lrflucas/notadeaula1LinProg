import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Aluno a = new Aluno();

        System.out.print("Qual o nome do(a) aluno(a)? ");
        a.setNome(sc2.nextLine());

        System.out.print("Qual a primeira nota de " + a.getNome() + "? ");
        a.setNota1(sc.nextDouble());

        System.out.print("Qual a segunda nota? ");
        a.setNota2(sc.nextDouble());

        System.out.print("Qual a terceira nota? ");
        a.setNota3(sc.nextDouble());

        a.calcularMedia();

        a.resultado();

    }

}