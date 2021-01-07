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

import java.io.Serializable;

public class TriaxialSensor implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    String accelerationX;
    String accelerationY;
    String accelerationZ;

    public TriaxialSensor(String accelerationX, String accelerationY, String accelerationZ) {
        this.accelerationX = accelerationX;
        this.accelerationY = accelerationY;
        this.accelerationZ = accelerationZ;
    }

    public static long getSerialversionuid() {
        return serialVersionUID;
    }

    public String getAccelerationX() {
        return accelerationX;
    }

    public void setAccelerationX(String accelerationX) {
        this.accelerationX = accelerationX;
    }

    public String getAccelerationY() {
        return accelerationY;
    }

    public void setAccelerationY(String accelerationY) {
        this.accelerationY = accelerationY;
    }

    public String getAccelerationZ() {
        return accelerationZ;
    }

    public void setAccelerationZ(String accelerationZ) {
        this.accelerationZ = accelerationZ;
    }

    @Override
    public String toString() {
        return "TriaxialSensor [accelerationX=" + accelerationX + ", accelerationY=" + accelerationY
                + ", accelerationZ=" + accelerationZ + "]";
    }

}
