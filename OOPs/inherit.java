package OOPs;

// class Flower{
//     String petals="Flower has petals";
//     String color= "Flower has colors";
//     }
    class Rose extends Flower{
        String fragrance = "Rose has a sweet smell";
    }

public class inherit {
    public static void main(String[] args) {
        Rose obj = new Rose();
        obj.color = "red";
        obj.petals ="many";
        System.out.println(obj.fragrance +" "+ obj.color +" "+ obj.petals);
    }
}
