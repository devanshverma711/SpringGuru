package org.example;

public class Age {
    private int dob;

    public int getDob() {
        return dob;
    }

    @Override
    public String toString() {
        return "Age{" +
                "dob=" + dob +
                '}';
    }

    public Age() {
    }

    public void setDob(int dob) {
        this.dob = dob;
    }

    public Age(int dob) {
        this.dob = dob;
    }
}
