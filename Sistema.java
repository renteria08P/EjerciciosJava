public class Sistema {
    public static void main(String[] args) {

        String usuario = "lola";
        int contraseña = 12;

        if (usuario == "admin"){
            if(contraseña ==  1234){
                System.out.println("Acesso Concedido");
            }else{
                System.out.println("Contraseña Incorrecta");
            }
        }else{
            System.out.println("Ususario no Encontrado");
        }
    }
}
