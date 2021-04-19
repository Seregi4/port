public class Berth {
    private boolean isEmpty;

    public Berth(boolean isEmpty) {
        this.isEmpty = isEmpty;
    }

    public Berth() {
        super();
    }

    public boolean isEmpty() {
        return isEmpty;
    }

    public void setEmpty(boolean empty) {
        isEmpty = empty;
    }
}
