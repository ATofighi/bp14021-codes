public class Cake {
    private static int allCakeCount;
    private int currentCakeNumber;

    private boolean keshmeshi;
    private boolean shokolati;
    private double shirini;
    private double weight;

    public Cake(String type) {
        allCakeCount++;
        currentCakeNumber = allCakeCount;
        if(type.equals("keshmeshi")) {
            keshmeshi = true;
        } else if (type.equals("shokolati")) {
            shokolati = true;
        }
        shirini = 0.5;
        weight = 10;
    }

    public boolean isKeshmeshi() {
        return keshmeshi;
    }

    public void setKeshmeshi(boolean keshmeshi) {
        this.keshmeshi = keshmeshi;
    }

    public boolean isShokolati() {
        return shokolati;
    }

    public void setShokolati(boolean shokolati) {
        this.shokolati = shokolati;
    }

    public double getShirini() {
        return shirini;
    }

    public void setShirini(double shirini) {
        this.shirini = shirini;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0) {
            weight = 0;
        }
        this.weight = weight;
    }

    public int getCurrentCakeNumber() {
        return currentCakeNumber;
    }

    public static int getAllCakeCount() {
        return allCakeCount;
    }

    public boolean equals(Cake c) {
        if (c.shokolati != this.shokolati) {
            return false;
        }
        if (c.keshmeshi != this.keshmeshi) {
            return false;
        }
        if (c.weight != this.weight) {
            return false;
        }
        if (c.shirini != this.shirini) {
            return false;
        }
        return true;
    }
}
