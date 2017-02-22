package com.liuhw.learn.pattern.birdge;

/**
 * Created by liuhw on 2017/2/21.
 */

public class BirdgeTest {

    public static void main(String[] args) {
        Driver driver = new MySqlDriver(new MySql());
        driver.driveDevice();
        driver = new OracleDriver(new Oracle());
        driver.driveDevice();
    }
}
