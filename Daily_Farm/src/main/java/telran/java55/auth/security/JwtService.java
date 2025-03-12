package telran.java55.auth.security;

import io.jsonwebtoken.*;

import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Service;

import java.security.Key;
import java.util.Date;

import javax.crypto.SecretKey;

@Service
public class JwtService {

    private static final String SECRET_KEY = "YOUR_SUPER_SECRET_KEY_WITH_AT_LEAST_32_BYTES_LONG_78659875642987654240882227654566 "; // Length must be ≥ 32 bytes

    public String generateToken(String email) {
        return Jwts.builder()
                .subject(email) // Using a new method instead of setSubject()
                .issuedAt(new Date())
                .expiration(new Date(System.currentTimeMillis() + 86400000)) // 24 hours
                .signWith(getSignKey()) // New signature format
                .compact();
    }

    public String extractEmail(String token) {
        return Jwts.parser()
                .verifyWith((SecretKey) getSignKey())
                .build()
                .parseSignedClaims(token)
                .getPayload()
                .getSubject();
    }

    private Key getSignKey() {
        return Keys.hmacShaKeyFor(SECRET_KEY.getBytes());
    }
}