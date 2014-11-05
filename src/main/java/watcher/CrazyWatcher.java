package watcher;

import strategy.ChineseHappyReactStrategy;
import strategy.ChineseSadReactStrategy;
import strategy.EnglishSadReactStrategy;

public class CrazyWatcher implements Watcher {
	@Override
	public void react() {
		new ChineseSadReactStrategy().react();
		new ChineseHappyReactStrategy().react();
		new EnglishSadReactStrategy().react();
		new EnglishSadReactStrategy().react();
		new ChineseHappyReactStrategy().react();
	}
}
