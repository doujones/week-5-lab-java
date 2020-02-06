
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author doujones
 */
public class StockIO {
    
    public ArrayList<Stock> getData(String fileName)
    {
      ArrayList<Stock> stocks = new ArrayList<Stock>();
        
      try
      {
          BufferedReader inFile = new BufferedReader(new FileReader(fileName));
          String inputLine = "";
          StringTokenizer tokens;
          
          inputLine = inFile.readLine();
          while( inputLine != null);
          {
              
              tokens = new StringTokenizer(inputLine, ",");
              String company = tokens.nextToken();
              double shares = Double.parseDouble(tokens.nextToken());
              double pPrice = Double.parseDouble(tokens.nextToken());
              double cPrice = Double.parseDouble(tokens.nextToken());
              
              Stock stk = new Stock(company, shares, pPrice, cPrice);
              stocks.add(stk);
              
              inputLine = inFile.readLine();
          }
          
          inFile.close();
      }
      catch(FileNotFoundException ex)
      {
          JOptionPane.showMessageDialog(null,
                  "Error. File not found: " + ex.getMessage(),
                  "Error!", JOptionPane.ERROR_MESSAGE);
      }
      catch(IOException ex)
      {
           JOptionPane.showMessageDialog(null,
                  "Error. Unable to read file: " + ex.getMessage(),
                  "Error!", JOptionPane.ERROR_MESSAGE);
      }
      return stocks;
    }
    public void saveData( ArrayList<Stock> stocks, String fileName )
    {
        try
        {
            BufferedWriter outFile = new BufferedWriter(new FileWriter(fileName));
            
            for( int i = 0; i < stocks.size(); i++)
            {
                Stock stk = stocks.get(i);
                outFile.write(stk.getCompanyName() + ',');
                outFile.write("" + stk.getNumberOfShares() + ',');
                outFile.write("" + stk.getPurchasePrice() + ',');
                outFile.write("" + stk.getCurrentPrice());
                outFile.newLine();
            }
            
            outFile.close();
        }
        catch( IOException ex)
        {
         JOptionPane.showMessageDialog(null,
                 "Error, Unable to write to the file: " + ex.getMessage(), 
                 "Error!", JOptionPane.ERROR_MESSAGE);   
        }
    }
}
