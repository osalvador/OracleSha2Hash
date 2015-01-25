import gnu.crypto.hash.HashFactory;
import gnu.crypto.hash.IMessageDigest;
import gnu.crypto.util.Util;

public class CommonHash {
	public static java.lang.String common(java.lang.String input, java.lang.String hash) {
		try {
			IMessageDigest md = HashFactory.getInstance(hash);
			md.update(input.getBytes(), 0, input.length());
			return Util.toString(md.digest()).toLowerCase();
		} catch(Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
