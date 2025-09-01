package com.gongsikai;

import lombok.Data;

@Data
public class Byteout implements ByteoutInterface {
    private final String domain = "https://byteout.cn";
    private int bugCount = 1;

    public Byteout() {
        System.out.println("Byteout is initialized!");
    }

    public String getDomain() {
        return domain;
    }

    public int getBugCount() {
        return bugCount;
    }

//    public void setBugCount(int bugCount) {
//        this.bugCount = bugCount;
//    }




//    public void setDomain(String domain) {
//        this.domain = domain;
//    }
}
