public class Uralkodo implements EroErzekeny,Sith{
    private double gonoszsag;
    public Uralkodo(){
        this.gonoszsag = 100;
    }
    @Override
    public boolean legyoziE(EroErzekeny ellenseg) {
        return ellenseg.mekkoraAzEreje() < this.gonoszsag;
    }

    @Override
    public double mekkoraAzEreje() {
        return 2 * this.gonoszsag;
    }

    @Override
    public void engeddElAHaragod() {
        this.gonoszsag += 50;

    }

    public double getGonoszsag() {
        return gonoszsag;
    }

    public void setGonoszsag(double gonoszsag) {
        this.gonoszsag = gonoszsag;
    }

    @Override
    public String toString() {
        return "Uralkodo{" +
                "gonoszsag=" + gonoszsag ;
    }
}
