package com.example.gdsc;

import java.util.ArrayList;
import java.util.List;

public class RedeemCodeList {
    private String name;
    private String status;

    private RedeemCodeList(String name,String status){
        this.name = name;
        this.status = status;
    }
    public static RedeemCodeList [] redeemcodes = {new RedeemCodeList("3B6RYY7AHX9D - 100 Primogems, 10 Mystic Enhancement Ore","active"),
            new RedeemCodeList("JT78YH7SGWRZ - 100 Primogems, five Hero's Wit","active"),
            new RedeemCodeList("2BP9HY6BYFR5 - 100 Primogems, 50,000 Mora","active"),
            new RedeemCodeList("6A6VJTWGCPYV - 60 Primogems, five Adventurer's Experience","active"),
            new RedeemCodeList("XTNDKTEBWA59 - 60 Primogems, 5 Blue character XP tomes","active"),
            new RedeemCodeList("GENSHINGIFT - 50 Primogems, three Hero's Wit","active"),
            new RedeemCodeList("6A6VJTWGCPYV","expired"),
            new RedeemCodeList("8ANCKTWYVRD5","expired"),
            new RedeemCodeList("EA7VKTFHU9VR","expired"),
            new RedeemCodeList("KT7DKSFGCRWD","expired")};
    public String getStatus(){
        return status;
    }
    public String getName(){
        return name;
    }
}

