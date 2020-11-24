import java.util.Scanner;

public class Player {
    private String input;
    private String name;

    public Player(String input, String name) {
        this.input = input;
        this.name = name;
    }

    public Player() {
    }

    public void setInput(){
        Scanner scan = new Scanner(System.in);
        this.input = scan.nextLine();
    }
    /*public void setInput(String input){
        this.input = input;
    }*/
    public String getInput(){

        return this.input;
    }

    public void setName(){
        Scanner scan = new Scanner(System.in);
        this.name = scan.nextLine();
    }
    public String getName(){
        return this.name;
    }

}
