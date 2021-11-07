# Expected: printed classes implement generic interface.
mkdir -p target
javac -d target Main.java
java -classpath target Main