/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author doujones
 */
public class Stock {
    private String companyName;
    private double numberOfShares;
    private double purchasePrice;
    private double currentPrice;

    public Stock() {
        companyName = "Nope";
        numberOfShares = 0.0;
        purchasePrice = 0.0;
        currentPrice = 0.0;
    }

    public Stock(String companyName, double numberOfShares, double purchasePrice, 
            double currentPrice) {
        setCompanyName(companyName);
        setNumberOfShares(numberOfShares);
        setPurchasePrice(purchasePrice);
        setCurrentPrice(currentPrice);
    }

    @Override
    public String toString() {
        return companyName + ": " + numberOfShares + " shares";
    }
    
    public double profitLoss(){
        double net = numberOfShares * (currentPrice - purchasePrice);
        return net;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
       if( companyName.length() > 0)
        this.companyName = companyName;
       else
           this.companyName = "Nope";
    }

    public double getNumberOfShares() {
        return numberOfShares;
    }

    public void setNumberOfShares(double numberOfShares) {
         if( numberOfShares > 0)
        this.numberOfShares = numberOfShares;
         else 
             this.numberOfShares = 0.0;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        if( purchasePrice > 0.0)
        this.purchasePrice = purchasePrice;
         else 
             this.purchasePrice = 0.0;
    }

    public double getCurrentPrice() {
        return currentPrice;
    }

    public void setCurrentPrice(double currentPrice) {
        if( currentPrice > 0.0)
        this.currentPrice = currentPrice;
         else 
             this.currentPrice = 0.0;
    }
    
}
