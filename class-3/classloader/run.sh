# Expected: classes compiled and run.
mkdir -p target
javac -sourcepath src -d target src/*.java
java -classpath target Main