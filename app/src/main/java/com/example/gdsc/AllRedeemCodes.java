package com.example.gdsc;

public class AllRedeemCodes {
    private String name;
    private String status;
    AllRedeemCodes(String name,String status){
        this.name = name;
        this.status = status;
    }
    public String getStatus(){
        return status;
    }
}
