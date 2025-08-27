package br.com.mariojp.solid.ocp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class DiscountCalculatorTest {
    @Test
    void partner_gets_12_percent() {
        var calc = new DiscountCalculator(new PartnerCustomerDiscount());
        assertEquals(88.0, calc.apply(100.0), 0.0001,
                "PARTNER deveria ter 12% de desconto");
    }
}