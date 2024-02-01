package POST;

import java.util.ArrayList;

public class Hashtag {

	public String Hashtag;
    public ArrayList<Post> post=new ArrayList<Post>();
	public Hashtag(String hashtag) {
		Hashtag = hashtag;
	}

	@Override
	public String toString() {
		return "Hashtag [Hashtag=" + Hashtag + "]";
	}
	
	
	
}


