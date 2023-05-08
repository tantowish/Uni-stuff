public class Lift implements Ispace{
    private int maxCapacity,currentPerson;
    private boolean isGoingUp;
    private boolean isGoingDown;

    public void addPerson(){
        currentPerson++;
    }
    @Override
    public int leftSpace() {
        return maxCapacity-currentPerson;
    }

    @Override
    public boolean canFit(int person) {
        return maxCapacity<=currentPerson+person;
    }

    @Override
    public boolean doorCanBeOpened() {
        return !isGoingDown&&!isGoingUp;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public boolean isGoingUp() {
        return isGoingUp;
    }

    public void setGoingUp(boolean goingUp) {
        isGoingUp = goingUp;
    }

    public boolean isGoingDown() {
        return isGoingDown;
    }

    public void setGoingDown(boolean goingDown) {
        isGoingDown = goingDown;
    }
}
