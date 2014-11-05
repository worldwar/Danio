package watcher;

import strategy.ChineseHappyReactStrategy;

public class HappyWatcher implements Watcher {

	@Override
	public void react() {
		new ChineseHappyReactStrategy().react();
	}
}
