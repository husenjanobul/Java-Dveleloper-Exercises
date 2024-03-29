package com.company.services.floor;

import com.company.interfaces.floorTypes.Floor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.math.BigDecimal;

@Component
public class LivingRoom implements Floor {

    @Value("${length}")
    BigDecimal length;

    @Value("${width}")
    BigDecimal width;

    @Override
    public BigDecimal getArea() {
        return length.multiply(width);
    }
}
