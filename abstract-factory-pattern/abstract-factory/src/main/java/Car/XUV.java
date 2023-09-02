package Car;

public class XUV implements Car {

    private int average;

    public XUV(){
        average = 22;
    }

    @Override
    public int average() {
        return average;
    }
}
