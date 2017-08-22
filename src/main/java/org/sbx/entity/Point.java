package org.sbx.entity;

import java.io.Serializable;

public class Point implements Serializable {

    private long pointId;

    private int pointNumber;

    private Point linkedPoint;
    
    private Point linkOwner;

    public long getPointId() {
        return pointId;
    }

    public void setPointId(long pointId) {
        this.pointId = pointId;
    }

    public int getPointNumber() {
        return pointNumber;
    }

    public void setPointNumber(int pointNumber) {
        this.pointNumber = pointNumber;
    }

    public Point getLinkedPoint() {
        return linkedPoint;
    }

    public void setLinkedPoint(Point linkedPoint) {
        this.linkedPoint = linkedPoint;
    }

    public Point getLinkOwner() {
        return linkOwner;
    }

    public void setLinkOwner(Point linkOwner) {
        this.linkOwner = linkOwner;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Point point = (Point) o;

        return pointId == point.pointId;
    }

    @Override
    public int hashCode() {
        return (int) (pointId ^ (pointId >>> 32));
    }
}
