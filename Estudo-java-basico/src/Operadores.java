public class Operadores {
    public static void main(String[] args) {
        
    
    /*Operadores Unarios encremento*/

    

    int x = 5;
        x ++ ; // Agora x é 6

    int y = 10;
        y--; // Agora y é 9

    int a = 15;
        int b = -a; // b é -15

    int numero = 100;
    numero ++;
    
      /*Operadores Unarios Dencremento*/

     int e = 10;
        e--; // Agora y é 9

    /*Operadores Unarios Booleano*/

    boolean variavel = true;
    System.out.println(!variavel);
    
    /*Operador ternario */
    int idade = 17;       
    /*?se idade for igual ou maoir que 18 (maoir de idade ) senão : (meno de idade) */        
    String mensagem = (idade >= 18) ? "Maior de idade" : "Menor de idade";
    System.out.println(mensagem); // Saída: Maior de idade


    


    System.out.println(x);
    System.out.println(y);
    System.out.println(b);
    System.out.println(numero);
    System.out.println(e);

   

     
    }
    
}


/*Operadores Aritméticos:

+ (adição)
- (subtração)
* (multiplicação)
/ (divisão)
% (módulo, retorna o resto da divisão)
Operadores de Atribuição:

= (atribuição)
+= (adição e atribuição)
-= (subtração e atribuição)
*= (multiplicação e atribuição)
/= (divisão e atribuição)
%= (módulo e atribuição)
Operadores de Comparação:

== (igual a)
!= (diferente de)
< (menor que)
> (maior que)
<= (menor ou igual a)
>= (maior ou igual a)
Operadores Lógicos:

&& (E lógico)
|| (OU lógico)
! (NÃO lógico)
Operadores Bit a Bit:

& (AND bit a bit)
| (OR bit a bit)
^ (XOR bit a bit)
~ (Complemento bit a bit)
<< (Deslocamento à esquerda)
>> (Deslocamento à direita com preenchimento de sinal)
>>> (Deslocamento à direita com preenchimento zero)
Operadores de Incremento/Decremento:

++ (incremento)
-- (decremento)
Operadores Ternários:

? : (operador ternário condicional)
Operadores de Instância:

instanceof (verifica se um objeto é uma instância de uma classe) */