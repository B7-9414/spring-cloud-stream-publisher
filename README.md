1. Install kafka and zookeeper (homebrew) and make sure you have java 
installed

2. Run the following command (Mac user)

  - zookeeper-server-start /opt/homebrew/etc/kafka/zookeeper.properties

  - kafka-server-start /opt/homebrew/etc/kafka/server.properties

3. Run the following command To list all the topics
  - kafka-topics --bootstrap-server=localhost:9092 --list

4. In order to chnage from kafka to RMQ all you need is :
chnage the maven dependency in pom.xml file as shown From 
org.springframework.cloud spring-cloud-stream-binder-kafka
To org.springframework.cloud spring-cloud-stream-binder-rabbit

5. To run RMQ command using docker
  - docker run --name rabbitmq -p 8081:15672 -p 5672:5672 
rabbitmq:3-management
