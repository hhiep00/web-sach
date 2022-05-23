package tach.web.jwt;

import java.util.Date;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import tach.web.model.User;
import io.jsonwebtoken.SignatureException;
import io.jsonwebtoken.UnsupportedJwtException;
import io.jsonwebtoken.MalformedJwtException;
import io.jsonwebtoken.ExpiredJwtException;
public class Token {
	private static final SignatureAlgorithm SIGNATURE_ALGORITHM = SignatureAlgorithm.HS256;
	private static final String SECRET_KEY = "gpcoderdotcomtokenbaseauthenticationwithjwtexample";
	
	public static String generateToken(User user) {
		return Jwts.builder()
				.setSubject(user.getUsername())
				.setIssuedAt(new Date())
				.setExpiration(new Date((new Date()).getTime() + (1000 * 60 * 60)))
				.signWith(SIGNATURE_ALGORITHM, SECRET_KEY)
				.compact();
	}
	
	public static String getUserNameFromJwtToken(String token) {
        return Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(token).getBody().getSubject();
    }

    public static boolean validateJwtToken(String authToken) {
        try {
            Jwts.parser().setSigningKey(SECRET_KEY).parseClaimsJws(authToken);
            return true;
        } catch (SignatureException e) {
            System.out.println(e);
        } catch (MalformedJwtException e) {
        	 System.out.println(e);
        } catch (ExpiredJwtException e) {
        	 System.out.println(e);
        } catch (UnsupportedJwtException e) {
        	 System.out.println(e);
        } catch (IllegalArgumentException e) {
        	 System.out.println(e);
        }

        return false;
    }
}
