package edu.tiago.segundasemana;
public class MinhaClasse {

  //para aula de anatomia java 
   public static void main(String[]args) {
  
    String primeiroNome = "Tiago";
    String segundoNome = "Carvalho";
    String nomeCompleto = nomeCompleto(primeiroNome,segundoNome);
    System.out.println(nomeCompleto);
   }
   public static String nomeCompleto(String primeiroNome, String segundoNome){
     return "Resultado do metodo: " + primeiroNome.concat(" ").concat(segundoNome);
   }

}
