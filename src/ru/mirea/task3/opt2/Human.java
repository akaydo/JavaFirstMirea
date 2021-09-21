package ru.mirea.task3.opt2;

public class Human {
    private class Head {
        private String hair;
        private String eyes;

        public Head() {
            this.hair = "Black";
            this.eyes = "Blue";
        }
        public String getHair() {
            return hair;
        }
        public void setHair(String hair) {
            this.hair = hair;
        }
        public String getEyes() {
            return eyes;
        }
        public void setEyes(String eyes) {
            this.eyes = eyes;
        }
        public String toString() {
            return "Hair: " + this.hair + ", Eyes: " + this.eyes+", ";
        }
    }
    private class Leg {
        private int LegLength;
        private int LegSize;

        public Leg() {
            this.LegLength = 80;
            this.LegSize = 39;
        }
        public int getLegLength() {
            return LegLength;
        }
        public void setLegLength(int LegLength) {
            this.LegLength = LegLength;
        }
        public int getLegSize() {
            return LegSize;
        }
        public void setLegSize(int LegSize) {
            this.LegSize = LegSize;
        }
        public String toString() {
            return "Leg length: " + this.LegLength + ", Leg size: " + this.LegSize+", ";
        }
    }
    private class Hand {
        private int HandLength;
        private String HandSize;

        public Hand() {
            this.HandLength = 60;
            this.HandSize = "S";
        }
        public int getHandLength() {
            return HandLength;
        }
        public void setHandLength(int HandLength) {
            this.HandLength = HandLength;
        }
        public String getHandSize() {
            return HandSize;
        }
        public void setHandSize(String HandSize) {
            this.HandSize = HandSize;
        }
        public String toString() {
            return "Hand length: " + this.HandLength + ", Hand size: " + this.HandSize;
        }
    }
    private Head head;
    private Leg leg;
    private Hand hand;

    public Human() {
        this.head = new Head();
        this.leg = new Leg();
        this.hand = new Hand();
    }
    public void setHeadHair(String hair) {
        this.head.setHair(hair);
    }
    public void setHeadEyes(String eyes) {
        this.head.setEyes(eyes);
    }
    public void setHead(String hair1, String eyes1) {
        this.head.setHair(hair1);
        this.head.setEyes(eyes1);
    }
    public Head getHead() {
        return this.head;
    }
    public void setLegLength(int length) {
        this.leg.setLegLength(length);
    }
    public void setLegSize(int size) {
        this.leg.setLegSize(size);
    }
    public void setLeg(int length, int size) {
        this.leg.setLegLength(length);
        this.leg.setLegSize(size);
    }
    public Leg getLeg() {
        return this.leg;
    }
    public void setHandLength(int length) {
        this.hand.setHandLength(length);
    }
    public void setHandSize(String size) {
        this.hand.setHandSize(size);
    }
    public void setHand(int length, String size) {
        this.hand.setHandLength(length);
        this.hand.setHandSize(size);
    }
    public Hand getHand() {
        return this.hand;
    }
    public String toString() {
        return this.head + " " + this.leg + " " + this.hand;
    }
}
