public abstract class Jedi implements EroErzekeny {
    private double ero;
    private boolean atallhatE;

    public Jedi(double ero, boolean atallhatE) {
        this.ero = ero;
        this.atallhatE = atallhatE;
    }


    public abstract boolean megteremtiAzEgyensulyt();

    @Override
    public double mekkoraAzEreje() {
        return ero;
    }

    public boolean legyoziE(EroErzekeny ellenseg) {
        if (ellenseg instanceof Jedi jedi) {
            if (ellenseg instanceof Uralkodo uralkodo) {
                return atallhatE && jedi.atallhatE && jedi.ero > uralkodo.getGonoszsag() * 2; // Uralkodo legyőzése
            } else {
                return atallhatE && jedi.atallhatE && jedi.ero < this.ero; // Jedi legyőzése
            }
        }
        return false;
    }


    public double getEro() {
        return ero;
    }

    public void setEro(double ero) {
        this.ero = ero;
    }

    public boolean isAtallhatE() {
        return atallhatE;
    }

    public void setAtallhatE(boolean atallhatE) {
        this.atallhatE = atallhatE;
    }

    @Override
    public String toString() {
        return "Jedi{" +
                "ero=" + ero +
                ", atallhatE=" + atallhatE +
                '}';
    }
}
