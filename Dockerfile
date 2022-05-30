FROM openjdk:11

#Arg for the RPM build number
ARG build

#Run the RPM statement
#RUN rpm ....
#Needs to stop typing at this point because I made the call to 'chicken out' and not submit my proper solution

#Create entry point for container logging
#COPY docker-entrypoint.sh /usr/local/bin
#RUN chmod +x /usr/local/bin/docker-entrypoint.sh

#ENTTRYPOINT ["docker-entrypoint.sh"] \
#CMD ["/etc/init.d/entei"]