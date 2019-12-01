package dell.egineercop.smarthome;

import static java.lang.System.out;

public class SmartHome {

    public void run() {
        LightBulb211 lightBulb211 = new LightBulb211();
        Switch203 switch203 = new Switch203();

        while(true){
            if (switch203.isOn()){
                lightBulb211.turnOn();
            }else{
                lightBulb211.turnOff();
            }
            out.println(lightBulb211.isOn());
        }
    }
}
