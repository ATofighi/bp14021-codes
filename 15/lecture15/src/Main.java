public class Main {

    public static void main(String[] args) {

        Cake cake1 = new Cake("shokolati");
        Cake cake2 = new Cake("shokolati");
        Cake cake3 = cake1;

        System.out.println("all cakes: " + Cake.getAllCakeCount());

        System.out.println("cake1: " + cake1.getCurrentCakeNumber());
        System.out.println("cake2: " + cake2.getCurrentCakeNumber());
        System.out.println("cake3: " + cake3.getCurrentCakeNumber());
//
//        System.out.println(cake1 == cake2);
//        System.out.println(cake1.equals(cake2));
    }
}


