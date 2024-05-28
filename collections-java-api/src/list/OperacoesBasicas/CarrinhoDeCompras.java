package list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private final List<Item> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }
    // Como cada Iten possui uma quantidade, ao adicionar é necessario verificar os itens existentes e caso ja haja um
    // item igual ao que está sendo adicionado é necessario aumentar a quantidade deste item de acordo com a quantidade
    // que está sendo adicionada ao carrinho.
    public void adicionarIten(String nome, double preco, int quantidade){
        Item novoItem = new Item(nome, preco, quantidade);

        if(carrinho.size() == 0){
            carrinho.add(novoItem);
        }else{
            for(Item I : carrinho){
                if (I.getNome() == novoItem.getNome()){
                    I.setQuantidade(I.getQuantidade() + novoItem.getQuantidade());
                    break;
                }
                else{
                    carrinho.add(novoItem);
                    break;
                }
            }
        }

    }

    public void obterNomes(){
        System.out.println(carrinho);
    }
    //Enunciado informa remove um iten do carrinho com base no nome.
    //Desta forma estou assumindo que devido o metodo estar especificado com apenas o nome como parametro.
    //Devo ignorar as quantidades e remover o iten por completo da lista
    public void removerIten(String nome){
        for(Item I : carrinho){
            if(I.getNome() == nome){
                carrinho.remove(I);
                break;
            }
        }
    }

    public double calcularValorTotal(){
        double valor=0;

        for(Item I : carrinho){
            valor = valor + (I.getPreco() * I.getQuantidade());
        }
        return valor;
    }

    public void exibirItens(){
        for(Item I : carrinho){
            System.out.println(I.getNome() + "  " + I.getPreco() + "    " + I.getQuantidade());
            }
    }


    public static void main(String[] args) {
        CarrinhoDeCompras car = new CarrinhoDeCompras();

        car.adicionarIten("batata", 1.50, 6 );
        car.adicionarIten("tomate", 1.50, 4 );
        car.adicionarIten("cebola", 1.50, 7 );
        car.adicionarIten("alface", 1.50, 3 );

        car.obterNomes();
        System.out.println(car.calcularValorTotal());
        car.exibirItens();


    }
}
