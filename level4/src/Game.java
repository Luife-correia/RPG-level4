import java.util.*;


public class Game {

    static String nome;
    static int vida = 100;
    static int xp = 0;
    static int respostasCertas = 0;
    static int respostasErradas = 0;
    static int acertosBoss = 0;

    static Scanner input = new Scanner(System.in);
    static Random random = new Random();

    //metodo para efeito de digitação.
    static void digitando(String texto) {
        for (int i = 0; i < texto.length(); i++) {
            System.out.print(texto.charAt(i));
            try {
                Thread.sleep(20);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }
        }
        System.out.println();
    }

    //metodo para mudar cor do texto quando for lore.
    static void textoLore(String lore){
        digitando("\u001B[38;5;24m" + lore + "\u001B[0m");
    }

    //metodo para mudar cor do texto quando for aviso.
    static void aviso(String alerta){
        digitando("\u001B[38;5;196m" + alerta + "\u001B[0m");
    }

    public void jogar() {

        //texto introdutório
        textoLore("\nHá muito tempo, em um mundo onde o tempo não é uma linha, mas um círculo imperfeito,");
        textoLore("existe uma lenda sobre um artefato capaz de dobrar a realidade: o Laço Infinito.");
        textoLore("Dizem que quem o possuir poderá reescrever eventos, reviver momentos ou até escapar do próprio destino.");
        textoLore("Mas o Laço não está em qualquer lugar — ele repousa no coração de um labirinto temporal,");
        textoLore("uma prisão de ciclos eternos onde o tempo se reinicia sempre que alguém falha em sua jornada.\n");

        //definir nome do player
        do {
            digitando("Digite o nome do seu herói ou heroína: ");
            nome = input.nextLine();
        }while(nome.isEmpty());
        textoLore("Você é "+nome+", alguém em busca do Laço Infinito, mas o motivo ainda é oculto.\n");

        // Escolha de tempo
        String escolhaTempo = "";
        while (!escolhaTempo.equals("passado") && !escolhaTempo.equals("futuro")) {
            digitando(nome+" para qual parte do tempo você deseja ir com o Laço Infinito (Passado ou Futuro)? ");
            escolhaTempo = input.nextLine().trim().toLowerCase();
        }

        String motivo = "";
        int opcao;
        // Oferece opções conforme a escolha
        if (escolhaTempo.equals("passado")){
            do {
                digitando("O que você deseja mudar?");
                digitando("1 - Impedir a morte de alguém querido");
                digitando("2 - Evitar uma guerra que destruiu milhões de vidas");
                digitando("3 - Reviver um momento que nunca deveria ter acabado");
                digitando("4 - Salvar uma civilização perdida");
                digitando("5 - Recuperar uma oportunidade que você deixou escapar");
                System.out.print("Escolha uma opção (1/2/3/4/5):");
                opcao = input.nextInt();
                input.nextLine();} // Limpa o buffer
            while(opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 );

            switch (opcao) {
                case 1 -> motivo = "Impedir a morte de alguém querido";
                case 2 -> motivo = "Evitar uma guerra que destruiu milhões de vidas";
                case 3 -> motivo = "Reviver um momento que nunca deveria ter acabado";
                case 4 -> motivo = "Salvar uma civilização perdida";
                case 5 -> motivo = "Recuperar uma oportunidade que você deixou escapar";
            }

        } else {
            do {
                digitando("O que você deseja descobrir?");
                digitando("1 - Explorar como será a vida em outros planetas");
                digitando("2 - Saber se a humanidade encontrou cura para todas as doenças");
                digitando("3 - Descobrir as novas invenções futuras do seu mundo");
                digitando("4 - Conhecer a sociedade do futuro e suas regras");
                digitando("5 - Obter informações para mudar sua vida atual");
                System.out.print("Escolha uma opção (1/2/3/4/5):");
                opcao = input.nextInt();
                input.nextLine();} // Limpa o buffer
            while (opcao != 1 && opcao != 2 && opcao != 3 && opcao != 4 && opcao != 5 );
            switch (opcao) {
                case 1 -> motivo = "Explorar como será a vida em outros planetas";
                case 2 -> motivo = "Saber se a humanidade encontrou cura para todas as doenças";
                case 3 -> motivo = "Descobrir as novas invenções futuras do seu mundo";
                case 4 -> motivo = "Conhecer a sociedade do futuro e suas regras";
                case 5 -> motivo = "Obter informações para mudar sua vida atual";
            }
        }

        // Narrativa final antes do inicio da run
        textoLore("\nCom o propósito de "+motivo.toLowerCase() +".");
        textoLore("Você parte em direção ao Labirinto de Chronos, onde o Laço Infinito repousa.");
        textoLore("\nApós semanas de viagem por terras esquecidas,");
        textoLore("enfrentando criaturas que parecem existir fora do tempo,");
        textoLore("corvos que falam em enigmas, árvores que crescem ao contrário,");
        textoLore("e rios que correm para o céu. Você finalmente chega à entrada do labirinto.");
        textoLore("É uma estrutura viva, feita de pedra pulsante e relógios quebrados.");
        textoLore("O ar vibra com ecos de vozes que ainda não foram ditas.\n");
        textoLore("Um aviso está gravado na entrada:");aviso("Aqui, o tempo não cura. Ele repete.”\n");
        textoLore("Você respira fundo. A primeira tentativa está prestes a começar.\n");

        int totalPassos = 0;

        textoLore("As paredes começam a tremer, como se estivessem vivas, e o chão se contorce sob seus pés.");
        textoLore("O brilho tênue das tochas se apaga, mergulhando tudo em uma escuridão sufocante.");
        textoLore("De repente, o espaço se distorce, corredores se alongam e portas desaparecem.");
        textoLore("O labirinto que antes parecia familiar se desfaz, revelando um novo caminho — obscuro, retorcido, e desconhecido.");
        textoLore("Você sente uma presença antiga, algo que observa cada passo, como se o próprio ar estivesse carregado de segredos.");
        textoLore("O som distante de goteiras ecoa, e raízes negras se espalham pelas paredes, lembrando um ninho profundo e esquecido.");
        textoLore("Agora, você está preso em um novo labirinto, um reino de sombras onde cada curva pode esconder um predador.");
        textoLore("O desafio não acabou... ele apenas começou.");
        textoLore("E agora tudo que você pode fazer é seguir em frente.");
        textoLore("O caminho à frente é obscuro e desconhecido. Você decide dar passos com cautela.");











        while (totalPassos < 80) {

            int passos4 = andar();
            totalPassos += passos4;

            if (totalPassos % 6 == 0 && !textosLore.isEmpty()) {
                loreAle();
            }else if (totalPassos == 16 || totalPassos == 32 || totalPassos == 56 || totalPassos == 64) {
                abrirBau();
            }else if (totalPassos == 8 || totalPassos == 28 || totalPassos == 44 || totalPassos == 52 || totalPassos == 68 || totalPassos == 20  || totalPassos == 40) {
                int puxeInimigo = random.nextInt(inimigos.size());
                inimigos.get(puxeInimigo).desafiar();
            }else{digitando("O som dos seus passos ecoa pelas paredes úmidas. O ar continua denso, e a escuridão parece observar em silêncio." +
                    "\nApenas o silêncio... e a sensação de que algo está à espreita. Siga em frente!");
            }
        }
        enfrentarBoss();
}

