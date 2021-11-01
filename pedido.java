public class pedido {

    private int pedidoID, dia, mes, ano;
    private float valorTotalCalculado;
    private int remove = 0;

    public void setPedido(int meuPedido, float valorTC) {
        pedidoID = meuPedido;
        valorTotalCalculado = valorTC;
    }

    public int getPedidoID() {
        return pedidoID;
    }

    public float getValorTC() {
        return valorTotalCalculado;
    }

    /*
     * public void setPedidoData(int diap, int mesp, int anop){ dia = diap; mes =
     * mesp; ano = anop; }
     */

    /*
     * public int getPedidoData (){ return dia; return mes; //pode colocar mais de
     * um return em um get? return ano; }
     */

    public void setpedidoRemover(int removido) {
        remove = removido;
    }

    public int getpedidoRemover() {
        return remove;
    }

    public void pedidoCadastrado() {

        if (getpedidoRemover() == 0) {
            System.out.println("Pedido cadastrado - Código:" + getPedidoID() + " Valor:" + getValorTC());
            System.out.println("Criado em:" + dia + "/" + mes + "/" + ano); // Tem que criar a data.
        } else {
            System.out.println("Status - Foi Removido");
        }

    }
}