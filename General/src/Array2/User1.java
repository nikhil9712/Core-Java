package Array2;

public class User1 {

	Song[] playlist;
	String username;

	public User1(String username, int size) {
		this.username = username;
		playlist = new Song[size];
		System.out.println("Playlist of user is created ");
	}

	public void addSong(String song, Song[] a) {
		// if (checkEmpty(a)) {
		// int index=emptyIndex(a);
		for (int i = 0; i < a.length; i++) {
			// a[index]=song;
		}
	}

	

	public boolean checkEmpty(String[] a) {
		boolean ans = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == null) {
				return true;
			}
		}
		return true;
	}

	public int emptyIndex(String[] a) {
		if (checkEmpty(a)) {
			for (int i = 0; i < a.length; i++) {
				if (a[i] == null) {
					return i;
				}
			}

		}
		return -10;
	}

}
