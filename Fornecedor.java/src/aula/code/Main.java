package aula.code;



public class Main {

    public static void main(String[] args) {
        Fornecedor fornecedor = new Fornecedor();

        fornecedor.CNPJ = "1234321";
        fornecedor.telefone = "4002-8922";
        fornecedor.nome = "Joao e Maria";

        System.out.println("Numero do CNPJ" + "  " + fornecedor.CNPJ);
        System.out.println("Numero de telefone" + "  " + fornecedor.telefone);
        System.out.println("Nome do fornecedor" + "  " + fornecedor.nome);

        Produto produto = new Produto();

        produto.codigo = 1;
        produto.nome = "TV";
        produto.valor = 3500.00f;
        produto.AcrescimoValor = produto.valor * 10/100 + produto.valor;

        System.out.println("Numero do codigo" + "  " + produto.codigo);
        System.out.println("Nome do produto" + "  " + produto.nome);
        System.out.println("Valor do produto" + "  " + produto.valor );
        System.out.println("Valor final" + "  " + produto.AcrescimoValor );

        Fornecedor fornecedor2 = new Fornecedor();

        fornecedor2.CNPJ = "54321345";
        fornecedor2.telefone = "4002-8933";
        fornecedor2.nome = "Marcia";

        System.out.println("Numero do CNPJ2" + "  " + fornecedor2.CNPJ);
        System.out.println("Numero de telefone2" + "  " + fornecedor2.telefone);
        System.out.println("Nome do fornecedor2" + "  " + fornecedor2.nome);

        Produto produto2 = new Produto();

        produto2.codigo = 2;
        produto2.nome = "Computador";
        produto2.valor = 3500.000f;
        produto2.AcrescimoValor = produto2.valor * 10/100 + produto2.valor;

        Produto produto3 = new Produto();

        produto3.codigo = 3;
        produto3.nome = "impressora";
        produto3.valor = 235.0f;
        produto3.AcrescimoValor = produto3.valor * 10/100 + produto3.valor;



        System.out.println("Numero do codigo" + "  " + produto2.codigo);
        System.out.println("Nome do produto" + "  " + produto2.nome);
        System.out.println("Valor do produto" + "  " + produto2.valor);
        System.out.println("Valor final" + "  " + produto2.AcrescimoValor );

        System.out.println("Numero do codigo" + "  " + produto3.codigo);
        System.out.println("Nome do produto" + "  " + produto3.nome);
        System.out.println("Valor do produto" + "  " + produto3.valor );
        System.out.println("Valor final" + "  " + produto3.AcrescimoValor );




    }

}
