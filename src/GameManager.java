import java.util.Arrays;
import java.util.List;

public class GameManager {
    private final Player player1;
    private final Player player2;

    private final List<Figure> options;
    public GameManager(){
        this.player1 = new Player();
        this.player2 = new Player();
        this.options = Arrays.asList(Figure.values());

    }

    public void showOptions(){
        System.out.println("Eingaben aus: " + this.options);

    }
    public void setPlayerNames(){
        System.out.println("Name von Spieler 1? :");
        this.player1.setName();

        System.out.println("Name von Speieler 2? :");
        this.player2.setName();
    }

    public String getPlayerInput(Player player){
        System.out.println(player.getName() +":");
        player.setInput();
        return player.getInput();
    }
    public void checkForWinner(){
        String player1Input  = this.getPlayerInput(player1);
        String player2Input = this.getPlayerInput(player2);

        Figure selected1 = manipulateInput(player1Input);
        Figure selected2 = manipulateInput(player2Input);
        if(selected1 == null || selected2 == null){
            System.out.println("Fehlerhafte Eingabe");
        }
        else if(      (selected1 == Figure.PAPER && selected2 == Figure.STONE) ||
                (selected1 == Figure.STONE  && selected2 == Figure.SCISSOR) ||
                (selected1 == Figure.SCISSOR  && selected2 == Figure.PAPER))
                {
                    System.out.println("Gewinner: " + this.player1.getName());

        } else if ((selected2 == Figure.PAPER && selected1 == Figure.STONE) ||
                (selected2 == Figure.STONE  && selected1 == Figure.SCISSOR) ||
                (selected2 == Figure.SCISSOR  && selected1 == Figure.PAPER)){
                    System.out.println("Gewinner: " + this.player2.getName());
        } else{
            System.out.println("Unentschieden");
        }
    }
    public Figure manipulateInput(String input){
        String inputNoSpace = input.trim();
        String newInput = inputNoSpace.substring(0,1).toUpperCase() + inputNoSpace.substring(1).toLowerCase();
        if(newInput.trim().equals(Figure.PAPER.toString())){
            return Figure.PAPER;
        } else if(newInput.trim().equals(Figure.SCISSOR.toString())){
            return Figure.SCISSOR;
        } else if(newInput.trim().equals(Figure.STONE.toString())){
            return Figure.STONE;
        } else{
            return null;
        }

    }
    public void run(){

        this.setPlayerNames();
        this.showOptions();
        this.checkForWinner();




    }

    public void runSimulation(){
        System.out.println("Stone vs. Scissor => 1");
        System.out.println("Scissor vs. Stone => 2");
        System.out.println("Scissor vs. Paper => 1");
        System.out.println("Paper vs. Scissor => 2");
        System.out.println("Paper vs. Stone => 1");
        System.out.println("Stone vs. Paper => 2");

    }

}
