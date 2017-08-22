package org.sbx.entity;

import java.io.Serializable;

public class ConnectionUnit implements Serializable {

    private long cuId;

    private String cuName;


    public long getCuId() {
        return cuId;
    }

    public void setCuId(long cuId) {
        this.cuId = cuId;
    }

    public String getCuName() {
        return cuName;
    }

    public void setCuName(String cuName) {
        this.cuName = cuName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ConnectionUnit that = (ConnectionUnit) o;

        return cuId == that.cuId;
    }

    @Override
    public int hashCode() {
        return (int) (cuId ^ (cuId >>> 32));
    }
}
