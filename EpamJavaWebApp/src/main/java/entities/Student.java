package entities;

public class Student {

    private String name;

    private double averageScore;

    private boolean isBlockChain;

    public Student(String name, double averageScore, boolean isBlockChain) {
        this.name = name;
        this.averageScore = averageScore;
        this.isBlockChain = isBlockChain;
    }

    public void setAverageScore(double averageScore) {
        this.averageScore = averageScore;
    }

    public void setBlockChain(boolean blockChain) {
        isBlockChain = blockChain;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAverageScore() {
        return averageScore;
    }

    public String getName() {
        return name;
    }

    public boolean getIsBlockChain() {
        return isBlockChain;
    }

}

