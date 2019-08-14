package com.mindblaze.springbootapp.model;

import java.io.Serializable;

public class JwtResponse implements Serializable {

  private final String jwtToken;

  public JwtResponse(String token) {
    this.jwtToken = token;
  }

  public String getJwtToken() {
    return jwtToken;
  }
}
