import java.util.Random;

public class AnakinSkywalker extends Jedi implements Sith {
    AnakinSkywalker() {
        super( 150,  true);
    }

    @Override
    public boolean megteremtiAzEgyensulyt() {
        return getEro() > 1000;
    }

    @Override
    public void engeddElAHaragod() {
        Random random = new Random();
        super.setEro(super.getEro()
                + random.nextDouble(0,10));

    }

    @Override
    public String toString() {
        return "AnakinSkywalker: " + super.toString();
    }
}
