package com.duckranger.goodproject.domain;

import javax.persistence.Entity;

import org.springframework.data.jpa.domain.AbstractPersistable;

@Entity
public class Tramp extends AbstractPersistable<Long> {

    private static final long serialVersionUID = 1L;

    private String name;
    private double distance;
    private Difficulty difficulty;

    public String getName() {
	return name;
    }

    public void setName(String name) {
	this.name = name;
    }

    public double getDistance() {
	return distance;
    }

    public void setDistance(double distance) {
	this.distance = distance;
    }

    public Difficulty getDifficulty() {
	return difficulty;
    }

    public void setDifficulty(Difficulty difficulty) {
	this.difficulty = difficulty;
    }

}
