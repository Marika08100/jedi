import java.util.Random;

public class AnakinSkywalker extends Jedi implements Sith {
    AnakinSkywalker(double ero, boolean atallhatE) {
        super(ero = 150, atallhatE = true);
    }

    @Override
    public boolean megteremtiAzEgyensulyt() {
        return  getEro() > 1000;
    }

    @Override
    public void engeddElAHaragod() {
        Random random = new Random();
        setEro(random.nextDouble(0,10));

    }
}
