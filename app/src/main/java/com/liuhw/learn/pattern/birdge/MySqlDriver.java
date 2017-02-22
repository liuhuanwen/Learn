package com.liuhw.learn.pattern.birdge;

/**
 * Created by liuhw on 2017/2/21.
 */

public class MySqlDriver implements Driver {

    private Database database;

    public MySqlDriver(Database database) {
        this.database = database;
    }

    @Override
    public void driveDevice() {
        System.out.println("drive mysql database");
        database.insert();
    }
}
