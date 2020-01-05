package com.pcz.util;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import lombok.extern.slf4j.Slf4j;

import javax.xml.bind.DatatypeConverter;

/**
 * @author picongzhi
 */
@Slf4j
public class JwtUtil {
    public static final String AUTHORIZATION_KEY = "Authorization";
    public static final String TOKEN_PREFIX = "Bearer ";

    public static Claims parseJwt(String token, String base64Binary) {
       return Jwts.parser().
                setSigningKey(DatatypeConverter.parseBase64Binary(base64Binary)).
                parseClaimsJws(token).getBody();
    }

    public static String createJwt(String userId) {
        return null;
    }
}
