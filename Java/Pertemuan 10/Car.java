public class Car extends Vehicle implements  Ispace{
    private int seat, currentPerson;
    private boolean isMoving;

    public void addPerson(){currentPerson++;}
    @Override
    public int leftSpace() {
        return seat-currentPerson;
    }

    @Override
    public boolean canFit(int person) {
        return currentPerson+person>=seat;
    }

    @Override
    public boolean doorCanBeOpened() {
        return isMoving();
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public boolean isMoving() {
        return isMoving;
    }

    public void setMoving(boolean moving) {
        isMoving = moving;
    }

    public int getCurrentPerson() {
        return currentPerson;
    }

    public void setCurrentPerson(int currentPerson) {
        this.currentPerson = currentPerson;
    }
}
