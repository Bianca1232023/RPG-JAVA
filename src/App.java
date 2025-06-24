public class App {
    public static void main(String[] args) throws Exception {
        //objeto = player 
        Personagem player = new Personagem("thorin", "guerreiro", 100, 30, 25, 8, 7);
        Personagem player2 = new Personagem("dragonborn", "mago", 100, 50, 15, 8, 30);
              
        //para exibir metodos como o de abaixo , vc precisa pegar do objeto criado q no caso é player 

        player.exibirStatus();
        player.additem("Espada");
        player.additem("Pocao");
        player.additem("Escudo");
        player.mostraritens();
        player.ataque();
        player2.additem("cajado");
        player2.ataque();
        player2.additem("tunica");
        player2.mostraritens();
        System.out.println("==========================================================");
        //agora se quiser pegar um atributo especifico como "atk", vc precisa fazer um get do tal atributo dentro de um print
        System.out.println("o atk do seu personagem é " + player.getAtk());
        System.out.println("o atk do seu personagem é " + player.getDef());
        System.out.println(player.getNome() + " tomou a pocao " + player.removeritem("Pocao"));
        player.mostraritens();
    }
}

