import java.util.Scanner;

public class apssilvio {
    public static void main (String [] args){
        Scanner in = new Scanner(System.in);
        String senha, usuario, confirmar;
        String senhalogin, usuariologin;
        String senhaseguranca;

        System.err.println("_____CADASTRO_____\n");
        System.err.println("Crie um usuario:");
        usuario = in.nextLine();
        
        System.err.println("Crie uma senha:");
        senha = in.nextLine();
        
        System.err.println("Comfirme sua senha:");
        confirmar = in.nextLine();

        if (!usuario.isEmpty() && !senha.isEmpty() && !confirmar.isEmpty()) {
            if (senha.equals(confirmar)){

                System.err.println("\nCadastro concluido!!");
                System.err.println("Sua SenhaSegurança é '12345'");
                System.err.println("\n_____LOGIN_____\n");

                System.err.println("Digite seu usuario:");
                usuariologin = in.nextLine();
                System.err.println("Digite sua senha:");
                senhalogin = in.nextLine();
                System.err.println("SenhaSegurança(opcional):");
                senhaseguranca = in.nextLine();

                if ((usuario.equals(usuariologin) && senha.equals(senhalogin)) || senhaseguranca.equals("12345")) {
                    System.err.println("\nLogin realizado!!");
                } else {
                    System.err.println("Senha ou usuario errado!! use a SenhaSegurança caso precise");
                }

            } else {
                System.err.println("Senha não coincide.");
            }
        } else {
            System.err.println("Usuario ou senha não inseridos!");
        }
    }
}