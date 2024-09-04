import org.junit.runner.notification.RunNotifier;
import org.junit.runners.BlockJUnit4ClassRunner;
import org.junit.runners.model.FrameworkMethod;
import org.junit.runners.model.InitializationError;
import org.junit.runner.notification.RunListener;
import org.junit.runner.Description;
import org.junit.runner.Result;

public class ScoreCalculator extends BlockJUnit4ClassRunner {
    private static double totalScore = 0;

    public ScoreCalculator(Class<?> klass) throws InitializationError {
        super(klass);
    }

    @Override
    public void run(final RunNotifier notifier) {
        notifier.addListener(new RunListener() {
            @Override
            public void testRunFinished(Result result) {
                System.out.println("Total Score: " + totalScore);
            }
        });
        super.run(notifier);
    }

    @Override
    protected void runChild(final FrameworkMethod method, RunNotifier notifier) {
        Score scoreAnnotation = method.getAnnotation(Score.class);
        if (scoreAnnotation != null) {
            notifier.addListener(new ScoreListener(scoreAnnotation.value()));
        }
        super.runChild(method, notifier);
    }

    private static class ScoreListener extends RunListener {
        private final double methodScore;

        ScoreListener(double methodScore) {
            this.methodScore = methodScore;
        }

        public void testSucceeded(Description description) {
            totalScore += methodScore;
        }
    }
}