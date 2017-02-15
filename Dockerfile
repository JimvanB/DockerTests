FROM maven:3-jdk-7-onbuild-alpine
COPY . /app
WORKDIR /app
CMD ["mvn", "clean install"]