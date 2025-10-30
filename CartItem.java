class CartItem {
    String itemName;
    double price;
    int quantity;

    CartItem(String itemName, double price, int quantity) {
        this.itemName = itemName;
        this.price = price;
        this.quantity = quantity;
    }

    void addItem(int qty) {
        this.quantity += qty;
        System.out.println(qty + " " + itemName + "(s) added to cart.");
    }

    void removeItem(int qty) {
        if (qty <= quantity) {
            this.quantity -= qty;
            System.out.println(qty + " " + itemName + "(s) removed from cart.");
        } else {
            System.out.println("Not enough quantity to remove.");
        }
    }

    double totalCost() {
        return price * quantity;
    }

    void displayCart() {
        System.out.println("Item: " + itemName + ", Price: " + price + ", Quantity: " + quantity);
        System.out.println("Total Cost: " + totalCost());
    }

    public static void main(String[] args) {
        CartItem cart = new CartItem("Headphones", 1500, 2);
        cart.displayCart();
        cart.addItem(1);
        cart.displayCart();
        cart.removeItem(2);
        cart.displayCart();
    }
}

