public class ClockHand {
    private int value;
    public int limit;

    public ClockHand(int limit) {
        this.limit = limit;
        this.value = 0;
    }

    public void setValue(int value) {
        this.value = value % limit;
    }

    public void tick() {
        this.value = (this.value + 1) % limit;
    }

    public int getValue() {
        return this.value;
    }
}
