# Expected: both classes compiled and put to a jar. Print "Hello, world!".
mkdir -p target
javac -d target Main.java
cd target
jar cvfe run.jar Main *.class
java -jar run.jar