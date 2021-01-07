package SolacePublisher;

import java.io.Serializable;

public class DoorOpenSensor implements Serializable{

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    String loraType;
    String loraSwitchDoor;
    String loraBatLevel;
    String snr;
    String rssi;

    public DoorOpenSensor(String loraType, String loraSwitchDoor, String loraBatLevel, String snr, String rssi) {
        this.loraType = loraType;
        this.loraSwitchDoor = loraSwitchDoor;
        this.loraBatLevel = loraBatLevel;
        this.snr = snr;
        this.rssi = rssi;
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

    public String getLoraBatLevel() {
        return loraBatLevel;
    }

    public void setLoraBatLevel(String loraBatLevel) {
        this.loraBatLevel = loraBatLevel;
    }

    public String getSnr() {
        return snr;
    }

    public void setSnr(String snr) {
        this.snr = snr;
    }

    public String getRssi() {
        return rssi;
    }

    public void setRssi(String rssi) {
        this.rssi = rssi;
    }

    @Override
    public String toString() {
        return "DoorOpenSensor [loraBatLevel=" + loraBatLevel + ", loraSwitchDoor=" + loraSwitchDoor + ", loraType="
                + loraType + ", rssi=" + rssi + ", snr=" + snr + "]";
    }
    
}
