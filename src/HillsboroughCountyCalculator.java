public class HillsboroughCountyCalculator extends FlGradCalculator {
    public boolean checkForGifted(Score score) {
        return score.getMathScore() > 99;
    }

    public boolean passes(Score score) {
        return super.passes(score) && score.getMathScore() > 80;
    }
}
