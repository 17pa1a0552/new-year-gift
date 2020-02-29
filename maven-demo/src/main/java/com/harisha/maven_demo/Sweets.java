package com.harisha.maven_demo;
import java.util.*; 
class Sweets{
    String name;
    String type;
    int weight;
    int cost;
    Sweets(String name,String type,int weight,int cost){
        this.name=name;
        this.type=type;
        this.weight=weight;
        this.cost=cost;
    }
}
class Sortbyweight implements Comparator<Sweets> { 
    public int compare(Sweets a, Sweets b){ 
        return a.weight-b.weight; 
    } 
}
class Sortbycost implements Comparator<Sweets> { 
    public int compare(Sweets a, Sweets b){ 
        return a.cost-b.cost; 
    } 
}
class Sortbytype implements Comparator<Sweets> { 
    public int compare(Sweets a, Sweets b){ 
        return a.type.compareTo(b.type); 
    } 
}