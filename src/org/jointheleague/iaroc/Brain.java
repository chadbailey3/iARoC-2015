package org.jointheleague.iaroc;
//andrew is gre
import android.os.SystemClock;

import ioio.lib.api.IOIO;
import ioio.lib.api.exception.ConnectionLostException;

import org.wintrisstech.irobot.ioio.IRobotCreateAdapter;
import org.wintrisstech.irobot.ioio.IRobotCreateInterface;
import org.jointheleague.iaroc.sensors.UltraSonicSensors;

public class Brain extends IRobotCreateAdapter {
    private final Dashboard dashboard;
    public UltraSonicSensors sonar;

    public Brain(IOIO ioio, IRobotCreateInterface create, Dashboard dashboard)
            throws ConnectionLostException {
        super(create);
        sonar = new UltraSonicSensors(ioio);
        this.dashboard = dashboard;
    }

    /* Thaaaaaaaaaaaaaz2qq  is method is executed when the robot first starts up. */
    public void initialize() throws ConnectionLostException {
        dashboard.log("Hello! I'm a Clever Robot!");
        //what would you like me to do, Clever Human?
    }

    /* This method is called repeatedly. */
    public void loop() throws ConnectionLostException {
//Gold Rush Code


// Maze Runner Code
//        readSensors(SENSORS_BUMPS_AND_WHEEL_DROPS);
//        driveDirect(175, 500);
//        if (isBumpRight())
//        {
//            driveDirect(-500, -500);
//            SystemClock.sleep(350);
//            driveDirect(500, -500);
//            SystemClock.sleep(350);
//        }
findBeacon();
    }
    public void goldRushCode(){
        readSensors(SENSORS_INFRARED_BYTE);
//        dashboard.log(getInfraredByte() + "");
//        if (getInfraredByte() == 248) {
//            driveDirect(500, 500);
//        } else if (getInfraredByte() == 244) {
//            driveDirect(500, 500);
//        } else if (getInfraredByte() == 255 || getInfraredByte() == 240) {
//            driveDirect(-100, 100);
//        }
//        else if (getInfraredByte() == 242) {
//            driveDirect(500, 500);
//        }
//        else if (getInfraredByte() == 246) {
//            driveDirect(500, 500);
//        }
//        else if (getInfraredByte() == 250) {
//            driveDirect(500, 500);
//        }
//        else {
//            driveDirect(0, 0);
//        }
    }
    public void findBeacon(){
        try {
            driveDirect(-250, 250);
            SystemClock.sleep(3250);
            driveDirect(0, 0);
            SystemClock.sleep(2000);
        } catch (ConnectionLostException e) {
            e.printStackTrace();
        }

    }
}