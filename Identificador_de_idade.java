public class Identificador_de_idade {
    public static void man (String [] args){

        int idade = 7;
        if (idade <= 7) {
            System.out.println ("É uma criança");
        }else if (idade > 7 && idade <= 17) {
            System.out.println ("É um (a) adolescente");
        } else if (idade > 18 && idade <= 65){
            System.out.println ("É um (a) adulto (a)");
        }else {
            System.out.println ("Está na melhor idade");
        }

        
    }
}
