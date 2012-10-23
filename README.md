SLF4J JBoss4 Logger plugin
==========================

Overview:
---------


A JBoss4 Logger plugin that use  [slf4j](http://www.slf4j.org/]) ([Logback](http://logback.qos.ch/) in the example below) as logging backend.

Usage:
------
Copy the followung jar files to `<JBOSS_HOME>/lib`

* jboss4-slf4j-loggerplugin
* slf4j-api
* logback-classic
* logback-core
* log4j-over-slf4j-1.6.2.jar

Put your `logback.xml` in `<JBOSS_HOME>/lib` (or adjust the configuration file accordingly).

Add configuration to `<JBOSS_HOME>/bin/run.conf`

	JAVA_OPTS="$JAVA_OPTS -Dorg.jboss.logging.Logger.pluginClass=com.sparetimecoders.Slf4jLoggerPlugin -Dlogback.configurationFile=lib/logback.xml"

Start JBoss using: 
	
	bin/run.sh -L jboss4-slf4j-loggerplugin-1.0.jar -L slf4j-api-1.6.2.jar -L logback-core-1.0.0.jar -L logback-classic-1.0.0.jar -L logback.xml -L log4j-over-slf4j-1.6.2.jar 
