package org.bhagi.pattern.Command;

public class BuyStockOrder implements Order{

	private StockTrade stock;
	
    public BuyStockOrder ( StockTrade st) {
        stock = st;
    }
	public void execute() {
		// TODO Auto-generated method stub
		stock.buy();
	}

}
