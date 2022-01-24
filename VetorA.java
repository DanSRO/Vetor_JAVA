package ExercicioVetor2;
public class VetorA {
    public static void main(String[] args) {
        
        String[] naipes = {"Copas", "Paus", "Espadas", "Ouros"};
        String[] faces = {"As","1","2","3","4","5","6","7","8","9","Valete", "Damas", "Reis"};
            String naipe = naipes[(int) (Math.random()*4)];
            String face = faces[(int) (Math.random()*faces.length)];
        System.out.println(face+" de "+naipe);
        }    
}