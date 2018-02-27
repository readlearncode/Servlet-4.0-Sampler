# Servlet 4.0 Examples
Examples of ways to use the new Servlet 4.0 feature in Java EE 8

The code repository contains three examples:

1. An example of using Server Push in a Servlet: [SimplestExample](https://github.com/readlearncode/Servlet-4.0-Sampler/blob/master/src/main/java/com/readlearncode/servlet4/pushbuilder/SimplestExample.java)
2. An exmaple of using the Servlet Mapping API: [ServletMapping](https://github.com/readlearncode/Servlet-4.0-Sampler/blob/master/src/main/java/com/readlearncode/servlet4/mapping/ServletMapping.java) . Ensure that you uncomment the relevant sections in the [web.xml](https://github.com/readlearncode/Servlet-4.0-Sampler/blob/master/src/main/webapp/WEB-INF/web.xml) and the WebServlet code line in the class.
3. A very simple and naive way to implement a push cache filter: [PushCacheFilter](https://github.com/readlearncode/Servlet-4.0-Sampler/blob/master/src/main/java/com/readlearncode/servlet4/pushbuilder/PushCacheFilter.java)

This repository contains the examples I demonstarted in my article "[Servlet 4.0: Doing More Faster](http://www.javamagazine.mozaicreader.com/NovDec2017/facebook#&pageSet=13&page=0)" that was published in the November/December 2017 edition of the Java Magazine.
