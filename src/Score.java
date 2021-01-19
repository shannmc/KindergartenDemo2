public class Score {
    private int readingScore;
    private Integer mathScore;

    public int getReadingScore() {
        return readingScore;
    }

    public void setReadingScore(int readingScore) {
        if (readingScore < 0) {
            readingScore = 0;
        }
        this.readingScore = readingScore;
    }

    public int getMathScore() {
        return mathScore;
    }

    public void setMathScore(int mathScore) {
        this.mathScore = mathScore;
    }
}
