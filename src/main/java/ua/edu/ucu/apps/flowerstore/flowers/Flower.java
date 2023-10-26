package ua.edu.ucu.apps.flowerstore.flowers;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor @Getter
public class Flower {
    private double price;
    private double sepalLength;
    private FlowerColor color;
}
