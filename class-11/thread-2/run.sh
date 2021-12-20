# Expected: thread created and started by another thread.
mkdir -p target
javac -d target Main.java
java -classpath target Main