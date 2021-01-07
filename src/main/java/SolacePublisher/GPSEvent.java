/*
 * Licensed to the Apache Software Foundation (ASF) under one
 * or more contributor license agreements.  See the NOTICE file
 * distributed with this work for additional information
 * regarding copyright ownership.  The ASF licenses this file
 * to you under the Apache License, Version 2.0 (the
 * "License"); you may not use this file except in compliance
 * with the License.  You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package SolacePublisher;


public class GPSEvent {

    String id;
    String seqno;
    String cntrNum;
    String revTime;
    String cltTime;
    String locateTime;
    String eleState;
    String batLevel;
    String opMode;
    String setTem;
    String supTem;
    String retTem;
    String hum;
    String lng;
    String lat;
    String speed;
    String direction;
    String posFlag;
    String gpsNum;
    String bdNum;
    String ambs;
    String hs;
    String usda1;
    String usda2;
    String usda3;

    String o2Setpoint;
    String co2Setpoint;
    String boxType;
    String o2;
    String co2;
    String caMode;

    String hpt;
    String faultCode;
    String ism;
    String carrier;
    String lpt;
    String pt;
    String ct1;
    String ct2;
    String eis;
    String eos;
    String dchs;
    String sgs;
    String smv;
    String ev;
    String dss;
    String drs;
    String isc;
    String isa;
    String cts;
    String eventLog;
    Boolean isEventLog;

    Object triaxialSensor;
    Object doorOpenSensor;
    Object varSwitchStatus;

    String eventLogType;
    String serialNum;

    public GPSEvent(String id, String seqno, String cntrNum) {
        this.id = id;
        this.seqno = seqno;
        this.cntrNum = cntrNum;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getSeqno() {
        return seqno;
    }

    public void setSeqno(String seqno) {
        this.seqno = seqno;
    }

    public String getCntrNum() {
        return cntrNum;
    }

    public void setCntrNum(String cntrNum) {
        this.cntrNum = cntrNum;
    }

    public String getRevTime() {
        return revTime;
    }

    public void setRevTime(String revTime) {
        this.revTime = revTime;
    }

    public String getCltTime() {
        return cltTime;
    }

    public void setCltTime(String cltTime) {
        this.cltTime = cltTime;
    }

    public String getLocateTime() {
        return locateTime;
    }

    public void setLocateTime(String locateTime) {
        this.locateTime = locateTime;
    }

    public String getEleState() {
        return eleState;
    }

    public void setEleState(String eleState) {
        this.eleState = eleState;
    }

    public String getBatLevel() {
        return batLevel;
    }

    public void setBatLevel(String batLevel) {
        this.batLevel = batLevel;
    }

    public String getOpMode() {
        return opMode;
    }

    public void setOpMode(String opMode) {
        this.opMode = opMode;
    }

    public String getSetTem() {
        return setTem;
    }

    public void setSetTem(String setTem) {
        this.setTem = setTem;
    }

    public String getSupTem() {
        return supTem;
    }

    public void setSupTem(String supTem) {
        this.supTem = supTem;
    }

    public String getRetTem() {
        return retTem;
    }

    public void setRetTem(String retTem) {
        this.retTem = retTem;
    }

    public String getHum() {
        return hum;
    }

    public void setHum(String hum) {
        this.hum = hum;
    }

    public String getLng() {
        return lng;
    }

    public void setLng(String lng) {
        this.lng = lng;
    }

    public String getLat() {
        return lat;
    }

    public void setLat(String lat) {
        this.lat = lat;
    }

    public String getSpeed() {
        return speed;
    }

    public void setSpeed(String speed) {
        this.speed = speed;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getPosFlag() {
        return posFlag;
    }

    public void setPosFlag(String posFlag) {
        this.posFlag = posFlag;
    }

    public String getGpsNum() {
        return gpsNum;
    }

    public void setGpsNum(String gpsNum) {
        this.gpsNum = gpsNum;
    }

    public String getBdNum() {
        return bdNum;
    }

    public void setBdNum(String bdNum) {
        this.bdNum = bdNum;
    }

    public String getAmbs() {
        return ambs;
    }

    public void setAmbs(String ambs) {
        this.ambs = ambs;
    }

    public String getHs() {
        return hs;
    }

    public void setHs(String hs) {
        this.hs = hs;
    }

    public String getUsda1() {
        return usda1;
    }

    public void setUsda1(String usda1) {
        this.usda1 = usda1;
    }

    public String getUsda2() {
        return usda2;
    }

    public void setUsda2(String usda2) {
        this.usda2 = usda2;
    }

    public String getUsda3() {
        return usda3;
    }

    public void setUsda3(String usda3) {
        this.usda3 = usda3;
    }

    public String getO2Setpoint() {
        return o2Setpoint;
    }

    public void setO2Setpoint(String o2Setpoint) {
        this.o2Setpoint = o2Setpoint;
    }

    public String getCo2Setpoint() {
        return co2Setpoint;
    }

    public void setCo2Setpoint(String co2Setpoint) {
        this.co2Setpoint = co2Setpoint;
    }

    public String getBoxType() {
        return boxType;
    }

    public void setBoxType(String boxType) {
        this.boxType = boxType;
    }

    public String getO2() {
        return o2;
    }

    public void setO2(String o2) {
        this.o2 = o2;
    }

    public String getCo2() {
        return co2;
    }

    public void setCo2(String co2) {
        this.co2 = co2;
    }

    public String getCaMode() {
        return caMode;
    }

    public void setCaMode(String caMode) {
        this.caMode = caMode;
    }

    public String getHpt() {
        return hpt;
    }

    public void setHpt(String hpt) {
        this.hpt = hpt;
    }

    public String getFaultCode() {
        return faultCode;
    }

    public void setFaultCode(String faultCode) {
        this.faultCode = faultCode;
    }

    public String getIsm() {
        return ism;
    }

    public void setIsm(String ism) {
        this.ism = ism;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getLpt() {
        return lpt;
    }

    public void setLpt(String lpt) {
        this.lpt = lpt;
    }

    public String getPt() {
        return pt;
    }

    public void setPt(String pt) {
        this.pt = pt;
    }

    public String getCt1() {
        return ct1;
    }

    public void setCt1(String ct1) {
        this.ct1 = ct1;
    }

    public String getCt2() {
        return ct2;
    }

    public void setCt2(String ct2) {
        this.ct2 = ct2;
    }

    public String getEis() {
        return eis;
    }

    public void setEis(String eis) {
        this.eis = eis;
    }

    public String getEos() {
        return eos;
    }

    public void setEos(String eos) {
        this.eos = eos;
    }

    public String getDchs() {
        return dchs;
    }

    public void setDchs(String dchs) {
        this.dchs = dchs;
    }

    public String getSgs() {
        return sgs;
    }

    public void setSgs(String sgs) {
        this.sgs = sgs;
    }

    public String getSmv() {
        return smv;
    }

    public void setSmv(String smv) {
        this.smv = smv;
    }

    public String getEv() {
        return ev;
    }

    public void setEv(String ev) {
        this.ev = ev;
    }

    public String getDss() {
        return dss;
    }

    public void setDss(String dss) {
        this.dss = dss;
    }

    public String getDrs() {
        return drs;
    }

    public void setDrs(String drs) {
        this.drs = drs;
    }

    public String getIsc() {
        return isc;
    }

    public void setIsc(String isc) {
        this.isc = isc;
    }

    public String getIsa() {
        return isa;
    }

    public void setIsa(String isa) {
        this.isa = isa;
    }

    public String getCts() {
        return cts;
    }

    public void setCts(String cts) {
        this.cts = cts;
    }

    public String getEventLog() {
        return eventLog;
    }

    public void setEventLog(String eventLog) {
        this.eventLog = eventLog;
    }

    public Boolean getIsEventLog() {
        return isEventLog;
    }

    public void setIsEventLog(Boolean isEventLog) {
        this.isEventLog = isEventLog;
    }

    public Object getTriaxialSensor() {
        return triaxialSensor;
    }

    public void setTriaxialSensor(Object triaxialSensor) {
        this.triaxialSensor = triaxialSensor;
    }

    public Object getDoorOpenSensor() {
        return doorOpenSensor;
    }

    public void setDoorOpenSensor(Object doorOpenSensor) {
        this.doorOpenSensor = doorOpenSensor;
    }

    public Object getVarSwitchStatus() {
        return varSwitchStatus;
    }

    public void setVarSwitchStatus(Object varSwitchStatus) {
        this.varSwitchStatus = varSwitchStatus;
    }

    public String getEventLogType() {
        return eventLogType;
    }

    public void setEventLogType(String eventLogType) {
        this.eventLogType = eventLogType;
    }

    public String getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(String serialNum) {
        this.serialNum = serialNum;
    }

    @Override
    public String toString() {
        return "GPSEvent [ambs=" + ambs + ", batLevel=" + batLevel + ", bdNum=" + bdNum + ", boxType=" + boxType
                + ", caMode=" + caMode + ", carrier=" + carrier + ", cltTime=" + cltTime + ", cntrNum=" + cntrNum
                + ", co2=" + co2 + ", co2Setpoint=" + co2Setpoint + ", ct1=" + ct1 + ", ct2=" + ct2 + ", cts=" + cts
                + ", dchs=" + dchs + ", direction=" + direction + ", doorOpenSensor=" + doorOpenSensor + ", drs=" + drs
                + ", dss=" + dss + ", eis=" + eis + ", eleState=" + eleState + ", eos=" + eos + ", ev=" + ev
                + ", eventLog=" + eventLog + ", eventLogType=" + eventLogType + ", faultCode=" + faultCode + ", gpsNum="
                + gpsNum + ", hpt=" + hpt + ", hs=" + hs + ", hum=" + hum + ", id=" + id + ", isEventLog=" + isEventLog
                + ", isa=" + isa + ", isc=" + isc + ", ism=" + ism + ", lat=" + lat + ", lng=" + lng + ", locateTime="
                + locateTime + ", lpt=" + lpt + ", o2=" + o2 + ", o2Setpoint=" + o2Setpoint + ", opMode=" + opMode
                + ", posFlag=" + posFlag + ", pt=" + pt + ", retTem=" + retTem + ", revTime=" + revTime + ", seqno="
                + seqno + ", serialNum=" + serialNum + ", setTem=" + setTem + ", sgs=" + sgs + ", smv=" + smv
                + ", speed=" + speed + ", supTem=" + supTem + ", triaxialSensor=" + triaxialSensor + ", usda1=" + usda1
                + ", usda2=" + usda2 + ", usda3=" + usda3 + ", varSwitchStatus=" + varSwitchStatus + "]";
    }

    
}
