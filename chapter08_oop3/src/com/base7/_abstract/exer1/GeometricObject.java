package com.base7._abstract.exer1;

/**
 * @Author myf15609
 * @Date 2023/8/21
 */
public abstract class GeometricObject {
    protected String clolr;
    protected double weight;

    public GeometricObject() {
    }

    public GeometricObject(String clolr, double weight) {
        this.clolr = clolr;
        this.weight = weight;
    }

    public String getClolr() {
        return clolr;
    }

    public void setClolr(String clolr) {
        this.clolr = clolr;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public abstract double findArea();
}
