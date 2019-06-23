package com.zipcodewilmington.froilansfarm;

import java.util.List;

public class Farm {

    private Field field;

    private FarmHouse house;

    private List<Stable> stables;
    private List<ChickenCoop> coops;


    public Farm() {

    }

    protected void setUpFarm(){
        // set up field
        field = new Field();
        field.plantRow(new CropRow<CornStalk>());
        field.plantRow(new CropRow<TomatoPlant>());
        field.plantRow(new CropRow<TomatoPlant>());
        field.plantRow(new CropRow<OkraPlant>());
        field.plantRow(new CropRow<PotatoPlant>());
        field.plantRow(new CropRow<SoyPlant>());

        // set up farmhouse
        house = FarmHouse.getInstance();
        for(int i = 0; i < 1000; i++){
            house.getFridge().add(new EarCorn());
        }
        for(int i = 0; i < 100; i++){
            house.getFridge().add(new Edamame());
            house.getFridge().add(new Okra());
            house.getFridge().add(new Potato());
            house.getFridge().add(new Tomato());
        }

        // set up stables
        for(int i = 0; i < 3; i++){
            stables.add(new Stable());
            for(int j = 0; j < 3; j++){
                stables.get(i).add(new Horse());
            }
        }
        stables.get(0).add(new Horse());

        // set up coops
        for(int i = 0; i < 4; i++){
            coops.add(new ChickenCoop());
            for(int j=0; j < 3; j++){
                coops.get(i).add(new Chicken());
            }
        }
        for(int i= 0; i < 3; i++){
            coops.get(i).add(new Chicken());
        }
    }


    public List<Stable> getStables(){
        return stables;
    }


    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public FarmHouse getHouse() {
        return house;
    }

    public void setHouse(FarmHouse house) {
        this.house = house;
    }

    public void setStables(List<Stable> stables) {
        this.stables = stables;
    }

    public List<ChickenCoop> getCoops() {
        return coops;
    }

    public void setCoops(List<ChickenCoop> coops) {
        this.coops = coops;
    }
}
