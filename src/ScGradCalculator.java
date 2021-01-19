public class ScGradCalculator implements GradCalculator {
    public boolean passes(Score score) {
        return score.getReadingScore() > 75;
    }
}
