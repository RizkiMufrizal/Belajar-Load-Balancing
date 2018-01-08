mvn clean install docker:build -Dmaven.test.skip=true
docker build -t custom-haproxy .