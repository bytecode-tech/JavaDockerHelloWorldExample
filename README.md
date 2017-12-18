# JavaDockerHelloWorldExample
---

This is an example java application that builds and runs as a Docker container.  The sample has the ability to load libraries into the global library path.  As an example it loads the Oracle JDBC drivers from artifactory.

## Requirements

This projects requires:
- Java
- Maven
- Ansible
- Docker
- python lxml module : pip install lxml
- docker-py : pip install docker-py

## Build

The build process builds both the applicaion and the docker container.

To build the container run
```
ansible-playbook -i "localhost" docker-image.yml
```

## Run
To run the application as a docker container
```
docker run -it --rm -p 8888:8080 java-docker-hello-world-example
```

This will run the application an map it to port 8888.

To access the application visit the url
```
http://localhost:8888/JavaDockerHelloWorldExample/
```
