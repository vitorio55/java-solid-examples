package com.learning.solid.interface_segregation.without;

import com.learning.solid.Example;
import com.learning.solid.interface_segregation.without.phonetypes.BasicCellphone;
import com.learning.solid.interface_segregation.without.phonetypes.LandlinePhone;
import com.learning.solid.interface_segregation.without.phonetypes.SmartPhone;
import com.learning.solid.interface_segregation.without.phonetypes.Telephone;
import jdk.jshell.spi.ExecutionControl;

public class Non_I_Example implements Example {

    @Override
    public void runExample() throws ExecutionControl.NotImplementedException {
        System.out.println("==> Running Non-Interface Segregation Principle example (all methods must be implemented).");

        LandlinePhone landlinePhone = new LandlinePhone();
        BasicCellphone basicCellphone = new BasicCellphone();
        SmartPhone smartPhone = new SmartPhone();

        System.out.println("-->" + landlinePhone.getClassName());
        this.operatePhone(landlinePhone);

        System.out.println("-->" + basicCellphone.getClassName());
        this.operatePhone(basicCellphone);

        System.out.println("-->" + smartPhone.getClassName());
        this.operatePhone(smartPhone);
    }

    private void operatePhone(Telephone telephone) {
        try { telephone.call(); }
        catch (ExecutionControl.NotImplementedException ex) { System.out.println(ex.getMessage()); }

        try { telephone.hangUp(); }
        catch (ExecutionControl.NotImplementedException ex) { System.out.println(ex.getMessage()); }

        try { telephone.powerOn(); }
        catch (ExecutionControl.NotImplementedException ex) { System.out.println(ex.getMessage()); }

        try { telephone.powerOff(); }
        catch (ExecutionControl.NotImplementedException ex) { System.out.println(ex.getMessage()); }

        try { telephone.addContact(); }
        catch (ExecutionControl.NotImplementedException ex) { System.out.println(ex.getMessage()); }

        try { telephone.removeContact(); }
        catch (ExecutionControl.NotImplementedException ex) { System.out.println(ex.getMessage()); }

        try { telephone.installApp(); }
        catch (ExecutionControl.NotImplementedException ex) { System.out.println(ex.getMessage()); }

        try { telephone.removeApp(); }
        catch (ExecutionControl.NotImplementedException ex) { System.out.println(ex.getMessage()); }
    }
}
