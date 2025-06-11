public class Personagem {
    private String nome;
    private String classe;
    private int atk;
    private int hp;
    private int def;
    private int mana;
    private int dex;
    
    public Personagem(){

    }

    public Personagem(String nome, String classe, int hp , int atk , int def ,int dex , int mana) {
        this.nome = nome;
        this.classe = classe;
        this.hp = hp;
        this.atk = atk;
        this.def = def;
        this.dex = dex;
        this.mana = mana;
    }
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getClasse() {
        return classe;
    }

    public void setClasse(String classe) {
        this.classe = classe;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getDex() {
        return dex;
    }

    public void setDex(int dex) {
        this.dex = dex;
    }

    public void exibirStatus(){
    System.out.println("==========================================================");
    System.out.println("nome do personagem: " + nome);
    System.out.println("classe do personagem: " + classe);
    System.out.println("hp do personagem: " + hp);
    System.out.println("atk do personagem: " + atk);
    System.out.println("def do personagem: " + def);
    System.out.println("dex do personagem: " + dex);
    System.out.println("mana do personagem: " + mana);
    System.out.println("==========================================================");
    }
}
