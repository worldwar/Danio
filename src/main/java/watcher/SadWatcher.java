package watcher;

import strategy.ChineseSadReactStrategy;
import strategy.EnglishSadReactStrategy;

public class SadWatcher implements Watcher {
	@Override
	public void react() {
		new ChineseSadReactStrategy().react();
		new EnglishSadReactStrategy().react();
	}
}
