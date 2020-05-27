package org.xeustechnologies.jcl;

import java.net.MalformedURLException;
import java.net.URL;

public interface URLCreator {
  URL create(String spec) throws MalformedURLException;
}
