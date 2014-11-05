package match;

import watcher.Watcher;

import java.util.ArrayList;
import java.util.List;

public class Match {
	private List<Watcher> watchers = new ArrayList<Watcher>();

	public void goal() {
		for (Watcher watcher : watchers) {
			watcher.react();
		}
	}

	public synchronized void register(Watcher watcher) {
		watchers.add(watcher);
	}
}
