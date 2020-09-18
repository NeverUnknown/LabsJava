class Invoice {
    // Create a class called Invoice that a hardware store might use to represent
    //an invoice for an item sold at the store. An Invoice should include four pieces of information as
    //instance variables—a part number (type String), a part description (type String), a quantity of the
    //item being purchased (type int) and a price per item (double). Your class should have a constructor
    //that initializes the four instance variables. Provide a set and a get method for each instance variable.
    //In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e.,
    //multiplies the quantity by the price per item), then returns the amount as a double value. If the
    //quantity is not positive, it should be set to 0. If the price per item is not positive, it should be set to
    //0.0. Write a test app named InvoiceTest that demonstrates class Invoice’s capabilities.
    private String partNumber;
    private String description;
    private int quantity;
    private double pricePerItem;

    Invoice(String partNumber, String description, int quantity, double pricePerItem) {
        this.partNumber = partNumber;
        this.description = description;
        if (quantity > 0) {
            this.quantity = quantity;
        } else {
            this.quantity = 0;
        }
        if (pricePerItem > 0.0) {
            this.pricePerItem = pricePerItem;
        } else {
            this.pricePerItem = 0.0;
        }
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setQuantity(int quantity) {
        if (quantity < 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }

    public int getQuantity() {
        return quantity;
    }

    public void setPricePerItem(double pricePerItem) {
        if (pricePerItem < 0.0) {
            this.pricePerItem = 0.0;
        } else {
            this.pricePerItem = pricePerItem;
        }
    }

    public double getPricePerItem() {
        return pricePerItem;
    }

    public double getInvoiceAmount() {
        return quantity * pricePerItem;
    }

    @Override
    public String toString() {
        //String.valueOf(pricePerItem);
        return "----------------\nPart Number: " + partNumber + "\nDescription: " + description +
                "\nQuantity: " + quantity + "\nPrice per item: " + pricePerItem + "\n----------------";
    }

}


public class _3_12 {
    public static void main(String[] args) {
        Invoice first = new Invoice("1", "Gold Ingot", 1, 10000);
        System.out.println(first.toString());
        System.out.println(first.getInvoiceAmount());

        Invoice second = new Invoice("2", "Silver Ingot", 4, 2500);
        System.out.println(second.toString());
        System.out.println(second.getInvoiceAmount());
    }
}
