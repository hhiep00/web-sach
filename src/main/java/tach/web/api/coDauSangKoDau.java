package tach.web.api;

import java.text.Normalizer;

public class coDauSangKoDau {
	public static String ChuanHoa(String coDau) {
		 String koDau = Normalizer.normalize(coDau.trim().toLowerCase(), Normalizer.Form.NFD);
		    koDau = koDau.replaceAll("[^\\p{ASCII}]", "");
		    koDau=koDau.replaceAll("\\s+", "-");
		    return koDau;
	}
	public static void main(String args[]) {
		String s="11111111";
		if(s.matches("\\d+"))
			System.out.println("tri");
		else {
			System.out.println("ngu");
		}
	}
}
