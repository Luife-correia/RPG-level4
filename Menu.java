import java.util.Scanner;
public class Menu extends Game{
    Scanner input = new Scanner(System.in);


    public void menu() {
        Game inicar = new Game();
        int opcao;
        do {
            System.out.println("\u001B[38;5;33m");
            System.out.println("██████╗░███████╗░██████╗███████╗████████╗██╗  ████████╗██╗░░██╗███████╗");
            System.out.println("██╔══██╗██╔════╝██╔════╝██╔════╝╚══██╔══╝╚═╝  ╚══██╔══╝██║░░██║██╔════╝");
            System.out.println("██████╔╝█████╗░░╚█████╗░█████╗░░░░░██║░░░░░░  ░░░██║░░░███████║█████╗░░");
            System.out.println("██╔══██╗██╔══╝░░░╚═══██╗██╔══╝░░░░░██║░░░░░░  ░░░██║░░░██╔══██║██╔══╝░░");
            System.out.println("██║░░██║███████╗██████╔╝███████╗░░░██║░░░██╗  ░░░██║░░░██║░░██║███████╗");
            System.out.println("╚═╝░░╚═╝╚══════╝╚═════╝░╚══════╝░░░╚═╝░░░╚═╝  ░░░╚═╝░░░╚═╝░░╚═╝╚══════╝\n");

            System.out.println("░█████╗░██╗░░░██╗██████╗░░██████╗███████╗  ░█████╗░███████╗  ████████╗██╗███╗░░░███╗███████╗");
            System.out.println("██╔══██╗██║░░░██║██╔══██╗██╔════╝██╔════╝  ██╔══██╗██╔════╝  ╚══██╔══╝██║████╗░████║██╔════╝");
            System.out.println("██║░░╚═╝██║░░░██║██████╔╝╚█████╗░█████╗░░  ██║░░██║█████╗░░  ░░░██║░░░██║██╔████╔██║█████╗░░");
            System.out.println("██║░░██╗██║░░░██║██╔══██╗░╚═══██╗██╔══╝░░  ██║░░██║██╔══╝░░  ░░░██║░░░██║██║╚██╔╝██║██╔══╝░░");
            System.out.println("╚█████╔╝╚██████╔╝██║░░██║██████╔╝███████╗  ╚█████╔╝██║░░░░░  ░░░██║░░░██║██║░╚═╝░██║███████╗");
            System.out.println("░╚════╝░░╚═════╝░╚═╝░░╚═╝╚═════╝░╚══════╝  ░╚════╝░╚═╝░░░░░  ░░░╚═╝░░░╚═╝╚═╝░░░░░╚═╝╚══════╝");
            System.out.println("──────────────────────────────────────────────────────────────────────────────");
            System.out.println("1 - Jogar");
            System.out.println("2 - Instruções");
            System.out.println("3 - Créditos");
            System.out.println("4 - Sair");
            System.out.println("──────────────────────────────────────────────────────────────────────────────");
            System.out.print("Escolha uma opção: ");
            System.out.print("\u001B[0m");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    inicar.jogar();
                    break;
                case 2:
                    // instruções do jogo
                    digitando("\n📜 INSTRUÇÕES:");
                    digitando("Explore, lute e descubra como quebrar a maldição do tempo!");
                    digitando("Tome cuidado antes de digitar suas respostas, podem ser as suas últimas.");
                    textoLore("Textos sobre a história e dicas aparecerão com essa cor durante o jogo.");
                    aviso("Avisos aparecerão com essa cor durante o jogo.");
                    break;
                case 3:
                    // créditos
                    digitando("\n👥 CRÉDITOS");
                    digitando("Desenvolvido por:");
                    digitando("Luiz Felipe Correia\n");
                    break;
                case 4:
                    // saída do jogo
                    aviso("Saindo...");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Opção inválida! Tente novamente.");
            }
        } while (opcao != 1);
        input.close();
    }
}
