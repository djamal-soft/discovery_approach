package com.pfe.msDiscovery.dto.command;


public class ReplaceMsCommandeDto {

    private int id;
    private String mkeys;
    private String address;
    private float version;

    public ReplaceMsCommandeDto() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getMkeys() {
        return mkeys;
    }

    public void setMkeys(String mkeys) {
        this.mkeys = mkeys;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getVersion() {
        return version;
    }

    public void setVersion(float version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "AddMsCommandDto{" +
                "id=" + id +
                ", mkeys='" + mkeys + '\'' +
                ", address='" + address + '\'' +
                ", version=" + version +
                '}';
    }
}
