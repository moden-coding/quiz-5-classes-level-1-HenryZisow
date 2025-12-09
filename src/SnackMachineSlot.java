public class SnackMachineSlot {

    private String itemName;
    private double price;
    private int quantity;
    private int itemsSold;

    public SnackMachineSlot(String givenItemName, double initialPrice, int initialQuantity) {
        itemsSold = 0;
        this.itemName = givenItemName;
        if (initialPrice < 0) {
            price = 0.0;
        } else {
            this.price = initialPrice;
        }
        if (initialQuantity < 0) {
            quantity = 0;
        } else {
            this.quantity = initialQuantity;
        }
    }

    public String toString() {
        return "Item: " + itemName + ", Price: " + price + ", In Stock: " + quantity;
    }

    public void purchaseOne() {
        if (quantity > 0) {
            quantity--;
            itemsSold++;
        } else {
            quantity = quantity;
            itemsSold = itemsSold;
        }
    }

    public double getRevenue() {
        return itemsSold * price;
    }

}
