DataStax Java Starter
========================

To create the schema, run the following

	mvn clean compile exec:java -Dexec.mainClass="com.datastax.demo.SchemaSetup" -DcontactPoints=localhost
	
To start the Main program, run the following 
	
	mvn clean compile exec:java -Dexec.mainClass="com.datastax.creditcard.Main"  -DcontactPoints=localhost
	
To start the web server run 

	mvn jetty:run

To use the webservice, go to the folowing url

	http://localhost:8080/datastax-starter/rest/get/keyspaces

To remove the tables and the schema, run the following.

    mvn clean compile exec:java -Dexec.mainClass="com.datastax.demo.SchemaTeardown"
    
    
