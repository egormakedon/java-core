# Expected: print first loaded library.
mkdir -p target
javac -classpath log4j-1.2.15.jar:log4j-1.2.17.jar -d target Main.java
# log4j-1.2.15.jar
java -classpath log4j-1.2.15.jar:log4j-1.2.17.jar:target Main
# log4j-1.2.17.jar
java -classpath log4j-1.2.17.jar:log4j-1.2.15.jar:target Main