public class Main {

    public static void main(String[] args) {

        ISaveable entityList = new Players();

        for (int i=0; i <= 5; i++) {

            entityList.write();
        }
        entityList.read();

        System.out.println("===============");
        entityList = new Monsters();

        for (int i=0; i <= 5; i++) {

            entityList.write();
        }
        entityList.read();
    }
}
