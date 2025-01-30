package org.dpj.adapter;

import java.util.HashMap;
import java.util.Map;

public class XMLToJSONAdapter implements JSONAnalyzer {
    private StockDataXML stockDataXML;

    public XMLToJSONAdapter(StockDataXML stockDataXML) {
        this.stockDataXML = stockDataXML;
    }

    @Override
    public void analyze() {
        String xml = stockDataXML.getXMLData();
        Map<String, String> json = convertXMLToJSON(xml);

        ThirdPartyJSONAnalyzer analyzer = new ThirdPartyJSONAnalyzer();

        analyzer.analyzeJSON(json.toString());

    }

    private Map<String, String> convertXMLToJSON(String xml) {
        Map<String, String> json = new HashMap<>();

        json.put("convertedData", "Dados do XML convertidos para JSON: " + xml);

        return json;
    }
}
