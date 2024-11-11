Key Components of Kafka:-
Producer: It sends the messages to the Kafka topic.
Consumer: It reads the messages from the Kafka topic.
Broker: Kafka server that stores the messages and serves them to the consumers.
Topic: The logical channel to which provides the send messages and from which consumers read messages.
Zookeeper: It manages and coordinates the Kafka brokers and it can be used in the older versions of Kafka.

Commands:-
Start zookeeper-
			.\bin\windows\zookeeper-server-start.bat .\config\zookeeper.properties

Start kafka server-
			.\bin\windows\kafka-server-start.bat .\config\server.properties

Create new topic-
			bin\windows\kafka-topics.bat --create --topic user-topic --bootstrap-server localhost:9092

Producer for producing messages on a topic-
			bin\windows\kafka-console-producer.bat --topic use-topic --bootstrap-server localhost:9092
				
Consumer for consuming messages-
			bin\windows\kafka-console-consumer.bat --topic use-topic --from-beginning --bootstrap-server localhost:9092
