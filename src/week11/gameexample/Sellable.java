package week11.gameexample;

/**
 * Interface for Sellable objects in a game.
 */
public interface Sellable {
    /**
     * Sell modifier for items.
     */
    double SELL_MODIFIER = 0.9;
    /**
     * Returns the price of the item.
     * @return Price of item.
     */
    double getPrice();

    /**
     * Displays the properties of the item.
     */
    void display();

    /**
     * Computes the sell price for a sellable item.
     * @param sellable Sellable item you wish to sell.
     * @return Sell price of the sellable item.
     */
    static double getSellPrice(Sellable sellable){
        return Sellable.SELL_MODIFIER * sellable.getPrice();
    }
}
