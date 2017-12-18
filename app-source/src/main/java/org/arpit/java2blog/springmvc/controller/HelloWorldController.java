
package org.arpit.java2blog.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import java.sql.*;

@Controller
public class HelloWorldController {

 @RequestMapping("/helloworld")
 public ModelAndView hello() {

  StringBuilder helloWorldMessage = new StringBuilder("Hello World Docker");

  // Load the Oracle JDBC driver
  try{
    helloWorldMessage.append("<br>");
    helloWorldMessage.append("Loading Postgres JDBC driver....");
    DriverManager.registerDriver
            (new org.postgresql.Driver());

    java.util.Enumeration<Driver> e = java.sql.DriverManager.getDrivers();
    while (e.hasMoreElements()) {
      Driver driver = e.nextElement();

      helloWorldMessage.append("<br>");
      helloWorldMessage.append("JDBC Driver=" + driver + " Verion=" + driver.getMajorVersion());
    }
  } catch (Exception e) {
    helloWorldMessage.append("<br>");
    helloWorldMessage.append(e);
  }

  return new ModelAndView("hello", "message", helloWorldMessage);
 }
}


