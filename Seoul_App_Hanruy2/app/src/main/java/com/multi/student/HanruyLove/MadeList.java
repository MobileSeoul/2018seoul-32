package com.multi.student.HanruyLove;

public class MadeList {
    private String name;
    private  String subtext;
    private String table;
    //private  int firstimg;

    public MadeList(String name, String subtext,String table){
        this.name=name;
        this.subtext=subtext;
        this.table=table;
        //this.firstimg=firstimg;
    }
    public String getName(){ return name; }
    public String getSubtext() { return subtext; }
    public String getTable(){return table;}
    //public int getFirstimg() { return firstimg; }

}
