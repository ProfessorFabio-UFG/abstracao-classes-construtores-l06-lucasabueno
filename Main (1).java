import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Criando diferentes objetos Produto via entrada do usuário
        System.out.print("Digite o código do produto: ");
        int codigo = scanner.nextInt();
        Produto p1 = new Produto(codigo);

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.next();
        System.out.print("Digite a quantidade: ");
        int quantidade = scanner.nextInt();
        System.out.print("Digite o tipo do produto: ");
        String tipo = scanner.next();
        System.out.print("Digite o valor do produto: ");
        double valor = scanner.nextDouble();
        p1.inserir(nome, quantidade, tipo, valor);

        System.out.print("Digite o código do segundo produto: ");
        int codigo2 = scanner.nextInt();
        System.out.print("Digite o nome do segundo produto: ");
        String nome2 = scanner.next();
        Produto p2 = new Produto(codigo2, nome2);

        System.out.print("Digite o código do terceiro produto: ");
        int codigo3 = scanner.nextInt();
        System.out.print("Digite o nome do terceiro produto: ");
        String nome3 = scanner.next();
        System.out.print("Digite a quantidade do terceiro produto: ");
        int quantidade3 = scanner.nextInt();
        Produto p3 = new Produto(codigo3, nome3, quantidade3);

        System.out.print("Digite o código do quarto produto: ");
        int codigo4 = scanner.nextInt();
        System.out.print("Digite o nome do quarto produto: ");
        String nome4 = scanner.next();
        System.out.print("Digite a quantidade do quarto produto: ");
        int quantidade4 = scanner.nextInt();
        System.out.print("Digite o tipo do quarto produto: ");
        String tipo4 = scanner.next();
        System.out.print("Digite o valor do quarto produto: ");
        double valor4 = scanner.nextDouble();
        Produto p4 = new Produto(codigo4, nome4, quantidade4, tipo4, valor4);

        // Testando métodos
        System.out.println("\nProdutos criados:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
        System.out.println(p4);

        System.out.print("Digite a quantidade para vender do primeiro produto: ");
        int qtdVenda = scanner.nextInt();
        p1.vender(qtdVenda);
        System.out.println(p1);

        System.out.print("Digite a quantidade para comprar do segundo produto: ");
        int qtdCompra = scanner.nextInt();
        System.out.print("Digite o novo valor do segundo produto: ");
        double novoValor = scanner.nextDouble();
        p2.comprar(qtdCompra, novoValor);
        System.out.println(p2);

        boolean saoIguais = p1.igual(p4);
        System.out.println("Os produtos p1 e p4 são iguais? " + saoIguais);

        scanner.close();
    }
}