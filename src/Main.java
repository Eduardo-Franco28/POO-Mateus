public class Main {
    public static void main(String[] args) {
        Guerreiro g1 = new Guerreiro("Eduardo", 2, 100, ClassePersonagem.GUERREIRO, "Machado");
        Guerreiro g2 = new Guerreiro("Mateus", 3, 200, ClassePersonagem.MAGO, "Cajado");

        g1.atacar();
        g1.atacar(100);
        g1.atacar(100, "Mateus");

        if(g1.getPontosDeVida() > g2.getPontosDeVida()){
            System.out.println("O guerreiro com mais pontos de vida é: " + g1.getNome());
        } else {
            System.out.println("O guerreiro com mais pontos de vida é: " + g2.getNome());
        }
    }
}