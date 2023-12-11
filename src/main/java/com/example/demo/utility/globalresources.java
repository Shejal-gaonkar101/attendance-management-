package com.example.demo.utility;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class globalresources {
  public static Logger getlogger(Class classname) {
	  return LoggerFactory.getLogger(classname);
  }
}
