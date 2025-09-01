package com.gongsikai;

public class ByteoutDaughter extends Byteout {
    @Override
    public String getDomain() {
        System.out.println("Hello ByteoutDaughter");
        return super.getDomain();
    }
}
