package edu.najah.cap.advance.assignments.assignment2;

public class Event {
    private String type; // "USER","SYSTEM","SECURITY"
    private String payload;
    private boolean encrypt;
    private boolean compress;
    private boolean addMetadata;
    private String metadata;
    private String id;

    public Event(String type, String payload) {
        this.type = type; this.payload = payload;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPayload() {
        return payload;
    }

    public void setPayload(String payload) {
        this.payload = payload;
    }

    public boolean isEncrypt() {
        return encrypt;
    }

    public void setEncrypt(boolean encrypt) {
        this.encrypt = encrypt;
    }

    public boolean isCompress() {
        return compress;
    }

    public void setCompress(boolean compress) {
        this.compress = compress;
    }

    public boolean isAddMetadata() {
        return addMetadata;
    }

    public void setAddMetadata(boolean addMetadata) {
        this.addMetadata = addMetadata;
    }

    public String getMetadata() {
        return metadata;
    }

    public void setMetadata(String metadata) {
        this.metadata = metadata;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}