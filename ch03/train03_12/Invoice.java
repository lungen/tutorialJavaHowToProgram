public class Invoice
{
    // instance variables
    String partNumber;
    String partDescription;
    int quantitySold;
    double partPrice;

    public Invoice(String partNumber, String partDescription, 
            int quantitySold, double partPrice)
    {
        this.partNumber = partNumber;
        this.partDescription = partDescription;
        
        if ((quantitySold > 0) && (quantitySold <= 1000))
                this.quantitySold = quantitySold;
        else
            System.out.println("Qauntity value is not correct!");

        if ((partPrice > 0.0) && (partPrice <= 100000))
                this.partPrice = partPrice;
        else
            System.out.println("Price value is not correct!");
    }

    // partNumber
    public void setPartNumber(String partNumber)
    {
        this.partNumber = partNumber;
    }

    public String getPartNumber()
    {
        return this.partNumber;
    }

    // description
    public void setDescription(String partDescription)
    {
        this.partDescription = partDescription;
    }

    public String getDescription()
    {
        return this.partDescription;
    }

    // price
    public void setPrice(double partPrice)
    {
        if (partPrice > 0.0)
            this.partPrice = partPrice;
    }

    public double getPrice()
    {
        return this.partPrice;
    }

    // quantity 
    public void setQuantitySold(int quantitySold)
    {
        if (quantitySold > 0)
            this.quantitySold = quantitySold;
    }

    public int getQuantitySold()
    {
        return this.quantitySold;
    }

    // getInvoiceAmount
    public double getInvoiceAmount()
    {
        return this.getPrice() * this.getQuantitySold();
    }
}


