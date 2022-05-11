package ru.eduprof.Converter;

import org.apache.http.client.ResponseHandler;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.BasicResponseHandler;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.IOException;

public class BlockchainInfoConverter implements CurrencyConverter {

    public float getConversionRate(String from, Integer to) throws IOException
    {
        HttpClientBuilder builder = HttpClientBuilder.create();
        try (CloseableHttpClient httpclient = builder.build())
        {
            HttpGet httpGet = new HttpGet("https://blockchain.info/tobtc?currency=" + from + "&value="+ to );
            ResponseHandler<String> responseHandler = new BasicResponseHandler();
            String responseBody = httpclient.execute(httpGet, responseHandler);

            return Float.parseFloat(responseBody);
        }
    }

    @Override
    public float convert(String currencyFrom, Integer currencyTo) throws Exception {
        return 0;
    }
}

