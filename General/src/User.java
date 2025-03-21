import java.util.*;
public class User {
    String name;
	Song[] Playlist;

	public User(int size) {

		Playlist = new Song[size];
	}

	public static void main(String[] args) {

	
	}

	public boolean IsEmpty(String[] a) {
		for (int i = 0; i < a.length; i++) {
			if (a[i] == null) {
				return true;
			}
		}
		return false;
	}

	public void addSong(String[] a, String song) 
	{
        if (IsEmpty(a)) {
			int index=EmptyIndex(a);
			a[index]=song;
		}
	}

	public int EmptyIndex(String[]a)
	{
		int index;
		for (int i = 0; i < a.length; i++)
		{
			if (a[i]==null)
			{
				index=i;
				return index;

			}
			
	    }
		return 0;
		
	
	
	}		
		
}

