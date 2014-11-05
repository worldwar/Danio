import match.Match;
import watcher.CrazyWatcher;
import watcher.HappyWatcher;
import watcher.SadWatcher;

public class Main {

	public static void main(String[] args) {
		Match match = new Match();
		match.register(new HappyWatcher());
		match.register(new HappyWatcher());
		match.register(new HappyWatcher());
		match.register(new SadWatcher());
		match.register(new SadWatcher());
		match.register(new CrazyWatcher());
		match.goal();
	}
}
