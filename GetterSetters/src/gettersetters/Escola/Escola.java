
package gettersetters.Escola;


public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();
        
        felipe.nome = "Mateus";
        felipe.idade = 10;
        
        
        System.out.println("O aluno" + felipe.nome + " tem " + felipe.idade+ " anos");
    }
}
