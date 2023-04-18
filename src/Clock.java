public class Clock implements Cloneable {
    private ClockHand hourHand;
    private ClockHand minuteHand;

    public Clock(int hoursLimit, int minutesLimit) {
        this.hourHand = new ClockHand(hoursLimit);
        this.minuteHand = new ClockHand(minutesLimit);
    }

    public void setTime(int hours, int minutes) {
        this.hourHand.setValue(hours);
        this.minuteHand.setValue(minutes);
    }

    public void tick() {
        this.minuteHand.tick();
        if (this.minuteHand.getValue() == 0) {
            this.hourHand.tick();
        }
    }

    public String toString() {
        return String.format("%02d:%02d", this.hourHand.getValue(), this.minuteHand.getValue());
    }

    public Clock clone() {
        try {
            return (Clock) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    public Clock shallowClone() {
        Clock newClock = new Clock(this.hourHand.limit, this.minuteHand.limit);
        newClock.hourHand.setValue(this.hourHand.getValue());
        newClock.minuteHand.setValue(this.minuteHand.getValue());
        return newClock;
    }
}
