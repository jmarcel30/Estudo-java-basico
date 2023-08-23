public class Usuario {
public static void main(String[] args) {
    SmartTv smartTv = new SmartTv();

    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    smartTv.aumentarVolume();
    smartTv.mudarCanalCima();
    smartTv.mudarCanalCima();
     smartTv.mudarCanalCima();
     smartTv.mudarCanalBaixo();
     smartTv.mudarCanalBaixo();
     smartTv.mudarCanalBaixo();


    System.out.println("A tv está: " + smartTv.ligada);
    System.out.println("O canal atual é: " + smartTv.canal);
    System.out.println("O volume atual é: " + smartTv.volume);

    smartTv.ligar();
    System.out.println(" Novo Status -> Tv Ligada: " + smartTv.ligada);

    smartTv.desligar();
     System.out.println(" Novo Status -> Tv Ligada: " + smartTv.ligada);

     System.out.println("Volume da tv: " +smartTv.volume);

     System.out.println("O canal atual é: " + smartTv.canal);

    


}
}
