class Solution {
    public double angleClock(int hour, int minutes) {
        double minutesAngle = minutes * 6;
        double hourAngle = (hour%12)*30 + minutes*0.5;
        double difference = Math.abs(hourAngle-minutesAngle);
        return Math.min(difference,360-difference);
    }
}
