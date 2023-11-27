package com.java_ee.servlet.lesson1;

import java.util.Random;

public class Product {

    private final String[] PRODUCT_NAME = {"LuxeBlend", "EcoHarbor", "VitaVista", "GloGrove", "CrispCraft",
            "QuantuQuill", "ZestifyZen", "AquaSculpt", "FloraFlicker", "SwiftSpark", "SereniSip", "SolarLoom",
            "PulsePetal", "ZephyrZoom", "BrioBurst", "NexaNourish", "EpicureEase", "VelvetVista", "AetherAura",
            "RetroRipple"};

    private int id;
    private String title;
    private int cost;

    private static int idCounter = 0;
    Random random = new Random();

    public Product() {
        this.id = idCounter++;
        this.title = PRODUCT_NAME[random.nextInt(19)];
        this.cost = random.nextInt();
    }

    public Product(int id, String title, int cost) {
        this.id = id;
        this.title = title;
        this.cost = cost;
    }

    public String getTitle() {
        return title;
    }
}
