package org.bhagi.pattern.Command;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	StockTrade stock = new StockTrade();
    	BuyStockOrder bsc = new BuyStockOrder (stock);
    	SellStockOrder ssc = new SellStockOrder (stock);
    	
    	Agent agent = new Agent();
    	agent.placeOrder(bsc);
    	agent.placeOrder(ssc);
    }
}