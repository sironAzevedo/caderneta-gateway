FROM openjdk:11
VOLUME /tmp

EXPOSE 8765
ADD ./target/caderneta-gateway-0.0.1-SNAPSHOT.jar caderneta-gateway.jar
ADD ./docker-entrypoint.sh /

RUN ["chmod", "+x", "/docker-entrypoint.sh"]
ENTRYPOINT ["/docker-entrypoint.sh"]