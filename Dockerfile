FROM java:8 

WORKDIR /code

# Adding source, compile and package into a fat jar
ADD target/occupation-0.0.1-SNAPSHOT.jar /code/occupation-0.0.1-SNAPSHOT.jar
RUN bash -c 'touch /code/occupation-0.0.1-SNAPSHOT.jar'
EXPOSE 7891
EXPOSE 7895
CMD java -jar /code/occupation-0.0.1-SNAPSHOT.jar 
