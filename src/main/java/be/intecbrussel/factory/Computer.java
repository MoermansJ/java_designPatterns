package be.intecbrussel.factory;

public abstract class Computer {
    //properties
    private String ram;
    private String cpu;
    private String hdd;


    //constructors
    public Computer(String ram, String cpu, String hdd){
        this.ram = ram;
        this.cpu = cpu;
        this.hdd = hdd;
    }}
