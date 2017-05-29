package com.H2.core;

public class H2Core{

    private int id;
    private String name;
    /*public H2Core (int id, String name){
        this.id = id;
        this.name = name;


    }*/
    //public int getId(){return id;}
    public void setId (int id){this.id = id;}
    //public String getName(){return name;}
    public void setName(String name){this.name = name;}
    public String toString(){
      return  id +' '+ name;
    }
    //public void setId (int id){this.id = id;}
    //public void setName(String name){this.name = name;}
    /*@Override
    public String toString(){
        return String.format("H2Core[id =%d;name =%n]");
    }*/
}
