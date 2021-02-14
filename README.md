# JAVAGAME

Having a Player class - an instance of this class with that can communicate with other Player(s) (other instances of this class)

The use case for this task is as bellow:

1. create 2 players

2. one of the players should send a message to second player (let's call this player "initiator")

3. when a player receives a message should send back a new message that contains the received message concatenated with the message counter that this player sent.

4. finalize the program (gracefully) after the initiator sent 10 messages and received back 10 messages (stop condition)

5. both players should run in the same java process (strong requirement)

6. document for every class the responsibilities it has.

7. opposite to 5: have every player in a separate JAVA process (different PID).

Please use pure Java as much as possible (no additional frameworks like spring, etc.)
Please deliver one single maven project with the source code only (no jars). Please send the maven project as archive attached to e-mail (eventual links for download will be ignored due to security policy).
Please provide a shell script to start the program.
Everything what is not clearly specified is to be decided by developer. Everything what is specified is a hard requirement.
Please focus on design and not on technology, the technology should be the simplest possible that is achieving the target.
The focus of the exercise is to deliver the cleanest and clearest design that you can achieve (and the system has to be functional).

Setup 

Install java-8-openjdk-amd64

add the path of openjdk

#shell script

nano .bashrc

add the script

export JAVA_HOME="/usr/lib/jvm/java-8-openjdk-amd64/"
export PATH=$PATH:$JAVA_HOME/bin


source ~/.bashrc

script to Check the directory added successfully

$JAVA_HOME


done! ready for test


Run
 mvn clean package
