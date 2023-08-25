public class EstruturasCondicionais {
    public static void main(String[] args) {
  


            double nota1 = 4.6;
            double nota2 = 1.9;
            double nota3 = 4.8;
            double nota4 = 8;
             
            double total = (nota1+nota2+nota3+nota4);
            double notaFinal = total / 4;

            if (notaFinal >= 7)
                System.out.println("Parabens sua nota final é: " + notaFinal + " e você esta aprovado.");
            
            else if (notaFinal >= 5 && notaFinal < 7)
                System.out.println("Sua nota é "+notaFinal+" Você esta de recuperação");


            else 
                System.out.println("Sua nota é "+notaFinal+" Você esta reprovadodo");


        
    }
}
/* Condição ternaria
 * 
 *int nota = 7;
 String resultado = nota >= 7 ? "Aprovado" : "Reprovado";
 System.out.println(resultado)
 */


 /*Switch Case
  * 
  String sigla = "M";
  switch (sigla){
    case "p":{
        System.out.println("Pequeno")
        break
    }
    case "M":{
        System.out.println("Medio")
        break
    }

    case "G":{
        System.out.println("Grande")
        break
    }

    default:
        System.out.println("Indefinido")

    }
  }
  */