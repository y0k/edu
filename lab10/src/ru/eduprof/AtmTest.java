package ru.eduprof;

import ru.eduprof.Converter.BlockchainInfoConverter;

import java.io.IOException;
import java.util.Scanner;

class AtmTest extends Atm {

    public static void main(String[] arguments) throws IOException
    {
        System.out.printf("INPUT AMOUNT OF $ TO CONVERT INTO BTC: ");
        Scanner scanner = new Scanner(System.in);
        int  am = scanner.nextInt();
        BlockchainInfoConverter BcInfoCurrencyConverter = new BlockchainInfoConverter();
        float current = BcInfoCurrencyConverter.getConversionRate("USD", am);
        System.out.println(current);
    }

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void testHashCode() {
    }

    @org.junit.jupiter.api.Test
    void testEquals() {
    }

    @org.junit.jupiter.api.Test
    void testClone() {
    }

    @org.junit.jupiter.api.Test
    void testFinalize() {
    }

    @org.junit.jupiter.api.Test
    void testToString() {
    }

    @Override
    public float convert(String currencyFrom, Integer currencyTo) throws Exception {
        return 0;
    }
}