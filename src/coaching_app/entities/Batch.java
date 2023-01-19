package coaching_app.entities;

import java.util.List;
import java.util.Objects;

public class Batch {
    private Integer batchId;
    private String batchName;
    private String batchLocation;
    private Integer batchTime;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Batch batch = (Batch) o;
        return Objects.equals(batchId, batch.batchId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(batchId);
    }

    @Override
    public String toString() {
        return "Batch{" +
                "batchId=" + batchId +
                ", batchName='" + batchName + '\'' +
                ", batchLocation='" + batchLocation + '\'' +
                ", batchTime=" + batchTime +
                '}';
    }

    public Batch() {
    }

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    public String getBatchLocation() {
        return batchLocation;
    }

    public void setBatchLocation(String batchLocation) {
        this.batchLocation = batchLocation;
    }

    public Integer getBatchTime() {
        return batchTime;
    }

    public void setBatchTime(Integer batchTime) {
        this.batchTime = batchTime;
    }

    public Batch(Integer batchId, String batchName, String batchLocation, Integer batchTime) {
        this.batchId = batchId;
        this.batchName = batchName;
        this.batchLocation = batchLocation;
        this.batchTime = batchTime;
    }
}
