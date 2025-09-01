package com.gongsikai;

public class ByteoutSon extends Byteout {
    @Override
    public String getDomain() {
        // 调用父类的方法
        System.out.println("Hello ByteoutSon");
        return super.getDomain();
    }
}
