
###### venv
python3 -m venv myvenv
source myvenv/bin/activate
pip install -r requirements.txt


###### dockerhub
https://hub.docker.com/_/microsoft-mmlspark-release

###### 
docker run -it -v ~/spark/share:/tmp/ -p 8888:8888 -p 4040:4040 -e ACCEPT_EULA=yes mcr.microsoft.com/mmlspark/release



###### del docker
docker stop $(docker ps -aq)
docker rm $(docker ps -aq)
docker rmi $(docker images -q)


###### java 
```
mvn compile
mvn package
java -jar target/app-0.0.0.jar
```
