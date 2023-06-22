public abstract class Jedi implements EroErzekeny {
    private double ero;
    private boolean atallhatE;

    Jedi(double ero, boolean atallhatE) {
        this.ero = ero;
        this.atallhatE = atallhatE;
    }

    public abstract boolean megteremtiAzEgyensulyt();

    @Override
    public double mekkoraAzEreje() {
        return ero;
    }

    @Override
    public boolean legyoziE(EroErzekeny eroErzekeny) {
        if (eroErzekeny instanceof Jedi) {
            Jedi jedi = (Jedi) eroErzekeny;
            if (atallhatE && jedi.atallhatE) {
                return jedi.ero < this.ero;
// Uralkodo objektum legyozese hianyzik
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
