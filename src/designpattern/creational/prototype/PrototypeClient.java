package designpattern.creational.prototype;

public class PrototypeClient {
    public static void main(String[] args) throws CloneNotSupportedException {
        MachineImage linuxVM = new MachineImage("Linux","Symantec");
        MachineImage windowsVM = new MachineImage("Windows","MaAfee");

        MachineImage webServer= linuxVM.clone();
        webServer.install("+ web server software");

        MachineImage webAppServer= webServer.clone();
        webAppServer.install("+ app server software");

        MachineImage dbServer= linuxVM.clone();
        dbServer.install("+ db server software");

        MachineImage testMachine= windowsVM.clone();
        testMachine.install("+ test machine");

        System.out.println("web server configuration");
webServer.printSw();
        System.out.println("app server configuration");
        webAppServer.printSw();
        System.out.println("db server configuration");
        dbServer.printSw();
        System.out.println("test machine  configuration");
        testMachine.printSw();
    }
}
