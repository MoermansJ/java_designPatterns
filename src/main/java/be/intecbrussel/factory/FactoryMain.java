package be.intecbrussel.factory;

public class FactoryMain {
    public static void main(String[] args) {
        Computer pc1 = ComputerFactory.createComputer("pc", "1", "1", "1"); //OK
        Computer server1 = ComputerFactory.createComputer("server", "2", "2", "2"); //OK
        Computer noSwitchStatement = ComputerFactory.createComputer("toaster", "3", "3", "3"); //null

        System.out.println(pc1);
        System.out.println(server1);
        System.out.println(noSwitchStatement);
    }
}
