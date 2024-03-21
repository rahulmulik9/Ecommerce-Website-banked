package com.rahul.ecommerce.config;

import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.crypto.SecretKey;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;

@Service
public class JwtTokenProvider {

	private SecretKey theSecreteKey = Keys.hmacShaKeyFor(JwtConstant.SECRET_KEY.getBytes());

	public String generateToken(Authentication auth) {
		String jwt = Jwts.builder()
				.issuedAt(new Date())
				.expiration(new Date(new Date().getTime()+864000000))
				.claim("email",auth.getName())
				.signWith(theSecreteKey)
				.compact();

		return jwt;
	}

	public String getEmailFromJwtToken(String jwt) {
		jwt=jwt.substring(7);
		Claims claims= Jwts.parser().decryptWith(theSecreteKey).build().parseSignedClaims(jwt).getPayload();
		String email=String.valueOf(claims.get("email"));
		return email;
	}

	public String populateAuthorities(Collection<? extends GrantedAuthority> collection) {
		Set<String> auths=new HashSet<>();

		for(GrantedAuthority authority:collection) {
			auths.add(authority.getAuthority());
		}
		return String.join(",",auths);
	}

}
