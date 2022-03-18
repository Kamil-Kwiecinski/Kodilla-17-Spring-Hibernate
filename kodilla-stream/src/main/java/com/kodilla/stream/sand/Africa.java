package com.kodilla.stream.sand;

import java.math.BigDecimal;

public class Africa implements SandStorage{

    @Override
    public BigDecimal getSandBeansQuantity(){
        BigDecimal sandQuanity = new BigDecimal("99999999901234567890");
        return sandQuanity;
    }
}
