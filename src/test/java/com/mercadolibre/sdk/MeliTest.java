package com.mercadolibre.sdk;

import java.io.IOException;

import org.junit.Assert;
import org.junit.Test;

import com.ning.http.client.FluentStringsMap;
import com.ning.http.client.Response;

public class MeliTest extends Assert {
	private static final String VALID_TOKEN = "APP_USR-2016359345495310-070117-9eceba2c4ef01066781cc14032bfb1cf__G_L__-29868939";
	private static final long CLIENT_ID = 2016359345495310l;
	private static final String CLIENT_SECRET = "6kpBqNys2xneeI9IZRIAP1x7ZuyBVaFd";
	private static final String CALL_BACK = "developers.myperfit.com";
	private static final String CODE = "TG-559459fde4b0380ba592cd13-29868939";
	
	/**
//	 * Con esto obtengo el codigo para redirigir a mis usuarios a que se autentiquen. Hay que setear un callback.
//	 */
//	@Test
//    public void testGetAuthUrl() {
//			//datos que saco de la aplicacion creada.
//		Meli meli = new Meli(CLIENT_ID, CLIENT_SECRET);
//		String authUrl = meli.getAuthUrl("https://"+CALL_BACK, Meli.AuthUrls.MLA); 
//		assertEquals(
//			"https://auth.mercadolibre.com.ar/authorization?response_type=code&client_id="+CLIENT_ID+"&redirect_uri=https%3A%2F%2F"+CALL_BACK,
//			authUrl
//		);
//		System.out.println(authUrl);
//	}
//
//    @Test(expected = AuthorizationFailure.class)
//    public void testAuthorizationFailure() throws AuthorizationFailure {
//	Meli.apiUrl = "http://localhost:3000";
//
//	new Meli(CLIENT_ID, CLIENT_SECRET).authorize("bad code",
//		"http://someurl.com");
//    }
//
//    @Test
//    public void testAuthorizationSuccess() throws AuthorizationFailure {
////	Meli.apiUrl = "http://localhost:3000";
//
//	Meli m = new Meli(CLIENT_ID, CLIENT_SECRET);
//	m.authorize(CODE, "https://"+CALL_BACK);
//
//	assertNotNull(m.getAccessToken());
//	assertNotNull(m.getRefreshToken());
//    }
//
//    @Test
//    public void testGet() throws MeliException, IOException {
////	Meli.apiUrl = "http://localhost:3000";
//
//	Meli m = new Meli(CLIENT_ID, CLIENT_SECRET, VALID_TOKEN);
//
//	Response response = m.get("/sites");
//
//	assertEquals(200, response.getStatusCode());
//	assertFalse(response.getResponseBody().isEmpty());
//    }
//
//    @Test
//    public void testGetWithRefreshToken() throws MeliException, IOException {
//	Meli.apiUrl = "http://localhost:3000";
//
//	Meli m = new Meli(CLIENT_ID, CLIENT_SECRET, "expired token",
//		"valid refresh token");
//
//	FluentStringsMap params = new FluentStringsMap();
//	params.add("access_token", m.getAccessToken());
//	Response response = m.get("/users/me", params);
//
//	assertEquals(200, response.getStatusCode());
//	assertFalse(response.getResponseBody().isEmpty());
//    }
//
//    @Test
//    public void testErrorHandling() throws IOException, MeliException {
//	Meli m = new Meli(CLIENT_ID, CLIENT_SECRET, "invalid token");
//
//	FluentStringsMap params = new FluentStringsMap();
//	params.add("access_token", m.getAccessToken());
//	Response response = m.get("/users/me", params);
//	assertEquals(403, response.getStatusCode());
//    }
//
//    @Test
//    public void testUserAgent() throws IOException, MeliException {
//	Meli m = new Meli(CLIENT_ID, CLIENT_SECRET, "invalid token");
//
//	FluentStringsMap params = new FluentStringsMap();
//	params.add("access_token", m.getAccessToken());
//	Response response = m.get("/echo/user_agent", params);
//	assertEquals(200, response.getStatusCode());
//    }
//
//    public void testPost() throws MeliException {
//	Meli m = new Meli(CLIENT_ID, CLIENT_SECRET, VALID_TOKEN);
//
//	FluentStringsMap params = new FluentStringsMap();
//	params.add("access_token", m.getAccessToken());
//	Response r = m.post("/items", params, "{\"foo\":\"bar\"}");
//
//	assertEquals(201, r.getStatusCode());
//    }
//
//    public void testPostWithRefreshToken() throws MeliException {
//	Meli m = new Meli(CLIENT_ID, CLIENT_SECRET, "expired token",
//		"valid refresh token");
//
//	FluentStringsMap params = new FluentStringsMap();
//	params.add("access_token", m.getAccessToken());
//	Response r = m.post("/items", params, "{\"foo\":\"bar\"}");
//
//	assertEquals(201, r.getStatusCode());
//    }
//
//    public void testPut() throws MeliException {
//	Meli m = new Meli(CLIENT_ID, CLIENT_SECRET, VALID_TOKEN);
//
//	FluentStringsMap params = new FluentStringsMap();
//	params.add("access_token", m.getAccessToken());
//	Response r = m.put("/items/123", params, "{\"foo\":\"bar\"}");
//
//	assertEquals(200, r.getStatusCode());
//    }
//
//    public void testPutWithRefreshToken() throws MeliException {
//	Meli m = new Meli(CLIENT_ID, CLIENT_SECRET, "expired token",
//		"valid refresh token");
//
//	FluentStringsMap params = new FluentStringsMap();
//	params.add("access_token", m.getAccessToken());
//	Response r = m.put("/items/123", params, "{\"foo\":\"bar\"}");
//
//	assertEquals(200, r.getStatusCode());
//    }
//
//    public void testDelete() throws MeliException {
//	Meli m = new Meli(CLIENT_ID, CLIENT_SECRET, VALID_TOKEN);
//
//	FluentStringsMap params = new FluentStringsMap();
//	params.add("access_token", m.getAccessToken());
//	Response r = m.delete("/items/123", params);
//
//	assertEquals(200, r.getStatusCode());
//    }
//
//    public void testDeleteWithRefreshToken() throws MeliException {
//	Meli m = new Meli(CLIENT_ID, CLIENT_SECRET, "expired token",
//		"valid refresh token");
//
//	FluentStringsMap params = new FluentStringsMap();
//	params.add("access_token", m.getAccessToken());
//	Response r = m.delete("/items/123", params);
//
//	assertEquals(200, r.getStatusCode());
//    }
}