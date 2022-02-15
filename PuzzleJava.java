import java.util.ArrayList;
import java.util.Random;
public class PuzzleJava{

    public ArrayList<Integer> getTenRolls(){
        Random randGen = new Random();
        ArrayList<Integer> tenRolls = new ArrayList<Integer>();
        for(int i=0; i<10; i++){
            int aleatorio = randGen.nextInt(20)+1;
            tenRolls.add(aleatorio);
        }
        return tenRolls;
    }

    public String getRandomLetter(){
        String[] letras = new String[] {"a","b","c","d","e","f",
            "g","h","i","j","k","l","m","n","o","p","q",
            "r","s","t","u","v","w","x","y","z"};
        Random randGen = new Random();
        String caracterDecidido = letras[randGen.nextInt(26)];
        return caracterDecidido;
    }

    public String generatePassword(){
        String password = "";
        for(int i=0;i<8;i++){
            password += getRandomLetter();
        }
        return password;
    }

    public String[] getNewPasswordSet(int longitud){
        String[] matriz = new String[longitud];
        for(int i=0; i<longitud; i++){
            matriz[i] = generatePassword();
        }
        return matriz;
    }
    public void shuffleArray(Object[] array){
        Random randGen = new Random();
        for(int i=0; i<array.length; i++){
            int indiceAleatorio = randGen.nextInt(array.length);
            Object aux = array[i];
            array[i] = array[indiceAleatorio];
            array[indiceAleatorio] = aux;
        }
    }
}
