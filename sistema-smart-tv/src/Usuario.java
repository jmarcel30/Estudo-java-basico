public class Usuario {
public static void main(String[] args) {
    SmartTv smartTv = new SmartTv();

    System.out.println("A tv está: " + smartTv.ligada);
    System.out.println("O canal atual é: " + smartTv.canal);
    System.out.println("O volume atual é: " + smartTv.volume);

    smartTv.ligar();
    System.out.println(" Novo Status -> Tv Ligada: " + smartTv.ligada);

    smartTv.desligar();
     System.out.println(" Novo Status -> Tv Ligada: " + smartTv.ligada);


}
}
