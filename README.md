DataStax Java Starter
========================

To get started download this repository. Choose a location to download the project and run the following
```
git clone https://github.com/weideng1/datastax-java-starter
cd datastax-java-starter
rm -rf .git
```
Note : We run the remove so that any git files are deleted.

To create the schema, run the following

	mvn clean compile exec:java -Dexec.mainClass="com.datastax.demo.SchemaSetup" -DcontactPoints=<DSE node IP>
	
To start the Main program, run the following 
	
	mvn clean compile exec:java -Dexec.mainClass="com.datastax.sample.Main"  -DcontactPoints=<DSE node IP>
	
This will print out a description of all the keyspaces in the cluster using a the sample service. 
	
To start the web server run 

	mvn jetty:run -DcontactPoints=<DSE node IP>

To use the webservice, go to the folowing url

	http://<external_ip_of_your_jetty_server>:8080/rest/get/keyspaces
	
This will return a json representation of the keyspaces in the cluster using a the sample service.	

To remove the tables and the schema, run the following.

    mvn clean compile exec:java -Dexec.mainClass="com.datastax.demo.SchemaTeardown"
    
    
