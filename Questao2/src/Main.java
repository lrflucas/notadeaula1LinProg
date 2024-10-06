import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        String repetir;
        String concluir;

        Scanner sc = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);
        Produto p = new Produto();

        System.out.print("Digite o código do produto: ");
        p.setCodigo(sc.nextInt());

        System.out.print("Diga o nome do produto: ");
        p.setNome(sc2.nextLine());

        System.out.print("Qual o peso dele? ");
        p.setPeso(sc.nextDouble());

        System.out.print("Qual a cor? ");
        p.setCor(sc2.nextLine());

        System.out.print("Digite o valor do produto: R$");
        p.setValor(sc.nextDouble());

        System.out.print("Digite a quantidade em estoque: ");
        p.setEstoque(sc.nextInt());

        System.out.println("\nProduto cadastrado: " + p.getNome() + " | Peso: " + p.getPeso() + "kg" + " | Cor: " + p.getCor() + " | Preço: R$" + p.getValor() + " | Estoque: " + p.getEstoque() + " | Código: " + p.getCodigo());


        System.out.print("Informe a quantidade a ser comprada: ");
        p.setQuantidade(sc.nextInt());


        do {
            System.out.println("\nSelecione o método de pagamento:");
            System.out.println("1 - Pix/Débito/Transferência (5% de desconto)");
            System.out.println("2 - Espécie (5% de desconto)");
            System.out.println("3 - Crédito (3x sem juros)");

            int pagamento = sc.nextInt();
            double precoFinal = p.getValor() * p.getQuantidade();

            switch (pagamento) {
                case 1:
                    precoFinal *= 0.95;
                    System.out.println("Com desconto de 5%, o valor final é R$" + precoFinal);
                    break;
                case 2:
                    precoFinal *= 0.95;
                    System.out.println("Com desconto de 5%, o valor final é R$" + precoFinal);
                    System.out.print("Informe o valor pago: ");
                    double valorPago = sc.nextDouble();
                    if (valorPago > precoFinal) {
                        System.out.println("Troco: R$" + (valorPago - precoFinal));
                    }
                    break;
                case 3:
                    System.out.printf("Com parcela em 3x sem juros, cada parcela é R$%.2f", (precoFinal / 3));
                    System.out.printf("\nO valor total é R$%.2f", precoFinal);
                    break;
                default:
                    System.out.println("Opção inválida.");
                    return;

            }
            System.out.println("\nPara selecionar outro método, digite R. Para concluir a venda, digite C");
            repetir = sc.next();
        }while (repetir.equalsIgnoreCase("R"));

        concluir = sc.next();

        if (concluir.equalsIgnoreCase("C")) {
            p.mostrarEstoque();
            p.vender();
        }
    }

}