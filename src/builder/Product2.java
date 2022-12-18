package builder;

public class Product2 {

    private Object featureA;

    private Object featureB;

    private Object featureZ;

    public Object getFeatureA() {
        return featureA;
    }

    public void setFeatureA(Object featureA) {
        this.featureA = featureA;
    }

    public Object getFeatureB() {
        return featureB;
    }

    public void setFeatureB(Object featureB) {
        this.featureB = featureB;
    }

    public Object getFeatureZ() {
        return featureZ;
    }

    public void setFeatureZ(Object featureZ) {
        this.featureZ = featureZ;
    }

    @Override
    public String toString() {
        return "Product2{" +
                "featureA=" + featureA +
                ", featureB=" + featureB +
                ", featureZ=" + featureZ +
                '}';
    }
}
