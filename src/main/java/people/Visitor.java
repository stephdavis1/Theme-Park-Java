package people;

import attractions.Attraction;
import org.w3c.dom.Attr;

import java.util.ArrayList;


public class Visitor {

    private int age;
    private double height;
    private double money;
    private ArrayList<Attraction> visitedAttractions;

    public Visitor(int age, double height, double money) {
        this.age = age;
        this.height = height;
        this.money = money;
        this.visitedAttractions = new ArrayList<Attraction>();
    }

    public int getAge() {
        return age;
    }

    public double getHeight() {
        return height;
    }

    public double getMoney() {
        return money;
    }

    public ArrayList getAllVisitedAttractions(){
        return this.visitedAttractions;
    }

    public void addAttraction(Attraction attraction){
        this.visitedAttractions.add(attraction);
    }

    public int visitedAttractionsCount(){
        return this.visitedAttractions.size();
    }


}
