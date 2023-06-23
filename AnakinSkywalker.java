import java.util.Random;

public class AnakinSkywalker extends Jedi implements Sith {
    AnakinSkywalker() {
        super( 150,  true);
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
