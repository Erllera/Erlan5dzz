package com.company;

public class Main {




    public static void main(String[] args) {


        for (int i = 0; i < createHeroes().length; i++) {
            System.out.println(createHeroes()[i].getHeroHealth()+" "+ createHeroes()[i].getHeroDamage()+" "+createHeroes()[i].getSuperSkill());
        }



        Boss bosss = new Boss();
        bosss.setBossHealth(1000);
        bosss.setBossDamage(70);
        bosss.setDefence("Физическая защита");

        System.out.println("Здоровье босса: "+bosss.getBossHealth()+" Урон босса: "+
                bosss.getBossDamage()+" Защита босса: "+bosss.getDefence());

    }



    public static Hero[] createHeroes(){
        Hero SpiderMan = new Hero(600, 50,"Паутина");
        Hero IronMan = new Hero(800, 100, "Block");
        Hero SuperMan = new Hero(1500,150,"Супер удар");

        Hero heroes[]={SpiderMan, IronMan, SuperMan};

        return heroes;


    }













}
