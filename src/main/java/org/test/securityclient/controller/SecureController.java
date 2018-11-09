package org.test.securityclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.security.Principal;

@RestController
public class SecureController {

  @GetMapping("/secured")
  public String getSecure(Principal principal){

    return "Your are secured : " + principal.getName();
  }
}
