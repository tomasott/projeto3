import entities.Cliente;

public class programa {

    public static void main(String[] args) {

        Cliente c1 = new Cliente();

        c1.setNome("Pedro");
        c1.setNumeroCliente(001);
        c1.setDivida(0.0);

        System.out.println("Número do cliente: " + c1.getNumeroCliente());
        System.out.println("Nome do cliente: " + c1.getNome());
        System.out.println("Dívida do cliente: " + c1.getDivida());

        Cliente c2 = new Cliente( 002,"Ana");


        System.out.println(c2);


    }

}
