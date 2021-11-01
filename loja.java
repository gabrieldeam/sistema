import java.util.Scanner;

class loja {

    static void menu() {

        System.out.println("Sistema Comercial de Controle de Pedidos e Funcionarios");
        System.out.println("           ================================");
        System.out.println("           |   1 - Cadatrar Pedido        |");
        System.out.println("           |   2 - Buscar Pedido          |");
        System.out.println("           |   3 - Remover Pedido         |");
        System.out.println("           |   4 - Cadatrar Funcionario   |");
        System.out.println("           |   5 - Buscar Funcionario     |");
        System.out.println("           |   6 - Remover Funcionario    |");
        System.out.println("           |   0 - Sair                   |");
        System.out.println("           ================================");

        Scanner myObjeto = new Scanner(System.in);
        int menu;

        System.out.println("Opção ->");
        menu = myObjeto.nextInt();

        switch (menu) {
        case 1:
            int pedidoID;
            float valorTotalCalculado;
            // int dia, mes, ano; - Para pedir a data de criação.

            pedido infoPedido = new pedido();

            Scanner pC = new Scanner(System.in);

            System.out.println("BEM VINDO AO CADASTRO DE PEDIDO");

            System.out.println("Digite os código do pedido:");
            pedidoID = pC.nextInt();

            System.out.println("Digite os Valor total do pedido:");
            valorTotalCalculado = pC.nextFloat();

            /*
             * System.out.println("Digite o dia de criação do pedido:"); dia = pC.nextInt();
             * System.out.println("Digite o mês de criação do pedido:"); mes = pC.nextInt();
             * System.out.println("Digite o ano de criação do pedido:"); ano = pC.nextInt();
             */

            infoPedido.setPedido(pedidoID, valorTotalCalculado);
            // infoPedido.setPedidoData(dia,mes,ano);
            infoPedido.pedidoCadastrado();
            menu();
            break;
        case 2:
            System.out.println("BUSCAR PEDIDO");
            pedido pbusca = new pedido();
            pbusca.pedidoCadastrado();
            menu();
            break;
        case 3:
            pedido pRemovido = new pedido();

            System.out.println("REMOVER PEDIDO");
            pRemovido.pedidoCadastrado();
            int remove = 1;
            System.out.println("Status - Foi Removido");

            pRemovido.setpedidoRemover(remove);
            menu();
            break;
        case 4:
            String nome;
            int matricula;

            funcionario infoFuncionario = new funcionario();
            Scanner fc = new Scanner(System.in);

            System.out.println("BEM VINDO AO CADASTRO DE USUÁRIOS");
            System.out.println("Digite o nome do usuário:");
            nome = fc.nextLine();
            System.out.println("Matricula de usuário");
            matricula = fc.nextInt();

            infoFuncionario.setFuncionario(nome, matricula);
            infoFuncionario.funcionarioCadastrado();
            menu();
            break;
        case 5:
            System.out.println("BUSCAR FUNCIONARIO");
            funcionario fbusca = new funcionario();
            fbusca.funcionarioCadastrado();
            menu();
            break;
        case 6:
            funcionario fRemovido = new funcionario();

            System.out.println("REMOVER FUNCIONARIO");
            fRemovido.funcionarioCadastrado();
            int removeF = 1;
            System.out.println("Status - Foi Removido");
            fRemovido.setFuncionarioRemover(removeF);
            menu();
            break;
        case 0:
            System.out.println("Você saiu do sistema!");
            break;
        default:
            System.out.println("Que? Isso não é valido!");
        }

    }

    public static void main(String[] args) {
        menu();
    }
}
