package edu.najah.cap.advance.design_patterns.strategy_pattern.adpater.example2;

public class Xml {
    /*
    <key1> value1 </key1>
     */
    private String tag;
    private String value;

    public Xml(String tag, String value) {
        this.tag = tag;
        this.value = value;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
