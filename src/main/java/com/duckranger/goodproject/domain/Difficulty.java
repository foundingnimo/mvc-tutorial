package com.duckranger.goodproject.domain;

public enum Difficulty {
    EASY_ACCESS("Easy access short walk"),
    SHORT("Short walk"),
    WALKING_TRACK("Walking track"),
    EASY_TRAMP("Great walk / Easier tramping track"),
    TRAMP("Tramping track"),
    ROUTE("Route");

    private String description;

    private Difficulty(String description) {
	this.description = description;
    }

    public String getValue() {
	return name();
    }

    public String getDescription() {
	return description;
    }
}
