package com.learning.solid.interface_segregation.with;

import com.learning.solid.Example;
import com.learning.solid.interface_segregation.with.devicetypes.AppDevice;
import com.learning.solid.interface_segregation.with.devicetypes.ContactStorageDevice;
import com.learning.solid.interface_segregation.with.devicetypes.Device;
import com.learning.solid.interface_segregation.with.phonetypes.*;
import jdk.jshell.spi.ExecutionControl;

public class I_Example implements Example {

    @Override
    public void runExample() throws ExecutionControl.NotImplementedException {
        System.out.println("==> Running Interface Segregation Principle example (only the necessary methods are implemented!).");

        // Unlike the Non-Interface Segregation Principle example, here we have small interfaces.
        // Each telephone type that requires extra operations can extend and implement an extra small interface.
        // This is compliant with the Interface Segregation Principle.

        LandlinePhone landlinePhone = new LandlinePhone();
        BasicCellphone basicCellphone = new BasicCellphone();
        SmartPhone smartPhone = new SmartPhone();

        System.out.println("-->" + landlinePhone.getClassName());
        this.operateTelephone(landlinePhone);

        System.out.println("-->" + basicCellphone.getClassName());
        this.operateTelephone(basicCellphone);
        this.operateDevice(basicCellphone);
        this.operateContactStorageDevice(basicCellphone);

        System.out.println("-->" + smartPhone.getClassName());
        this.operateTelephone(smartPhone);
        this.operateDevice(smartPhone);
        this.operateContactStorageDevice(smartPhone);
        this.operateAppDevice(smartPhone);
    }

    private void operateTelephone(Telephone phone) {
        phone.call();
        phone.hangUp();
    }

    private void operateDevice(Device device) {
        device.powerOn();
        device.powerOff();
    }

    private void operateContactStorageDevice(ContactStorageDevice device) {
        device.addContact();
        device.removeContact();
    }

    private void operateAppDevice(AppDevice device) {
        device.installApp();
        device.removeApp();
    }
}
