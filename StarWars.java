public class StarWars {
    public static void main(String[] args) {
        Jedi anakinSkywalker = new AnakinSkywalker();
        System.out.println("Anakin Skywalker ereje: " + anakinSkywalker.mekkoraAzEreje());
        System.out.println("Megteremti az egyensúlyt? " + anakinSkywalker.megteremtiAzEgyensulyt());

        Uralkodo uralkodo = new Uralkodo();
        System.out.println("Uralkodó ereje: " + uralkodo.mekkoraAzEreje());
        System.out.println("Gonoszsága: " + uralkodo.getGonoszsag());

    }


}


