public enum Figure {
    //KONSTANTE("WERT")
    STONE("Stone"), SCISSOR("Scissor"), PAPER("Papier");

    private String value;

    Figure(String value){
        this.value = value;
    }

    public String toString(){
        return value;
    }
}
