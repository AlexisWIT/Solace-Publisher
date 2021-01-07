package SolacePublisher;

import java.io.Serializable;

public class VariousSwitchStatus implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    String rsvSts;
    String bsvSts;
    String dsvSts;
    String hsvSts;
    String isvSts;
    String lsvSts;
    String esvSts;
    String compSts;
    String defSts;
    String inrSts;
    String ccSts;
    String efhSts;
    String eflSts;
    String cfSts;

    public VariousSwitchStatus(String rsvSts, String bsvSts, String dsvSts, String hsvSts, String isvSts, String lsvSts,
            String esvSts, String compSts, String defSts, String inrSts, String ccSts, String efhSts, String eflSts,
            String cfSts) {
        this.rsvSts = rsvSts;
        this.bsvSts = bsvSts;
        this.dsvSts = dsvSts;
        this.hsvSts = hsvSts;
        this.isvSts = isvSts;
        this.lsvSts = lsvSts;
        this.esvSts = esvSts;
        this.compSts = compSts;
        this.defSts = defSts;
        this.inrSts = inrSts;
        this.ccSts = ccSts;
        this.efhSts = efhSts;
        this.eflSts = eflSts;
        this.cfSts = cfSts;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getRsvSts() {
        return rsvSts;
    }

    public void setRsvSts(String rsvSts) {
        this.rsvSts = rsvSts;
    }

    public String getBsvSts() {
        return bsvSts;
    }

    public void setBsvSts(String bsvSts) {
        this.bsvSts = bsvSts;
    }

    public String getDsvSts() {
        return dsvSts;
    }

    public void setDsvSts(String dsvSts) {
        this.dsvSts = dsvSts;
    }

    public String getHsvSts() {
        return hsvSts;
    }

    public void setHsvSts(String hsvSts) {
        this.hsvSts = hsvSts;
    }

    public String getIsvSts() {
        return isvSts;
    }

    public void setIsvSts(String isvSts) {
        this.isvSts = isvSts;
    }

    public String getLsvSts() {
        return lsvSts;
    }

    public void setLsvSts(String lsvSts) {
        this.lsvSts = lsvSts;
    }

    public String getEsvSts() {
        return esvSts;
    }

    public void setEsvSts(String esvSts) {
        this.esvSts = esvSts;
    }

    public String getCompSts() {
        return compSts;
    }

    public void setCompSts(String compSts) {
        this.compSts = compSts;
    }

    public String getDefSts() {
        return defSts;
    }

    public void setDefSts(String defSts) {
        this.defSts = defSts;
    }

    public String getInrSts() {
        return inrSts;
    }

    public void setInrSts(String inrSts) {
        this.inrSts = inrSts;
    }

    public String getCcSts() {
        return ccSts;
    }

    public void setCcSts(String ccSts) {
        this.ccSts = ccSts;
    }

    public String getEfhSts() {
        return efhSts;
    }

    public void setEfhSts(String efhSts) {
        this.efhSts = efhSts;
    }

    public String getEflSts() {
        return eflSts;
    }

    public void setEflSts(String eflSts) {
        this.eflSts = eflSts;
    }

    public String getCfSts() {
        return cfSts;
    }

    public void setCfSts(String cfSts) {
        this.cfSts = cfSts;
    }

    @Override
    public String toString() {
        return "VariousSwitchStatus [bsvSts=" + bsvSts + ", ccSts=" + ccSts + ", cfSts=" + cfSts + ", compSts="
                + compSts + ", defSts=" + defSts + ", dsvSts=" + dsvSts + ", efhSts=" + efhSts + ", eflSts=" + eflSts
                + ", esvSts=" + esvSts + ", hsvSts=" + hsvSts + ", inrSts=" + inrSts + ", isvSts=" + isvSts
                + ", lsvSts=" + lsvSts + ", rsvSts=" + rsvSts + "]";
    }
    
}
