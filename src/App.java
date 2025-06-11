public class App {
    public static void main(String[] args) throws Exception {
        //objeto = player
        Personagem player = new Personagem("thorin", "guerreiro", 100, 30, 25, 8, 7);
        
        //para exibir metodos como o de abaixo , vc precisa pegar do objeto criado q no caso é player
        player.exibirStatus();

        //agora se quiser pegar um atributo especifico como "atk", vc precisa fazer um get do tal atributo dentro de um print
        System.out.println("o atk do seu personagem é " + player.getAtk());
        System.out.println("o atk do seu personagem é " + player.getDef());
    }
}

