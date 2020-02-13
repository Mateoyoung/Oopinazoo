public class zoo {

    public static void main(String[] args) {
        Animal Tigger = new Tiger("tigger");
        Animal Pooh = new Bear("Pooh");
        Animal Stinger = new Bee("Stinger");
        Animal Gemma = new Giraffe("Gemma");
        Animal Rarity = new Unicorn("Rarity");



        //Tigger.eat("meat");
        //Pooh.eat("fish");
        //Pooh.eat("meat");
        //Rarity.eat("marshmallows");
        //Gemma.eat("meat");
        //Gemma.eat("leaves");
        //Stinger.eat("ice cream");
        //Stinger.eat("pollen");

        Zookeeper Zoebot = new Zookeeper("Zoebot");
        Animal[] animals = {Tigger,Pooh,Rarity,Gemma,Stinger};
        Zoebot.feedAnimals(animals,"noodles");




    }
}