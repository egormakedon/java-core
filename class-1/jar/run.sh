javac -d target Main.java
cd target
jar cvfe arch.jar Main *.class
java -jar arch.jar