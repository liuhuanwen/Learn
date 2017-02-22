package com.liuhw.learn.pattern.facade;

/**
 * Created by liuhw on 2017/2/21.
 * 外观模式
 */

public class Computer {

    private CPU cpu;
    private Memory memory;
    private Disk disk;

    public Computer() {
        this.cpu = new CPU();
        this.memory = new Memory();
        this.disk = new Disk();
    }

    public void startup() {
        this.cpu.startup();
        this.memory.startup();
        this.disk.startup();
    }

    public void shutdown() {
        this.cpu.shutdown();
        this.memory.shutdown();
        this.disk.shutdown();
    }
}
