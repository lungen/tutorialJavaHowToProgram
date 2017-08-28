 /* 3.12 ( Invoice Class ) Create a class called Invoice that a hardware store might use to represent
 * an invoice for an item sold at the store. An Invoice should include four pieces of information as
 * instance variables—a part number (type String ), a part description (type String ), a quantity of the
 * item being purchased (type int ) and a price per item ( double  ). Your class should have a constructor
 * that initializes the four instance variables. Provide a set and a get method for each instance variable.
 * In addition, provide a method named getInvoiceAmount that calculates the invoice amount (i.e.,
 * multiplies the quantity by the price per item), then returns the amount as a double value. If the
 * quantity is not positive, it should be set to 0 . If the price per item is not positive, it should be set to
 * 0.0 . Write a test app named InvoiceTest that demonstrates class Invoice ’s capabilities. */

public class TestInvoice
{
    public static void main(String[] args)
    {
        Invoice item1 = new Invoice("01001", "rams", 4, 3.33);
        Invoice item2 = new Invoice("02022", "usb-stick", -1, 3.33);

        System.out.printf("item: %s - %s - %d - %.2f%n", 
                    item1.getPartNumber(),
                    item1.getDescription(),
                    item1.getQuantitySold(),
                    item1.getPrice()
        );

        System.out.printf("complete invoice amount: %.2f", item1.getInvoiceAmount());

        System.out.printf("item: %s - %s - %d - %.2f%n", 
                    item2.getPartNumber(),
                    item2.getDescription(),
                    item2.getQuantitySold(),
                    item2.getPrice()
        );

        System.out.printf("complete invoice amount: %.2f", item2.getInvoiceAmount());
    }

}
