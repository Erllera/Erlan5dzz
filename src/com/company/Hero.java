package com.company;

public class Hero {
    private int HeroHealth;
    private int HeroDamage;
    private String SuperSkill;


    public Hero(int HeroHealth, int HeroDamage, String SuperSkill){
        this.HeroDamage = HeroDamage;
        this.HeroHealth = HeroHealth;
        this.SuperSkill = SuperSkill;
    }

    public Hero(int HeroHealth, int HeroDamage){
        this.HeroHealth= HeroHealth;
        this.HeroDamage= HeroDamage;
    }

    public int getHeroHealth() {
        return HeroHealth;
    }

    public int getHeroDamage() {
        return HeroDamage;
    }

    public String getSuperSkill() {
        return SuperSkill;
    }
}
