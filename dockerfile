FROM airhacks/payara-micro

ENV ARCHIVE_NAME jaxrs-auth-example.war
COPY ./target/jaxrs-auth-example.war ${DEPLOYMENT_DIR}	