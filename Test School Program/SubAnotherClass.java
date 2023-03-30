public class SubAnotherClass extends SubClass {
    private int z = 0;

    public SubAnotherClass() {
    }

    public SubAnotherClass(int x, int y, int z) {
        super(x, y);
        this.z = z;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }

    public boolean equals(Object otherObject) {
        boolean result = false;

        if (otherObject instanceof SubAnotherClass) {
            SubAnotherClass otherSubObject = (SubAnotherClass) otherObject;
            result = (super.equals(otherObject) && (this.getX() == otherSubObject.getX()));
            return result;
        }

        else {
            return super.equals(otherObject);
        }

    }
}
