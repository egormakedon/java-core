# Expected: java.lang.OutOfMemoryError: Java heap space.
mkdir -p target
javac -d target Main.java
java -classpath target Main