package SolacePublisher;

import java.io.Serializable;

public class LoraSensor implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    String loraType;
    String loraSwitchDoor;
    String loraBatlevel;

    public LoraSensor(String loraType, String loraSwitchDoor, String loraBatlevel) {
        this.loraType = loraType;
        this.loraSwitchDoor = loraSwitchDoor;
        this.loraBatlevel = loraBatlevel;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getLoraType() {
        return loraType;
    }

    public void setLoraType(String loraType) {
        this.loraType = loraType;
    }

    public String getLoraSwitchDoor() {
        return loraSwitchDoor;
    }

    public void setLoraSwitchDoor(String loraSwitchDoor) {
        this.loraSwitchDoor = loraSwitchDoor;
    }

    public String getLoraBatlevel() {
        return loraBatlevel;
    }

    public void setLoraBatlevel(String loraBatlevel) {
        this.loraBatlevel = loraBatlevel;
    }

    @Override
    public String toString() {
        return "LoraSensor [loraBatlevel=" + loraBatlevel + ", loraSwitchDoor=" + loraSwitchDoor + ", loraType="
                + loraType + "]";
    }
    
}
