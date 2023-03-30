public class SubClass extends SuperClass {
    private int y = 0;

    public SubClass() {
    }

    public SubClass(int x, int y) {
        super(x);
        this.y = y;
    }

    public int getY() {
        return y;
    }

    public void setY(int inputY) {
        y = inputY;
    }

    public boolean equals(Object otherObject) {
        boolean result = false;
        if (otherObject instanceof SubClass) {
            SubClass otherSubObject = (SubClass) otherObject;
            result = (super.equals(otherObject) && (this.getY() == otherSubObject.getY()));
            return result;
        }

        else {
            return super.equals(otherObject);
        }
    }
}
