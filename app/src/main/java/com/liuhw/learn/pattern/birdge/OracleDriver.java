package com.liuhw.learn.pattern.birdge;

/**
 * Created by liuhw on 2017/2/21.
 */

public class OracleDriver implements Driver {

    private Database database;

    public OracleDriver(Database database) {
        this.database = database;
    }

    @Override
    public void driveDevice() {
        System.out.println("drive oracle database");
        this.database.insert();
    }
}
