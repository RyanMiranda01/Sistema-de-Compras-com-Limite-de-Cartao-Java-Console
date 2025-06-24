import java.util.Collections;
import java.util.List;

public class Produtos implements Comparable<Produtos>{
    private String nome;
    private double valorProduto;



    public double getValorProduto() {
        return valorProduto;
    }


    public String getNome() {
        return nome;
    }


    @Override
    public String toString() {
        return "Nome: " + this.getNome() + " - R$" + this.getValorProduto() + "";
    }

    public Produtos(double valorProduto, String nome) {
        this.valorProduto = valorProduto;
        this.nome = nome;
    }


    @Override
    public int compareTo(Produtos outroProduto) {
        return Double.compare(this.valorProduto,outroProduto.valorProduto);
    }

}
