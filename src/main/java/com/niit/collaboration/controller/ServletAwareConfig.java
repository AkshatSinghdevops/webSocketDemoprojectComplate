package com.niit.collaboration.controller;

import javax.servlet.http.HttpSession;
import javax.websocket.HandshakeResponse;
import javax.websocket.server.*;
public class ServletAwareConfig extends ServerEndpointConfig.Configurator {
	  @Override
	    public void modifyHandshake(ServerEndpointConfig config, HandshakeRequest request, HandshakeResponse response) {
	        HttpSession httpSession = (HttpSession) request.getHttpSession();
	        config.getUserProperties().put("httpSession", httpSession);
	    }
}
