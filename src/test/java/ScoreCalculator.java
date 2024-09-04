import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runner.notification.RunListener;
import org.junit.runner.Description;

public class ScoreCalculator extends BlockJUnit4ClassRunner {
    private double totalScore = 0;

    public ScoreCalculator(Class<?> klass) throws InitializationError {
        super(klass);
    }

    @Override
    protected void runChild(final FrameworkMethod method, RunNotifier notifier) {
        Score scoreAnnotation = method.getAnnotation(Score.class);
        if (scoreAnnotation != null) {
            notifier.addListener(new ScoreListener(scoreAnnotation.value()));
        }
        super.runChild(method, notifier);
    }

    public double getTotalScore() {
        return totalScore;
    }

    private class ScoreListener extends RunListener {
        private final double methodScore;

        ScoreListener(double methodScore) {
            this.methodScore = methodScore;
        }

        public void testSucceeded(Description description) {
            totalScore += methodScore;
        }
    }
}