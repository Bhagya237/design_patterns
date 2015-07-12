package org.bhagi.pattern.Singleton;

public class SiongletonDemand {
	private SiongletonDemand() { }

    /**
     * Initializes singleton.
     *
     * {@link SingletonHolder} is loaded on the first execution of {@link Singleton#getInstance()} or the first access to
     * {@link SingletonHolder#INSTANCE}, not before.
     */
    private static class SingletonHolder {
            private static final SiongletonDemand INSTANCE = new SiongletonDemand();
    }

    public static SiongletonDemand getInstance() {
            return SingletonHolder.INSTANCE;
    }
}
