import java.util.ArrayList;

public class PuzzleTest{
    public static void main(String[] args) {
        PuzzleJava puzzle = new PuzzleJava();

        ArrayList<Integer> arreglo = puzzle.getTenRolls();

        for(int numero : arreglo){
            System.out.println(numero);
        }

        System.out.println(puzzle.getRandomLetter());
        System.out.println(puzzle.generatePassword());

        String[] matrizPassword = puzzle.getNewPasswordSet(20);
        System.out.println("---Arreglo Generado---");
        for(String password : matrizPassword){
            System.out.println(password);
        }
        puzzle.shuffleArray(matrizPassword);
        System.out.println("---Arreglo Despues del Shuffle");
        for(String password : matrizPassword){
            System.out.println(password);
        }
    }
}