# Expected: thread safe singleton with double checked locking.
mkdir -p target
javac -sourcepath src -d target src/*.java
java -classpath target Main