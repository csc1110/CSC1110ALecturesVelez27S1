package week11.activity;

public interface Fruit {
    String PREPPED_COLOR = "\u001b[32m";
    String NOT_PREPPED_COLOR = "\u001b[31m";
    String RESET = "\u001b[0m";
    boolean isPrepped();
    void prep();
    void display();
    public static void processFruit(Fruit fruit){
        if(!fruit.isPrepped()){
            fruit.prep();
        }
    }
}
