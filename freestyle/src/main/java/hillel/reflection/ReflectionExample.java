package hillel.reflection;

public class ReflectionExample {
    private String field1;
    private int field2;
    private Long field3;
    private short field4;

    public ReflectionExample(String field1, int field2, long field3, short field4) {
        this.field1 = field1;
        this.field2 = field2;
        this.field3 = field3;
        this.field4 = field4;
    }
    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public int getField2() {
        return field2;
    }

    public void setField2(int field2) {
        this.field2 = field2;
    }

    public Long getField3() {
        return field3;
    }

    public void setField3(Long field3) {
        this.field3 = field3;
    }

    public short getField4() {
        return field4;
    }

    public void setField4(byte field4) {
        this.field4 = field4;
    }


}
