import java.util.*;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> contatos = new ArrayList<>();
        Scanner scan = new Scanner(System.in);
        contatos.add("Paulo");
        contatos.add("Thiago");
        contatos.add("Marcio");

        int decisao = 0;
        System.out.println("Bem vindo a agenda de contatos!");

        while (decisao != 4) {
            System.out.println("Oque deseja?\n\n1.Adicionar Contatos\n2.Remover Contatos\n3.Listar Contatos\n4.Sair");
            decisao = scan.nextInt();
            scan.nextLine();

            if (decisao > 4 || decisao < 1) {
                System.out.println("Numero invalido");
            }

            switch (decisao) {
                case 1 -> {
                    System.out.println("Quantos contatos deseja adicionar?");
                    int qntd = scan.nextInt();
                    scan.nextLine();

                    for (int i = 0; i < qntd; i++) {
                        System.out.println("Escreva o contato n°" + (i + 1));
                        String contato = scan.nextLine();
                        contatos.add(contato);
                    }
                    System.out.println("Lista atualizada: " + contatos);
                }

                case 2 -> {
                    System.out.println("Qual deseja remover? ");
                    System.out.println("Lista atual: " + contatos);
                    String remocao = scan.nextLine();
                    if (contatos.contains(remocao)) {
                        contatos.remove(remocao);
                        System.out.println("Contato removido");
                    } else {
                        System.out.println("Contato não encontrado.");
                    }

                    System.out.println("Lista Atualizada: " + contatos);
                }

                case 3 -> {
                    System.out.println("Lista atual: " + contatos);
                }

                case 4 -> {
                    System.out.println("Ok, desligando...");
                }
            }
        }
    }
}
