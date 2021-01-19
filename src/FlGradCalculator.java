public class FlGradCalculator implements GradCalculator {
    public boolean passes(Score score) {
        return score.getReadingScore() > 80;
    }
}