    static int andar(){
        int passos;
        do {
            digitando("\nQuantos passos você quer andar? Escolha entre 1 a 5:");
            passos = input.nextInt();
            input.nextLine();//limpar o buffer.
            if (passos >= 10) {//se andar mais que dez passos o player morre.
                digitando("Você movido(a) pela coragem ou talvez pela imprudência, avança com passos largos");
                digitando("A trilha se estende além da visão, envolta em névoa e silêncio.");
                digitando("Você percebe tarde demais: \"Talvez eu tenha ido longe demais... sem saber o que me esperava.\"");
                digitando("O chão desaparece sob seus pés.");
                digitando("E ele cai... um buraco que parece não ter fim.");
                digitando("A queda é longa. O silêncio, absoluto.");
                aviso("VOCÊ MORREU");
                System.exit(0);
            }
        } while (passos < 1 || passos > 5);
        passos = 4; //delimitador para poder manipular o ritmo do jogo.
        return passos;
    }

    //define uma lista com os textos de lore, que pode ser editada pelo new ArrayList.
    //arrays.aslist junta as frases em uma lista.
    //já o new arraylist torna possivel editar a lista.
    static List<String> textosLore = new ArrayList<>(Arrays.asList(
            "Você entra em um corredor onde o ar parece parado no tempo. Gravado em uma pedra antiga, lê-se:" + "\n\"O conhecimento ancestral revela que a ação sempre ocorre ao menos uma vez, antes que o destino seja testado.\"",
            "No chão coberto de poeira e marcas de garras, você percebe sinais de luta. Uma placa enferrujada caída ao lado diz:"+"\n\"Mesmo quando a condição falha, o primeiro passo já foi dado. O ciclo começa com coragem, não com certeza.\"",
            "Uma brisa gélida sopra por um túnel estreito. Você ouve um sussurro vindo das sombras:"+"\n\"O laço do-while prende o fluxo até que a condição diga: “basta”.\"",
            "Em uma sala circular, iluminada por tochas verdes, você encontra um pergaminho sobre um altar de pedra. Ao desenrolá-lo, lê:"+"\n\"Enquanto a condição for verdadeira, o ciclo se reinicia. O tempo é um prisioneiro da lógica.\"",
            "No centro de uma encruzilhada, uma rocha gigante bloqueia o caminho. Nela, gravado com precisão milenar, está o símbolo: ∞"+"\nO símbolo do infinito lembra: \"o laço pode durar para sempre... se não houver uma saída.\"",
            "Ao atravessar um arco coberto de musgo, um eco distante reverbera pelas paredes do labirinto:"+"\n\"Outros comandos podem acompanhar o laço: break, continue, aliados na jornada do controle.\""
    ));

    static void loreAle() {
        int i = random.nextInt(textosLore.size());//gera um num aleatorio entre 0 e o tamanho da lista
        String loreEscolhida = textosLore.remove(i);//remove a lore escolhida para não repetir
        textoLore(loreEscolhida);//imprime a lore escolhida
    }
}

