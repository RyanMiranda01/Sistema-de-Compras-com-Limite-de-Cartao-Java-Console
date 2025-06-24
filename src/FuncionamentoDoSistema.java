import java.util.*;

public class FuncionamentoDoSistema{
    private int opcao = 1;
    private double limiteDoCartao;

    private void mostrarCompras(List<Produtos> produtos){
        System.out.println("************************");
        System.out.println("COMPRAS REALIZADAS: ");
        System.out.println();
        Collections.sort(produtos);
        for (Produtos items : produtos) {
            System.out.println(items);
        }
        System.out.println();
        System.out.println("************************");
    }

    void funcionalidade() {
        String descricao;
        double valor;
        List<Produtos> produtos = new ArrayList<>();
        Scanner digitar = new Scanner(System.in);


        System.out.println("Digite o limite do cartão: ");
        limiteDoCartao = digitar.nextDouble();

        while (opcao == 1 || opcao == 2) {
            System.out.println("Digite a descrição do produto: ");
            descricao = digitar.next();
            System.out.println("Digite o valor da compra: ");
            valor = digitar.nextDouble();

            Produtos produto = new Produtos(valor, descricao);


            if (limiteDoCartao > produto.getValorProduto()) {
                System.out.println("Compra realizada!!");
                limiteDoCartao -= produto.getValorProduto();
                produtos.add(produto);

            } else if (limiteDoCartao < produto.getValorProduto()) {
                System.out.println("Não tem limite!!");
                mostrarCompras(produtos);
                System.out.println("Saldo do cartão: " + (limiteDoCartao));
                break;
            }

            System.out.println();
            System.out.println("0 - Caso queira sair 0");
            System.out.println("1 - Caso queira continuar comprando ");
            System.out.println("2 - Caso queira ver a o carrinho de compras ");

            opcao = digitar.nextInt();



            if (opcao == 0) {
                mostrarCompras(produtos);
                System.out.println("Saldo do cartão: " + (limiteDoCartao));
                System.out.println();

            }else if(opcao == 2) {
                /*System.out.println("SEU CARRINHO ATUAL: ");
                System.out.println();
                System.out.println("************************");
                System.out.println("COMPRAS REALIZADAS: ");
                System.out.println();
                Collections.sort(produtos);
                // produtos.sort(Comparator.comparing(Produtos ::getValorProduto));
                for (Produtos items : produtos) {
                    System.out.println(items);
                }
                System.out.println();
                System.out.println("************************");*/
                mostrarCompras(produtos);
                System.out.println("Saldo do cartão: " + (limiteDoCartao));
                System.out.println();
                System.out.println("Qual o próximo produto para a lista: ");
                System.out.println();
            }


        }
    }


}
