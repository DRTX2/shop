package com.drtx.demo.core.model.rating;

public enum RatingLevel {
    ONE(1, "Muy malo"),
    TWO(2, "Malo"),
    THREE(3, "Regular"),
    FOUR(4, "Bueno"),
    FIVE(5, "Excelente");

    private final int value;
    private final String description;

    RatingLevel(int value, String description){
        this.value=value;
        this.description=description;
    }

    public int getValue() {
        return value;
    }

    public String getDescription() {
        return description;
    }

    public static RatingLevel fromValue(int value){
        for(RatingLevel level:values()){
            if(level.getValue()==value) return level;
        }
        throw new IllegalArgumentException("Ivalid rating value: "+value);
    }
}
