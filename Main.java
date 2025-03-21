import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Produto> produtos = new ArrayList<>();
        boolean sair = false;
        
        while (!sair) {

            int escolha = 0;

            
            System.out.println(
                            "1-Criar um produto\n"+
                            "2-Alterar dados de um produto\n"+
                            "3-Excluir um produto\n"+
                            "4-Listar todos os produtos\n"+
                            "5-Sair");

            
            escolha = entrada.nextInt();
            entrada.nextLine(); 
                    
            switch (escolha) {
                case 1: {
                    System.out.println("Insira o nome do produto: ");
                    String nome = entrada.nextLine();
                
                    System.out.println("Insira o código do produto: ");
                    int cod = entrada.nextInt();
                    entrada.nextLine(); 
                
                    System.out.println("Insira a quantidade de produtos fabricados: ");
                    int quant = entrada.nextInt();
                    entrada.nextLine(); 
                
                    System.out.println("Insira o preço do produto: ");
                    String preco = entrada.nextLine(); 
                
                    System.out.println("Insira a marca do produto: ");
                    String marca = entrada.nextLine();
                
                    produtos.add(new Produto(nome, cod, quant, preco, marca));
                }
                    break;
                

                case 2: {
                        System.out.println("Insira o código do produto que deseja alterar: ");
                        int codigoAlterar = entrada.nextInt();
                        entrada.nextLine(); 
                        
                        Produto produtoAlterar = null;
                        for (Produto produto : produtos) {
                            if (produto.getCod() == codigoAlterar) {
                                produtoAlterar = produto;
                                break;
                            }
                        }

                        if (produtoAlterar != null) {
                            System.out.println("Insira o novo nome do produto: ");
                            produtoAlterar.setNome(entrada.nextLine());

                            System.out.println("Insira a nova quantidade de produtos: ");
                            produtoAlterar.setQuant(entrada.nextInt());
                            entrada.nextLine(); 

                            System.out.println("Insira o novo preço do produto: ");
                            produtoAlterar.setPreco(entrada.nextLine());

                            System.out.println("Insira a nova marca do produto: ");
                            produtoAlterar.setMarca(entrada.nextLine());

                            System.out.println("Produto alterado com sucesso!");
                        } else { 
                            System.out.println("Produto não encontrado.");
                        }
                    }
                    break;
                

                case 3: {
                    System.out.println("Você deseja excluir qual produto? Insira o código dele: ");
                    int codigoExcluir = entrada.nextInt();
                    entrada.nextLine();

                    boolean removido = false;
                    for (int i = 0; i < produtos.size(); i++) {
                        if (produtos.get(i).getCod() == codigoExcluir) {
                            produtos.remove(i); 
                            System.out.println("Produto excluído com sucesso!");
                            removido = true;
                            break;
                        }
                    }
                    if (!removido) {
                        System.out.println("Código inválido ou produto não cadastrado");
                    }
                }
                    break;
                

                case 4: {
                    if (produtos.isEmpty()) {
                        System.out.println("Nenhum produto cadastrado.");
                    } else {
                        System.out.println("Lista de produtos cadastrados:");
                        for (Produto produto : produtos) {
                            System.out.println("-----------------------------------");
                            System.out.println("Código do produto: " + produto.getCod());
                            System.out.println("Nome do produto: " + produto.getNome());
                            System.out.println("Quantidade de produtos cadastrados: " + produto.getQuant());
                            System.out.println("Preço do produto: " + produto.getPreco());
                            System.out.println("Marca do produto: " + produto.getMarca());
                            System.out.println("-----------------------------------");
                        }
                        System.out.println("Esses são todos os produtos cadastrados!!");
                    }
                }
                    break;
               

                case 5: {
                    sair = true;
                    System.out.println("Saindo...");
                }
                    break;
                

                default: {
                    System.out.println("Insira uma opção válida!!!!!");
                }
                    break;
                
            }
        }
    }
}