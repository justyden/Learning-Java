public class SuperClass {
    private int x = 0;

    public SuperClass() {
    }

    public SuperClass(int x) {
        this.x = x;
    }

    public void setX(int inputX) {
        x = inputX;
    }

    public int getX() {
        return x;
    }

    public boolean equals(Object otherObject) {
        boolean result = false;
        if (otherObject instanceof SuperClass) {
            SuperClass otherSuperObject = (SuperClass) otherObject;
            result = (this.getX() == otherSuperObject.getX());
        }

        return result;

    }
}
