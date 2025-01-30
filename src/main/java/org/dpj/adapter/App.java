package org.dpj.adapter;

public class App {
    public static void main(String[] args) {
        StockDataXML stockDataXML = new StockDataXML(
                "<stock><symbol>AAPL</symbol><price>150</price></stock>"
        );

        XMLToJSONAdapter adapter = new XMLToJSONAdapter(stockDataXML);
        adapter.analyze();
    }
}
